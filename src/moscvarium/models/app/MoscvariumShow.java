package moscvarium.models.app;

import moscvarium.models.network.response.ResponseDatesDetail;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Inventor on 03.04.2017.
 */
public class MoscvariumShow {
  @NotNull
  private static final ThreadLocal<SimpleDateFormat> gatewayEventDateFormat = new ThreadLocal<SimpleDateFormat>() {
    @Override
    protected SimpleDateFormat initialValue() {
      return new SimpleDateFormat("yyyy-MM-ddHH:mm");
    }
  };
  @NotNull
  private static final ThreadLocal<SimpleDateFormat> serverEventDateFormat = new ThreadLocal<SimpleDateFormat>() {
    @Override
    protected SimpleDateFormat initialValue() {
      return new SimpleDateFormat("dd.MM.yyyy HH:mm");
    }
  };
  @NotNull
  private static final String venueName = "Москвариум";//Место проведения(уточнялось у них, сказали что всегда одно и тоже)
  @NotNull
  private static final String venueAddress = "г. Москва, проспект Мира, д.119, стр.23";//Адрес проведения(уточнялось у них, сказали что всегда одно и тоже)
  private final long id;//Идентификатор шоу
  @NotNull
  private final String date;//Дата и время проведения шоу
  @NotNull
  private final String typeName;//Тип представления(и вроде как название)
  @NotNull
  private final String hallName;//Название зала, в котором будет проводится шоу

  public MoscvariumShow(@NotNull ResponseDatesDetail.Show show) {
    id = show.Id;
    try {
      date = serverEventDateFormat.get().format(gatewayEventDateFormat.get().parse(show.Date + show.Time));
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    typeName = show.TypeName;
    hallName = show.HallName;
  }

  public long getId() {
    return id;
  }

  @NotNull
  public String getDate() {
    return date;
  }

  @NotNull
  public String getTypeName() {
    return typeName;
  }

  @NotNull
  public String getHallName() {
    return hallName;
  }

  @NotNull
  public static String getVenueName() {
    return venueName;
  }

  @NotNull
  public static String getVenueAddress() {
    return venueAddress;
  }

  @NotNull
  public String getStringViews() {
    return date + ", " + venueName + ", " + typeName;
  }

  @Override
  public String toString() {
    return "MoscvariumShow{" +
        "id=" + id +
        ", date='" + date + '\'' +
        ", typeName='" + typeName + '\'' +
        ", hallName='" + hallName + '\'' +
        ", venueName='" + venueName + '\'' +
        ", venueAddress='" + venueAddress + '\'' +
        '}';
  }
}
