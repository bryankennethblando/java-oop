package practice_h.hard;

class Truck extends Vehicle
{
    Truck(String make, String model, double baseRentalBase, int rentHour)
    { super(make, model, baseRentalBase, rentHour); }

    @Override
    void vehichleInformation()
    {
        System.out.println("Vehicle Type: " + make +
            "\nModel: " + model +
            "\nRental Rate: " + baseRentalBase +
            "\nTatal Rented Hour: " + rentHour +
            "\nTotal Rate: " + super.calculateDailyRate() + 400 // adding a fare rate of 400 for every truck rental
            + "\n"
        );
    }
}
