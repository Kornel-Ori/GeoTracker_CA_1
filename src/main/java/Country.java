import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

    public class Country {

        //region Fields
        private String name;
        private String capital;
        private int population;
        private boolean hasPort;
        private double highestPoint;
        private float landArea;
        private LocalDateTime discoveredDate;
        private LocalDate foundedDate;
        //endregion

        //region Constructors
        public Country(String name, String capital, int population, boolean hasPort, double highestPoint, float landArea, LocalDateTime discoveredDate, LocalDate foundedDate) {
            this.name = name;
            this.capital = capital;
            this.population = population;
            this.hasPort = hasPort;
            this.highestPoint = highestPoint;
            this.landArea = landArea;
            this.discoveredDate = discoveredDate;
            this.foundedDate = foundedDate;
        }
        //endregion

        //region Getters & Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Country name cannot be blank");
            }
            this.name = name.trim();
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            if (capital == null || capital.trim().isEmpty()) {
                throw new IllegalArgumentException("Country name cannot be blank");
            }
            this.capital = capital.trim();
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            if (population < 0) {
                throw new IllegalArgumentException("Population cannot be negative");
            }
            this.population = population;
        }

        public boolean isHasPort() {
            return hasPort;
        }

        public void setHasPort(boolean hasPort) {
            if (hasPort) {
                this.hasPort = true;
            }
            this.hasPort = hasPort;
        }

        public double getHighestPoint() {
            return highestPoint;
        }

        public void setHighestPoint(double highestPoint) {
            if (highestPoint < 0) {
                throw new IllegalArgumentException("Highest point cannot be negative");
            }
            this.highestPoint = highestPoint;
        }

        public float getLandArea() {
            return landArea;
        }

        public void setLandArea(float landArea) {
            if (landArea < 1) {
                throw new IllegalArgumentException("Landage area cannot be 0 or negative");
            }
            this.landArea = landArea;
        }

        public LocalDateTime getDiscoveredDate() {
            return discoveredDate;
        }

        public void setDiscoveredDate(LocalDateTime discoveredDate) {
            if (discoveredDate == null) {
                throw new IllegalArgumentException("Discovered Date cannot be null");
            }
            this.discoveredDate = discoveredDate;
        }

        public LocalDate getFoundedDate() {
            return foundedDate;
        }

        public void setFoundedDate(LocalDate foundedDate) {
            if (foundedDate == null) {
                throw new IllegalArgumentException("Founded Date cannot be null");
            }
            this.foundedDate = foundedDate;
        }
        //endregion



        //region Overrides
        @Override
        public String toString() {
            return "Country{" +
                    "countryName='" + name + '\'' +
                    ", countryCapital='" + capital + '\'' +
                    ", countryPopulation=" + population +
                    ", hasPort=" + hasPort +
                    ", highestPoint=" + highestPoint +
                    ", landArea=" + landArea +
                    ", discoveredDate=" + discoveredDate +
                    ", foundedDate=" + foundedDate +
                    '}';
        }
        //endregion

        public static void getInputFile() throws FileNotFoundException {
            File inputFile = new File("Country_Samples.csv");

            //Allow read data from file
            Scanner input = new Scanner(inputFile);

            ArrayList<String> countries = new ArrayList<>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
            }
        }


    }

