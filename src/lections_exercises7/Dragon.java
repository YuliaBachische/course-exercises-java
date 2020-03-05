/*
Подкласс класса Enemy
 */
package lections_exercises7;

public class Dragon extends Enemy {
    static int health = 200;
    static int strength = 50;
    @Override
    public void attackEnemy(int damage) {
        this.health -= damage;
    }
    public Dragon() {
        super();
    }
    public static int takeDamage(int damage) {
        return health -= damage;
    }
    public static boolean isAlive() {
        if (health < 0) {
            return false;
        }
        return true;
    }
    static public boolean isHeroAlive() {
        if (Hero.healthHero < 0) {
            return false;
        }
        return true;
    }
    @Override
    public void attackHero(String name) {
        if (name.equals("Archer")) {
            if (Archer.health > 0) {
                System.out.println("Dragon  наносит " + Archer.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Archer.takeDamage(strength) + " баллов здоровья");
            }
            if ((Archer.health == 0) || (Archer.health < 0))
                System.out.println("Вы проиграли");
        }
        if (name.equals("Mage")) {
            if (Mage.health > 0) {
                System.out.println("Dragon  наносит " + Mage.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Mage.takeDamage(strength) + " баллов здоровья");
            }
            if ((Mage.health == 0) || (Mage.health < 0)) {
                System.out.println("Вы проиграли");
            }
        }
        if (name.equals("Warrior")) {
            if (Warrior.health > 0) {
                System.out.println("Dragon  наносит " + Warrior.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Warrior.takeDamage(strength) + " баллов здоровья");
            }
            if ((Warrior.health == 0) || (Warrior.health < 0))
                System.out.println("Вы проиграли");
        }
    }
}
