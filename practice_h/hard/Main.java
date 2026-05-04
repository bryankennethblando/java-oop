package practice_h.hard;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        // counter for the round of each fight
        int round = 1;
        int counter = 1;

        //creating my character: my warrio and mage
        warrior hero = new warrior("Hauzz_the_Great", 100);
        mage magician = new mage("Slazz_the_Nerd", 50);

        // creating a list of enemies for my character to fight
        ArrayList<enemy> enemyList = new ArrayList<>();
        enemyList.add(new enemy("goblin", 50));
        enemyList.add(new enemy("golem", 150));
        enemyList.add(new enemy("dragon", 200));

        for (int i = 0; i < enemyList.size(); i++)
        {
            // grabing the current enemy where fighting
            enemy currentEnemy = enemyList.get(i);

            System.out.println("-----Round " + round + "-----");
            System.out.println("The first enemy appears: " + currentEnemy.getName() + "!!!!");

            // the battle loop
            if (counter % 2 == 1)
            {
                // for warrior turn
                while (hero.getHealth() > 0 && currentEnemy.getHealth() > 0) 
                {
                    hero.attack(currentEnemy.getHealth());

                    if (currentEnemy.getHealth() > 0)
                    {
                        currentEnemy.attack(hero.getHealth());
                    }

                    System.out.println("Current Health: " +
                        "\nHero: " + hero.getHealth() + 
                        "\nEnemy: " + currentEnemy.getHealth()
                    );

                    // every end of the round is added to counter
                    // for charater turning
                    counter++;
                }
            }
            else 
            {
                // for mage turn
                while (magician.getHealth() > 0 && currentEnemy.getHealth() > 0) 
                {
                    magician.attack(currentEnemy.getHealth());

                    if (currentEnemy.getHealth() > 0)
                    {
                        currentEnemy.attack(magician.getHealth());
                    }

                    System.out.println("Current Health: " +
                        "\nMage: " + magician.getHealth() + 
                        "\nEnemy: " + currentEnemy.getHealth()
                    );

                    // every end of the round is added to counter
                    // for charater turning
                    counter++;
                }
            }
            
            // if the character or the hero died
            System.out.println("Round: " + counter);
            if (hero.getHealth() <= 0) {System.out.println("The hero " + hero.getName() + " has fallen");}
            else if (magician.getHealth() <= 0) {System.out.println("The magician " + magician.getName() + " has fallen");}
            else {System.out.println("The enemy " + currentEnemy.getName() + " has fallen");}
        }
        
        // victory check
        if (hero.getHealth() > 0 && magician.getHealth() > 0) {System.out.println("Congratulations you cleared the gauntlet");}
        else {System.out.println("Sorry you failed the conquest.....");}
    }
}
