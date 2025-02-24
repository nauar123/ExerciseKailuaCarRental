import java.time.LocalDate;

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

    public Customer(int customerId, String name, String address,String zipCode,String city, int phoneNr,String email, int driverLicenceNr, LocalDate driverSince)
    {
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

    public int getCustomerId()
    {
        return customerId;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public String getCity()
    {
        return city;
    }

    public int getPhoneNr()
    {
        return phoneNr;
    }

    public String getEmail()
    {
        return email;
    }

    public int getDriverLicenceNr()
    {
        return driverLicenceNr;
    }

    public LocalDate getDriverSince()
    {
        return driverSince;
    }

    public String toString()
    {
        return
                "Customers id:"  + customerId + "\n" +
                "Customers name:"  + name + "\n" +
                "Customers address:"  + address + "\n" +
                "Customers zipcode:"  + zipCode+ "\n" +
                "Customers city:"  + city + "\n" +
                "Customers phonenumber:" + phoneNr + "\n" +
                "Customers email:"  + email + "\n" +
                "Customers driver licence number:"  + driverLicenceNr + "\n" +
                "Customers driver since:"  + driverSince + "\n";
    }
}
