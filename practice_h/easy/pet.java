package practice_h.easy;

public class pet 
{
    private String classification;
    private String name;
    private int hungerLevel;
    private int happinessLevel;
    
    private boolean needToEat (int hungerLevel) { return hungerLevel <= 4; }
    private boolean petHappy (int happinessLevel) { return happinessLevel <= 5; }

    // constructor of the class pet
    pet (String classification, String name, int hungerLevel, int happinessLevel)
    {
        this.classification = classification;
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
    }

    private void pet_checker()
    {
        if (needToEat(hungerLevel) && petHappy(happinessLevel))
        {
            System.out.println("\n" + name + " is hungry! and not happy");
        }
        else
        {
            System.out.println("\n" + name + " is full and happy, good job!");
        }
    }
    // methods to increase the happinesslevel and decrease the hungerlevel of their pet
    void fed() { hungerLevel -= 1; }
    void play() { happinessLevel += 1;}

    // getters
    String info()
    {
        pet_checker();
        return "Classification: " + classification +
        ", Name: " + name +
        ", Hunger Level: " + hungerLevel +
        ", Happiness Level: " + happinessLevel;
    }
}
