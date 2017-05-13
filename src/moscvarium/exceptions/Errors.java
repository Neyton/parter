package moscvarium.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Errors {
    Map<Integer, String> errors = new HashMap<>();

    public Errors() {
        try (FileReader fileReader = new FileReader("errors.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] split = line.split("\\t");
                errors.put(Integer.valueOf(split[0]), split[1]);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
