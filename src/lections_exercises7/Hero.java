/*Создать класс Hero, представляющий собой героя и содержащий поле name.
Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
Добавить метод attackEnemy(), выводящий в
консоль сообщение о том,
что герой атакует врага.
Сделать класс Hero и его метод attackEnemy абстрактными
*/
package lections_exercises7;

public abstract class Hero {
    static String name;
    static int healthHero;
    public static void setHealthHero(int healthHero) {
        Hero.healthHero = healthHero;
    }
    public static int getHealthHero() {
        return healthHero;
    }
    public String getName(String name) {
        return name;
    }
    public String Hero(){
        getName(name);
        return name  + " атакует врага";
    }
    public abstract void attackEnemy(String enemyName);
    public abstract void attackEnemy(String enemyName, String enemyName2);
    public Hero(){

    }
    public static int takeDamage(int damage) {
        return Enemy.health -=damage;
    }
}
