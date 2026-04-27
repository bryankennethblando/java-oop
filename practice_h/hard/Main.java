package practice_h.hard;

public class Main 
{
    public static void main(String[] args) 
    {
        Vehicle rentalTruck, rentalCar;
        
        rentalTruck = new Truck("8-wheeler Truck", "Honda-2020", 350.78, 5);
        rentalCar = new Car("Sportscar", "Porche-2024", 450.76, 3);

        // printing the overall recipt of the object
        rentalCar.vehichleInformation();
        rentalTruck.vehichleInformation();
    }    
}
