/*
Создать классы Warrior, Mage и Archer, представляющие собой
наследников класса Hero
Переопределить в них метод attackEnemy() для вывода
специализированного для этого класса сообщения об атаке.
Переопределить метод в подклассах Warrior,Mage и
Archer так, чтобы каждый герой наносил врагу разное количество урона.
 */
package lections_exercises7;

public class Archer extends Hero {
    static String name;
    static int health=110;
    static int damage = 10;
    @Override
    public void attackEnemy(String enemyName) {
        if(enemyName.equals("Zombie")){
            System.out.println(name + " попадает во врага стрелой," + "наносит ему " + damage + " баллов урона");
            if (Zombie.isAlive()) {
                System.out.println("У зомби осталось " + Zombie.takeDamage(damage) + " баллов здоровья");
            } else {
                System.out.println("Зомби мертв");
            }
        } else {
            System.out.println(name + " попадает во врага стрелой," + "наносит ему " + damage + " баллов урона");
            if (Dragon.isAlive()) {
                System.out.println("У дракона осталось " + Dragon.takeDamage(damage) + " баллов здоровья");
            } else {
                System.out.println("Дракон мертв");
            }
        }
    }
    @Override
    public void attackEnemy(String enemyName, String enemyName2) {
        System.out.println("Стрелок " + name + " пускает в зомби стрелу, второй стрелой попадает дракону в глаз");
        if (Zombie.health>=0) {
            System.out.println("У зомби остается " + Zombie.takeDamage(damage) + " баллов здоровья");
        } else {
            System.out.println("Зомби мертв");
        }
        if (Dragon.health>=0) {
            System.out.println("У дракона остается " + Dragon.takeDamage(damage) + " баллов здоровья");
        } else{
            System.out.println(" Дракон мертв");
        }
    }
    public Archer(String name) {
        this.name = name;
    }
    public static int takeDamage(int damage) {
        return health -=damage;
    }
    public static boolean isArcherAlive(){
        if(health>0){
            return true;
        }
        return false;
    }
}
