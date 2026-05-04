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
        warrior hero = new warrior("Hauzz_the_Great", 130);
        mage magician = new mage("Slazz_the_Nerd", 100);

        // creating a list of enemies for my character to fight
        ArrayList<enemy> enemyList = new ArrayList<>();
        enemyList.add(new enemy("goblin", 50));
        enemyList.add(new enemy("golem", 100));
        enemyList.add(new enemy("dragon", 150));

        // intializing the health of the character
        int heroHealth = hero.getHealth();
        int mageHealth = magician.getHealth();

        for (int i = 0; i < enemyList.size(); i++)
        {
            // grabing the current enemy where fighting
            enemy currentEnemy = enemyList.get(i);

            // intializing the health for the enemy
            int enemyHealth = currentEnemy.getHealth();

            System.out.println("-----Round " + round + "-----");
            if (i == 0) {System.out.println("The first enemy appears: " + currentEnemy.getName() + "!!!!");}
            else if (i == 1) {System.out.println("The second enemy appears: " + currentEnemy.getName() + "!!!!");} 
            else if (i == 2) {System.out.println("The final boss appears: " + currentEnemy.getName() + "!!!!");}
            

            // the battle loop
            while ((heroHealth> 0 || mageHealth > 0) && enemyHealth > 0)
            {   
                // attack turns for the warrior and mage
                if (counter % 2 == 0 && heroHealth > 0)
                {
                    System.out.println("Warrior's turn to attack");
                    enemyHealth = hero.attack(enemyHealth);
                }
                else if (counter % 2 == 1 && mageHealth > 0)
                {
                    System.out.println("Mage's turn to attack");
                    enemyHealth = magician.attack(enemyHealth);
                }

                // attack turn for the enemy
                if (enemyHealth > 0)
                {   
                   
                    // for attacking the warrior
                    if (counter % 2 == 0 && enemyHealth > 0)
                    {
                        if (heroHealth > 0)
                        {
                            System.out.println("Enemy attack's the Warrior");
                            heroHealth = currentEnemy.attack(heroHealth);   
                        }
                    }
                    else if (counter % 2 == 1 && enemyHealth > 0)
                    {
                        if (mageHealth > 0)
                        {
                            System.out.println("Enemy attack's the Mage");
                            mageHealth = currentEnemy.attack(mageHealth);
                        }
                        
                    }    
                }

                // checking the stats
                System.out.println("Health Status -> Warrior: " + heroHealth +
                    "|| Mage: " + mageHealth + " " +
                    "|| " + currentEnemy.getName()+ ": " + enemyHealth + " "
                );

                // counter for every completes turn
                counter++;
            }
            
            // if the character or the hero died
            System.out.println("Round: " + counter);
            if (heroHealth <= 0 && mageHealth <= 0) {break;}
            else if (heroHealth <= 0) {System.out.println("The hero " + hero.getName() + " has fallen");}
            else if (mageHealth <= 0) {System.out.println("The magician " + magician.getName() + " has fallen");}
            else {System.out.println("The enemy " + currentEnemy.getName() + " has fallen"); round++;}
        }
        
        // victory check
        if (heroHealth > 0 || mageHealth > 0) {System.out.println("Congratulations you cleared the gauntlet");}
        else {System.out.println("Sorry you failed the conquest.....");}
    }
}
