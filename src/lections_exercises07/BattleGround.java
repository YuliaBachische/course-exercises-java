/*
 Создать класс BattleGround
с методом main, в котором создать симуляцию
героя, атакующего врага.
 */
package lections_exercises07;
import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя вашего героя: ");
        String name = sc.nextLine();
        System.out.println("Выберите героя, за которого хотите сражаться:" + "\n" + "1. Маг" + "\n" + "2. Стрелок" +
                "\n" + "3. Воин" + "\n" + "4. Если хотите выйти");
        int num1 = sc.nextInt();
        while ((num1!=4)&&(Mage.isMageAlive())&&(Warrior.isWarriorAlive())&&(Archer.isArcherAlive())) {
            switch (num1) {
                case 1:
                    Mage mage = new Mage(name);
                    System.out.println("Выберите врага, которого хотите атаковать: " + "\n" + "1. Зомби" +
                            "\n" + "2. Дракон");
                    int numEnemyMage = sc.nextInt();
                    switch (numEnemyMage) {
                        case 1:
                            mage.attackEnemy("Zombie");
                            Zombie zombie = new Zombie();
                            zombie.attackHero("Mage");

                            break;
                        case 2:
                            mage.attackEnemy("Dragon");
                            Dragon dragon = new Dragon();
                            dragon.attackHero("Mage");
                            break;
                    }

                    break;
                case 2:
                    Archer arch = new Archer(name);
                    System.out.println("Выберите врага, которого хотите атаковать: " + "\n" + "1. Зомби" +
                            "\n" + "2. Дракон");
                    int numEnemyArch = sc.nextInt();
                    switch (numEnemyArch) {
                        case 1:
                            arch.attackEnemy("Zombie");
                            Zombie zombie = new Zombie();
                            zombie.attackHero("Archer");
                            break;
                        case 2:
                            arch.attackEnemy("Dragon");
                            Dragon dragon = new Dragon();
                            dragon.attackHero("Archer");
                            break;
                    }
                    break;
                case 3:
                    Warrior war = new Warrior(name);
                    System.out.println("Выберите врага, которого хотите атаковать: " + "\n" + "1. Зомби" +
                            "\n" + "2. Дракон");
                    int numEnemyWar = sc.nextInt();
                    switch (numEnemyWar) {
                        case 1:
                            war.attackEnemy("Zombie");
                            Zombie zombie = new Zombie();
                            zombie.attackHero("Warrior");
                            break;
                        case 2:
                            war.attackEnemy("Dragon");
                            Dragon dragon = new Dragon();
                            dragon.attackHero("Warrior");
                            break;
                    }
                case 4:
                    break;
            }
        }
    }
}

