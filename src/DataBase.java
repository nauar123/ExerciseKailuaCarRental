import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    Connection connection;

    public DataBase() {
        try {
                String url = "jdbc:mysql://localhost:3306/carRental"; // hvor min database ligger henne
                String user = "root"; // brugernavnet til min database
                String password = "Aesar1974!"; // min kode
                connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace(); //  Hvis der opstår en SQLException, fanges fejlen, og e.printStackTrace(); udskriver fejlen i konsollen.
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) { // sørger for at forbindelsen lukkes, hvis den eksisterer og ikke allerede er lukket.
                connection.close(); // lukker forbindelsen

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() { // så den kan hentes i andre klasser
        return connection;
    }
}