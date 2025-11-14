import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private ArrayList<Country> countries = new ArrayList<>();

    public static void main(String[] args) {

        Main app = new Main();
        app.run();
    }
    public void run() {




        displayMainMenu();
        // 1 = t01 Arrays, 10 = t01 Challenge Exercises, 2 = t02 Ordering
        int selection = getMenuInput(); // <— set which block to run
        do{

            switch (selection) {
                case 1:
                    System.out.println("******************** Display All Countries ******************" + getIcon() + "\n");
                    displayCountries();
                    break;

                case 2:
                    System.out.println("******************** Sort Countries ********************\n");

                    break;

                case 3:
                    System.out.println("******************** Challenge Exercises ********************\n");

                    break;

                case 4:
                    System.out.println("******************** Topic:t02 ********************\n");

                    break;

                case 5:
                    System.out.println("******************** Challenge Exercises ********************\n");

                    break;
                default:
                    System.out.println("No matching topic block for selection: " + selection);
                    break;
            }
        }while (selection >= 4);

    }
    public int getMenuInput() {
        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        return choice;

    }
    public String getIcon() {
        String icon = "⬇";
        return icon;
    }

    public String lineLow() {
        String lineLow = "";
        for (int i = 0; i < 65; i++) {
            lineLow += "_";
        }
        return lineLow;
    }

    public String lineHigh() {
        String lineHigh = "";
        for (int i = 0; i < 65; i++) {
            lineHigh += "‾";
        }
        return lineHigh;
    }
    public void displayMainMenu() {

        System.out.println("\n\nWelcome to Countries Database!");
        System.out.println("\nChoose a number below selection: " + getIcon());
        System.out.println(lineLow());
        System.out.println("|1 - Display All Countries\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|2 - Sort - Display All Continents\t\t\t\t\t\t\t\t|");
        System.out.println("|3 - Delete - Display All Continents\t\t\t\t\t\t\t|");
        System.out.println("|4 - Modify - Display All Countries\t\t\t\t\t\t\t\t|");
        System.out.println("|5 - Add - Display All Continents\t\t\t\t\t\t\t\t|");
        System.out.println("|6 - Search - All Records\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|7 - Exit\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println(lineHigh());
        System.out.println();
    }

    public void displayCountries() {
        countries = ArrayUtility.readCountryFields(); // assign returned list
        System.out.println("Loaded " + countries.size() + " countries.");

        for (Country c : countries) {
            System.out.println(c);
        }
    }

    public void displaySubMenu() {

        System.out.println("\t" + lineLow());
        System.out.println("\t|1 - Capital City\t\t\t\t\t\t|");
        System.out.println("\t|2 - Population\t\t\t\t\t\t\t|");
        System.out.println("\t|3 - Size\t\t\t\t\t\t\t|");
        System.out.println("\t|4 - Density\t\t\t\t\t\t\t|");
        System.out.println("\t|5 - Back to Continents\t\t\t\t\t\t|");
        System.out.println("\t" + lineHigh());

    }
    public void getinput() {
        Scanner keyboard = new Scanner(System.in);

    }
}