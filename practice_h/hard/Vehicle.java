package practice_h.hard;

public class Vehicle 
{
    protected String make;
    protected String model;
    protected double baseRentalBase;
    protected int rentHour;
    protected  double total_rate;
   
    
    Vehicle (String make, String model, double baseRentalBase, int rentHour)
    {
        this.make = make;
        this.model = model;
        this.baseRentalBase = baseRentalBase;
        this.rentHour = rentHour;
    }

    // times the rate to the hour they rent it
    protected String calculateDailyRate()
    {
        total_rate =  baseRentalBase * rentHour;
        return String.format("%.2f", total_rate);
    }

    // getters
    void vehichleInformation()
    {
        System.out.println("Vehicle Type: " + make +
            "\nModel: " + model +
            "\nRental Rate: " + baseRentalBase +
            "\nTatal Rented Hour: " + rentHour
        );
    }

    
}
