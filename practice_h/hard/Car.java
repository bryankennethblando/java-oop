package practice_h.hard;

class Car extends Vehicle
{
    Car (String make, String model, double baseRentalBase, int rentHour)
    { super(make, model, baseRentalBase, rentHour); }    

    
    @Override
    void vehichleInformation()
    {
        System.out.println("Vehicle Type: " + make +
            "\nModel: " + model +
            "\nRental Rate: " + baseRentalBase +
            "\nTatal Rented Hour: " + rentHour +
            "Total Rate: " + super.calculateDailyRate() + 200 // adding a fare of 200 for every car rent
            + "\n"
        );

        
    }
}
