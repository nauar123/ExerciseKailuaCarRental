import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kailua car rental");
            System.out.println("1. Insert customer");
            System.out.println("2. Delete customer");
            System.out.println("3. Update");
            System.out.println("4. Exit program");
            System.out.println("Vælg  en mulighed:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1: {
                    System.out.println("Insert the customers id:");
                    String customersId = scanner.nextLine();
                    System.out.println("Insert the customers name:");
                    String name = scanner.nextLine();
                    System.out.println("Insert the customers address:");
                    String address = scanner.nextLine();
                    System.out.println("Insert the customers zipcode:");
                    String zipCode = scanner.nextLine();
                    System.out.println("Insert the customers city:");
                    String city = scanner.nextLine();
                    System.out.println("Insert the customers phonenumber:");
                    int phoneNr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert the customers email:");
                    String email = scanner.nextLine();
                    System.out.println("Insert the customers driver licence number:");
                    int driverLicenceNr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert the customers date of when he got the driver licence:");
                    LocalDate driverSince = LocalDate.parse(scanner.next());
                    break;
                }
                    case 2: {





                    }
            }
        }
    }
}