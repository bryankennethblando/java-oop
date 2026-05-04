package practice_h.hard;

public class mage extends character
{
    private int attackDamage = 15;

    mage (String name, int health) {super(name, health);}

    @Override
    int attack(int enemyHealth)
    {
        return attackDamage - enemyHealth;
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
