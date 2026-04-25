package practice_h.easy;

import java.util.ArrayList;

class Main
{
    public static void main (String[] args)
    {
        // the traditional way of creating an object
        /*
             pet chimpanzee = new pet("mySlave", 6, 1);
            
            but what if you want to create another object
            then you repeat the same process right and
            write a more line of code but does the same.
            kinda annoying right
        */

        // by mimicking the list on python we can write objects and
        // accessed it's attributes is less lines and also much clean to read
        ArrayList<pet> my_pets = new ArrayList<>();

        my_pets.add(new pet("chimpanzee", "mySlave", 5, 9));
        my_pets.add(new pet("cat", "theupernam", 4, 5));

        // printing the information my pets
        for (pet pet_info : my_pets)
        {
            pet_info.info();
        }

        // feeding and playing with pet
        // first pet
        my_pets.get(0).fed();
        my_pets.get(0).play();

        // second pet
        //first pet
        my_pets.get(1).fed();
        my_pets.get(1).play();

        for (pet pet_info : my_pets)
        {
            pet_info.info();
        }
    }
}