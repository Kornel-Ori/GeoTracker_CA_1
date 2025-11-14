import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUtility {

    public static void getData() {
        ArrayList<String> countryParts
                = FileUtils.readDelimitedFile("src/main/country_samples.csv", ',');

        if(countryParts == null)
            return;

        if(countryParts.isEmpty())
            return;

        System.out.println("Read " + countryParts.size() + " entries.");
        System.out.println(countryParts);
    }

    public static ArrayList<Country> readCountryFields() {
        ArrayList<String> listData = FileUtils.readDelimitedFile("src/main/country_samples.csv", ',');

        if (listData == null || listData.isEmpty()) return new ArrayList<>();

        ArrayList<Country> countries = new ArrayList<>();

        // Each country has 8 fields
        int fieldsPerCountry = 8;

        for (int i = 0; i + fieldsPerCountry - 1 < listData.size(); i += fieldsPerCountry) {
            try {
                String name = listData.get(i);
                String capital = listData.get(i + 1);
                int population = Integer.parseInt(listData.get(i + 2));
                boolean hasPort = Boolean.parseBoolean(listData.get(i + 3));
                double highestPoint = Double.parseDouble(listData.get(i + 4));
                float landArea = Float.parseFloat(listData.get(i + 5));
                LocalDateTime discoveredDate = LocalDateTime.parse(listData.get(i + 6));
                LocalDate foundedDate = LocalDate.parse(listData.get(i + 7));

                Country country = new Country(
                        name, capital, population, hasPort,
                        highestPoint, landArea, discoveredDate, foundedDate
                );

                countries.add(country);

            } catch (Exception e) {
                System.out.println("Skipping invalid country record at index " + i);
            }
        }

        return countries;
    }
    public void getinput() {
        Scanner keyboard = new Scanner(System.in);

    }


}
