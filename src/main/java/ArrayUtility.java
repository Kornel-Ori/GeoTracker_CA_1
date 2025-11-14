import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

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

    public static ArrayList<Country> loadCountries(String filePath) {
        ArrayList<String> flatData = FileUtils.readDelimitedFile(filePath, ',');

        if (flatData == null || flatData.isEmpty()) return new ArrayList<>();

        ArrayList<Country> countries = new ArrayList<>();

        // Each country has 8 fields
        int fieldsPerCountry = 8;

        for (int i = 0; i + fieldsPerCountry - 1 < flatData.size(); i += fieldsPerCountry) {
            try {
                String name = flatData.get(i);
                String capital = flatData.get(i + 1);
                int population = Integer.parseInt(flatData.get(i + 2));
                boolean hasPort = Boolean.parseBoolean(flatData.get(i + 3));
                double highestPoint = Double.parseDouble(flatData.get(i + 4));
                float landArea = Float.parseFloat(flatData.get(i + 5));
                LocalDateTime discoveredDate = LocalDateTime.parse(flatData.get(i + 6));
                LocalDate foundedDate = LocalDate.parse(flatData.get(i + 7));

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

}
