package lections_exercises07;

public class Mage extends Hero {
    static String name;
    static int health = 110;
    int damage = 20;

    @Override
    public String getName(String name) {
        this.name = name;
        return name;
    }
    @Override
    public void attackEnemy(String enemyName) {
        if (enemyName.equals("Zombie")) {
            System.out.println(name + " пронзает клинком врага," + " наносит ему " + damage + " баллов урона");
            if (Zombie.health>=0) {
                System.out.println("У зомби остается " + Zombie.takeDamage(damage) + " баллов здоровья");
            } else {
                System.out.println("Зомби мертв");
            }
        } else {
            System.out.println(name + " пронзает клинком врага," + " наносит ему " + damage + " баллов урона");
            if (Dragon.health>=0) {
                System.out.println("У дракона остается " + Dragon.takeDamage(damage) + " баллов здоровья");
            } else {
                System.out.println("Дракон мертв");
            }

        }
    }

    @Override
    public void attackEnemy(String enemyName, String enemyName2) {
        System.out.println("Маг " + name + " протыкает мечом зомби насквозь, затем задевает дракона");
        if (Zombie.health>=0) {
            System.out.println("У зомби остается " + Zombie.takeDamage(damage) + " баллов здоровья");
        } else {
            System.out.println("Зомби мертв");
        }
        if (Dragon.health>=0) {
            System.out.println("У дракона остается " + Dragon.takeDamage(damage) + " баллов здоровья");
        } else {
            System.out.println(" Дракон мертв");
        }
    }
    public Mage(String name) {
        this.name = name;
    }
    public static int takeDamage(int damage) {
        return health -= damage;
    }
    public static boolean isMageAlive(){
        if(health>0){
            return true;
        }
        return false;
    }
}