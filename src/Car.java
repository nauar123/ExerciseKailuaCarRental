public class Car {

    private String brand;
    private String model;
    private String fuelType;
    private String regNr;
    private int  firstRegYear;
    private int firstRegMonth;
    private int odometer;
    private String carType;

    public Car(String brand,String model,String fuelType,String regNr, int firstRegYear, int firstRegMonth, int odometer, String carType)
    {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.regNr = regNr;
        this.firstRegYear = firstRegYear;
        this.firstRegMonth = firstRegMonth;
        this.odometer = odometer;
        this.carType = carType;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public String getRegNr()
    {
        return regNr;
    }

    public int getFirstRegYear()
    {
        return firstRegYear;
    }

    public int  getFirstRegMonth()
    {
        return firstRegMonth;
    }

    public int getOdometer()
    {
        return odometer;
    }
    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }

    public String getCarType()
    {
        return carType;
    }

    public String toString()
    {
        return
        "The cars brand:" + brand + "\n" +
        "The cars model:" + model + "\n" +
        "The cars fueltype:" + fuelType + "\n" +
        "The cars regretationsnumber:" + regNr + "\n" +
        "The cars first regerations year:" + firstRegYear + "\n" +
        "The cars first regrations month:" + firstRegMonth + "\n" +
        "The cars odometer:" + odometer + "\n" +
        "The cars carType:" + carType + "\n";
    }
}
