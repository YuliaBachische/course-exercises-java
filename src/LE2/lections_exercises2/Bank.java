package LE2.lections_exercises2;
/*
Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -
успешность выполнения операции.
При снятии денег функция должна распечатывать каким
количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
 class Bank { // класс, описывающий банкомат.
     boolean sum;
     int money;
     int money20;
     int money50;
     int money100;
    public static void main(String[]args){     //вывод на консоль
        Bank first = new Bank( 6, 45, 2);
        first.giveMoney();
        Bank second = new Bank(70);
        second.getMoney();
    }
     Bank(int money){
        int div100 = money%100;
        int div50 = money%100;
        int div20 = money%50;
            if (div100 == 0) {
                this.money100 = money / 100;
            } if ((div100 != 0) && (div50 == 0)) {
                this.money100 = money / 100;
                this.money50 = div100 / 50;
            } if ((div100 != 0) && (div50 != 0) && (div20%2 == 0)) {
                this.money100 = money / 100;
                this.money50 = div100/50;
                this.money20 = (div100%50)/20;
            } else{
                System.out.println(" ");
         }
            this.money = this.money100*100 + this.money50*50 + this.money20*20;
        }
     void getMoney() {//каким количеством купюр какого номинала выдаётся сумма

            /* Функция, снимающая деньги, которая принимает сумму денег, а возвращает булевое значение -
          успешность выполнения операции.*/
            if(money!= 0) {
                sum = money - money100 * 100 - money50 * 50 - money20 * 20 == 0;
                if (sum) {
                    System.out.println("Операция выполнена успешно");
                    System.out.println(" Купюр 20 рублей - " + " " + money20 + "; " + "Купюр 50 рублей - " + money50 +
                            "; " + " " + "Купюр 100 рублей - " + " " + money100 + ".");
                } else {
                    System.out.println("Ошибка выполнения");
                }
            } else{
                System.out.println("Ошибка выполнения");
            }
    }
     Bank(int money20, int money50, int money100){
            money20 = money20 * 20;
            money50 = money50*50;
            money100= money100*100;
            money = money20 + money50 + money100; //преобразование в сумму добавленных в банкомат денег
    }
     void giveMoney(){        //метод для добавления денег в банкомат
        System.out.println("Операция выполнена успешно. Сумма вклада:" + money);
    }
}
