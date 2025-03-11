import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Kailua Car Rental");
            System.out.println("1. Add Car");
            System.out.println("2. Delete Car");
            System.out.println("3. Update Car");
            System.out.println("4. List All Cars");
            System.out.println("5. Add Customer");
            System.out.println("6. Create Rental Contract");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1 -> Car.addCar();
                case 2 -> Car.deleteCar();
                case 3 -> Car.updateCar();
                case 4 -> Car.listCars();
                case 5 -> Customer.addCustomer();
                case 6 -> Customer.createRental();
            }
                default -> System.out.println("Invalid choice, try again.");
            }
    }
}

