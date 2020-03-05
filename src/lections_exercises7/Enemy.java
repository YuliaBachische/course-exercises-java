/*
Создать класс Enemy, представляющий собой врага и содержащий поле
health(количество здоровья).
Добавить конструктор, принимающий количество здоровья, а также сеттер
и геттер.Добавить метод takeDamage (int
damage), который уменьшает количество
здоровья в соответствии с полученным уроном.
Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
Определить метод
isAlive в классе Enemy
так, чтобы тот возвращал true,
если количество здоровья врага больше 0
 */
package lections_exercises7;

public class Enemy implements Mortal{
    static int health;
    static int strength;
    public Enemy(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public static int takeDamage(int damage){
        return health -= damage;
    }
    public void attackEnemy(int damage) {
        this.takeDamage(damage);
    }
    public static boolean isAlive() {
        if(health>0){
            return true;
        }
        return false;
    }
    public Enemy() {
    }
    public void attackHero(String name){
        System.out.println(Enemy());
    }
    public String Enemy(){
       String res = "Enemy атакует героя";
       return res;
    }
}
