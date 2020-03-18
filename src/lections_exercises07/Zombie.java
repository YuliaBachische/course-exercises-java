/*
Подкласс класса Enemy
 */
package lections_exercises07;

public class Zombie extends Enemy {
    static int health = 60;
    static int strength = 20;
    @Override
    public boolean isAlive() {
        if (health < 0) {
            return false;
        }
        return true;
    }
    public int reborn() {
        if (health<0) {
            health += 20;
        }
        return this.health;
    }
    public static int takeDamage(int damage) {
        return health -= damage;
    }
    @Override
    public void attackHero(String name) {
        if (name.equals("Archer")) {
            if (Archer.health > 0) {
                System.out.println("Zombie  наносит " + Archer.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Archer.takeDamage(strength) + " баллов здоровья");
            }
            if ((Archer.health == 0) || (Archer.health < 0))
                System.out.println("Вы проиграли");
        }

        if (name.equals("Mage")) {
            if (Mage.health > 0) {
                System.out.println("Zombie  наносит " + Mage.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Mage.takeDamage(strength) + " баллов здоровья");
            }
            if ((Mage.health == 0) || (Mage.health < 0))
                System.out.println("Вы проиграли");
        }
        if (name.equals("Warrior")) {
            if (Warrior.health > 0) {
                System.out.println("Zombie  наносит " + Warrior.name + " " + strength + " баллов урона");
                System.out.println("У вас " + Warrior.takeDamage(strength) + " баллов здоровья");
            }
            if ((Warrior.health == 0) || (Warrior.health < 0))
                System.out.println("Вы проиграли");
        }
    }
}

