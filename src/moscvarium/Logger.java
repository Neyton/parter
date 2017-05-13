package moscvarium;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Предназначен для записи информации в журнал (лог) и полуения информации из
 * лога за период
 *
 * @author Maksim Ponomarev
 * @version 2.3.20160812
 */

public class Logger {
  private static final String separator = System.getProperty("line.separator");
  private static final ThreadLocal<DateFormat> datetimeFormat = new ThreadLocal<DateFormat>() {
    @Override
    protected DateFormat initialValue() {
      return new SimpleDateFormat("dd.MM.yy HH:mm:ss.SSS");
    }
  };
  private static final ThreadLocal<DateFormat> dateonlyFormat = new ThreadLocal<DateFormat>() {
    @Override
    protected DateFormat initialValue() {
      return new SimpleDateFormat("dd.MM.yy");
    }
  };
  private final File logFile;
  private final Charset charset;


  public Logger(File logFile) {
    this(logFile, Charset.defaultCharset());
  }

  public Logger(File logFile, Charset charset) {
    this.logFile = logFile;
    this.charset = charset;
    createPathToFile(logFile);
  }

  public synchronized void write(Object s) {
    write(s, null);
  }

  public synchronized void write(Object s, Throwable thr) {
    writeInternal(logFile, s, thr, charset);
  }

  public static synchronized void write(File file, Object s) {
    write(file, s, null);
  }

  public static synchronized void write(File file, Object s, Throwable thr) {
    writeInternal(file, s, thr, Charset.defaultCharset());
  }

  private static void writeInternal(File file, Object s, Throwable thr, Charset charset) {
    try {
      String stackTrace = "";
      if (thr != null) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        thr.printStackTrace(pw);
        stackTrace = sw.toString() + separator;
        pw.close();
      }
      OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(file, true), charset);
      fileWriter.write(getTime() + "|" + s + separator + stackTrace);
      fileWriter.close();
    } catch (FileNotFoundException ex) {
      System.err.println(ex.toString());
      System.out.println(getTime() + "|" + s);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static synchronized StringReader read(File file) throws IOException {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    BufferedReader in = new BufferedReader(new FileReader(file));
    while ((str = in.readLine()) != null) {
      stringBuilder.append(str).append(separator);
    }
    in.close();
    return new StringReader(stringBuilder.toString());
  }

  public static synchronized StringReader read(File file, Date from) throws IOException {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    String fromMark = dateonlyFormat.get().format(from);
    BufferedReader in = new BufferedReader(new FileReader(file));
    while ((str = in.readLine()) != null) {
      if (str.startsWith(fromMark)) break;
    }
    if (str != null) stringBuilder.append(str).append(separator);
    while ((str = in.readLine()) != null) {
      stringBuilder.append(str).append(separator);
    }
    in.close();
    return new StringReader(stringBuilder.toString());
  }

  public static synchronized StringReader read(File file, Date from, Date to) throws IOException {
    String str;
    GregorianCalendar toCal = new GregorianCalendar();
    toCal.setTime(to);
    toCal.add(Calendar.DATE, 1);
    StringBuilder stringBuilder = new StringBuilder();
    String fromMark = dateonlyFormat.get().format(from);
    String toMark = dateonlyFormat.get().format(toCal.getTime());
    BufferedReader in = new BufferedReader(new FileReader(file));
    while ((str = in.readLine()) != null) {
      if (str.startsWith(fromMark)) break;
    }
    if (str != null) stringBuilder.append(str).append(separator);
    while ((str = in.readLine()) != null) {
      if (str.startsWith(toMark)) break;
      stringBuilder.append(str).append(separator);
    }
    in.close();
    return new StringReader(stringBuilder.toString());
  }

  @SuppressWarnings("ResultOfMethodCallIgnored")
  public static synchronized void delete(File file, Date before) throws IOException {
    File tempFile = new File(file.getAbsolutePath() + ".tmp");
    try {
      fileCopy(file, tempFile);
    } catch (IOException ex) {//если такого файла нет, то ничего не делаем
      return;
    }
    String str;
    String beforeMark = dateonlyFormat.get().format(before);
    BufferedReader in = new BufferedReader(new FileReader(tempFile));
    while ((str = in.readLine()) != null) {
      if (str.startsWith(beforeMark)) break;
    }
    if (str != null) { //если есть такая дата, то удаляем лог и пишем в него заново
      FileWriter out = new FileWriter(file, false);
      out.write(str + separator);
      while ((str = in.readLine()) != null) {
        out.write(str + separator);
      }
      out.close();
    }
    in.close();
    tempFile.delete();
  }

  @SuppressWarnings("ResultOfMethodCallIgnored")
  public static void createPathToFile(File file) {
    if (file.isDirectory()) return;
    File parent = file.getParentFile();
    if (parent != null) parent.mkdirs();
  }

  private static String getTime() {
    return datetimeFormat.get().format(new Date());
  }

  //Копирование файла без подтверждения
  @SuppressWarnings("ResultOfMethodCallIgnored")
  private static void fileCopy(File input, File output) throws IOException {
    output.mkdirs();
    if (output.exists()) output.delete();
    FileChannel in = new FileInputStream(input).getChannel();
    FileChannel out = new FileOutputStream(output).getChannel();
    in.transferTo(0, in.size(), out);
    in.close();
    out.close();
  }
}
