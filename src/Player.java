public class Player {
    private String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public Player(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage){
        if(damage < 0){
            return;
        }

        health -= damage;

        if(health < 0){
            health = 0;
        }
    }
}



