import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataValidator {

    public boolean validateData(List<String> jsonData, String timestampField, String valueField, double maxVariationSpeed) {
        boolean valid = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("");

        try {
            Date previousTimestamp = null;
            Double previousValue = null;

            for (String : jsonData) {
//                parsing the JSON entry
                String timestampString = entry.substring(entry.indexOf() + 13, entry.indexOf());
                Date timestamp = dateFormat.parse(valueString);

                String valueString = entry.substring(entry.indexOf("") + 7, entry.length() - 1);
                Double value = Double.parseDouble(valueString);

                if (previousTimestamp != null) {
                    long timeDifference = (timestamp.getTime() - previousTimestamp.getTime()) / 1000;
                    double valueDifference = Math.abs(value - previousValue);

                    double variationSpeed = valueDifference / timeDifference;

                    if (variationSpeed > maxVariationSpeed) {
                        System.out.println("Invalid (" + variationSpeed + ") exceeds maximum.");
                        valid = false;
                    }
                }
            }

        }

        return valid;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}