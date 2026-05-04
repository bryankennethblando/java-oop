package practice_h.hard;

public class enemy extends character
{
    protected int attackDamage = 10;

    enemy (String name, int health) {super(name, health);}

    @Override
    int attack(int target)
    {
        return target - attackDamage;
    }   

    @Override
    void characterInfo()
    {
        System.out.println("Character Name: " + name +
            "\nHealth Bar: " + health +
            "\nAttack Damage: " + attackDamage
        );
    }
}
