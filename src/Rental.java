import java.time.LocalDateTime;

public class Rental {

    private int rentalId;
    private Customer customerId;
    private LocalDateTime fromDateTime;
    private LocalDateTime toDateTime;
    private int maxKm;
    private int odometerKmStart;
    private Car regNr;

    public Rental(int rentalId, Customer customerId, LocalDateTime fromDateTime, LocalDateTime toDateTime, int maxKm, int odometerKmStart, Car regNr)
    {
        this.rentalId = rentalId;
        this.customerId = customerId;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
        this.maxKm = maxKm;
        this.odometerKmStart = odometerKmStart;
        this.regNr = regNr;
    }

    public int getRentalId()
    {
        return rentalId;
    }

    public Customer getCustomerId()
    {
        return customerId;
    }

    public LocalDateTime getFromDateTime()
    {
        return fromDateTime;
    }
    public void setFromDateTime( LocalDateTime fromDateTime)
    {
        this.fromDateTime = fromDateTime;
    }

    public LocalDateTime getToDateTime()
    {
        return toDateTime;
    }
    public void setToDateTime( LocalDateTime toDateTime)
    {
        this.toDateTime = toDateTime;
    }

    public int getMaxKm()
    {
        return maxKm;
    }
    public void setMaxKm(int maxKm)
    {
        this.maxKm = maxKm;
    }

    public int getOdometerKmStart()
    {
        return odometerKmStart;
    }
    public void setOdometerKmStart(int odometerKmStart)
    {
        this.odometerKmStart = odometerKmStart;
    }

    public Car getRegNr()
    {
        return regNr;
    }

    public String toString()
    {
        return
          "Rental ID:" + rentalId + "\n" +
          "Customer ID:" + customerId + "\n" +
          "Rental day from date:" + fromDateTime + "\n" +
          "Rental day to date:" + toDateTime + "\n" +
          "Rentals max km" + maxKm + "\n" +
          "The cars Odometer start:" + odometerKmStart + "\n" +
          "The cars regerationsnumber:"  + regNr + "\n";

    }
}
