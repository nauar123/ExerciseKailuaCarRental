import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Customer {

    private int customerId;
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private int phoneNr;
    private String email;
    private int driverLicenceNr;
    private LocalDate driverSince;

    // DB constants
    private static final String URL = "jdbc:mysql://localhost:3306/YOUR_DATABASE";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public Customer(int customerId, String name, String address, String zipCode, String city, int phoneNr, String email, int driverLicenceNr, LocalDate driverSince) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phoneNr = phoneNr;
        this.email = email;
        this.driverLicenceNr = driverLicenceNr;
        this.driverSince = driverSince;
    }

    // Getters
    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getZipCode() { return zipCode; }
    public String getCity() { return city; }
    public int getPhoneNr() { return phoneNr; }
    public String getEmail() { return email; }
    public int getDriverLicenceNr() { return driverLicenceNr; }
    public LocalDate getDriverSince() { return driverSince; }

    // Method to create rental
    public static void createRental() {
        Scanner scanner = new Scanner(System.in); //bruges til at få input fra brugeren, som spørger om registreringsnummeret på en bil og kundens navn.

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) { // Denne linje forsøger at oprette en forbindelse til MySQL-databasen, gennem min url brugernavn og kode.
            System.out.print("Enter car registration number: ");
            String regNr = scanner.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            String sql = "INSERT INTO rentals (car_id, customer_id, start_date) " +
                    "VALUES ((SELECT id FROM cars WHERE registration_number = ?), " +
                    "(SELECT id FROM customers WHERE name = ?), CURDATE())";
            // Det er en SQL-sætning, der bliver lavet til at indsætte en ny lejeaftale i tabellen rentals

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, regNr);
            stmt.setString(2, customerName);
            stmt.executeUpdate();

            System.out.println("Rental contract created!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // scanner.close(); // Optional: if you are done using scanner
    }

    @Override
    public String toString() {
        return "Customer id: " + customerId + "\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Zipcode: " + zipCode + "\n" +
                "City: " + city + "\n" +
                "Phone number: " + phoneNr + "\n" +
                "Email: " + email + "\n" +
                "Driver licence number: " + driverLicenceNr + "\n" +
                "Driver since: " + driverSince + "\n";
    }
}
