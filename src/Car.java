import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Car {

    private String brand;
    private String model;
    private String fuelType;
    private String regNr;
    private int firstRegYear;
    private int firstRegMonth;
    private int odometer;
    private String carType;

    public Car(String brand, String model, String fuelType, String regNr, int firstRegYear, int firstRegMonth, int odometer, String carType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.regNr = regNr;
        this.firstRegYear = firstRegYear;
        this.firstRegMonth = firstRegMonth;
        this.odometer = odometer;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getRegNr() {
        return regNr;
    }

    public int getFirstRegYear() {
        return firstRegYear;
    }

    public int getFirstRegMonth() {
        return firstRegMonth;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getCarType() {
        return carType;
    }

    // Modify the addCar method to accept a Car object as a parameter
    public static void addCar(Car car) {
        String sql = "INSERT INTO cars (brand, model, fuel_type, registration_number, first_registration_year, first_registration_month, odometer, car_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = new DataBase().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, car.getBrand());
            stmt.setString(2, car.getModel());
            stmt.setString(3, car.getFuelType());
            stmt.setString(4, car.getRegNr());
            stmt.setInt(5, car.getFirstRegYear());
            stmt.setInt(6, car.getFirstRegMonth());
            stmt.setInt(7, car.getOdometer());
            stmt.setString(8, car.getCarType());

            stmt.executeUpdate(); // Executes the SQL statement

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "The car's brand: " + brand + "\n" +
                "The car's model: " + model + "\n" +
                "The car's fuel type: " + fuelType + "\n" +
                "The car's registration number: " + regNr + "\n" +
                "The car's first registration year: " + firstRegYear + "\n" +
                "The car's first registration month: " + firstRegMonth + "\n" +
                "The car's odometer: " + odometer + "\n" +
                "The car's type: " + carType + "\n";
    }
}
