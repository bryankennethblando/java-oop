package practice_h.hard;

abstract class character 
{

    protected String name;
    protected int health;

    character (String name, int health) {this.name = name; this.health = health;}

    abstract int attack(int enemyHealth);

    // getters
    String getName() {return name;}
    int getHealth() {return health;}
    abstract void characterInfo();

}
