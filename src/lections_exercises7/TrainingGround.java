/*
Создать класс TrainingGround,
содержащий метод main. Протестировать
создание героя и его атаку.
 */
package lections_exercises7;

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Dan");
        archer.attackEnemy("Zombie", "Zombie");
        Hero warrior = new Warrior("Ban");
        warrior.attackEnemy("Dragon");
        Hero mage = new Mage("Jack");
        mage.attackEnemy("Zombie", "Dragon");
    }
}
