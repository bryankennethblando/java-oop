package practice_h.hard;

public class warrior extends character
{
    private int attackDamage = 10;

    warrior (String name, int health) {super(name, health);}

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
