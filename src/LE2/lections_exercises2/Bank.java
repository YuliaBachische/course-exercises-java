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
 class Bank { 
     boolean sum;
     public int money20 = 100;
     public int money50 = 100;
     public int money100 = 100;
     public static void main(String[]args){    
         Bank firstOper = new Bank(4, 6, 10);
         firstOper.giveMoney();
        Bank secondOper = new Bank( 23,1, 0, 0);
       secondOper.getMoney();
       Bank thirdOper = new Bank(300, 5, 2, 1);
       thirdOper.getMoney();
    }
     Bank(int money,int money20, int money50, int money100){

         sum = (((this.money20>=money20)||(money20!=0))&& (this.money50>=money50||(money50!=0))&&((this.money100>=money100)||
                 (money100!=0))&&(money%10 ==0));
        if(sum){
            this.money20 -= money20;
            this.money50-= money50;
            this.money100 -= money100;
            System.out.println("Операция выполнена успешно");
            System.out.println(" Купюр 20 рублей - " + " " + money20 + "; " + "Купюр 50 рублей - " + money50 +
                    "; " + " " + "Купюр 100 рублей - " + " " + money100 + ".");
        } else {
            System.out.println("Ошибка выполнения");
        }
     }
    Bank(int money20, int money50, int money100){
         this.money20+=money20;
         this.money50 += money50;
         this.money100 += money100;
        System.out.println("В банке на данный момент хранится: купюр 20 рублей - " + this.money20 + "; " +
                "Купюр 50 рублей - " + this.money50 + "; " + "Купюр 100 рублей - " + this.money100 + ".");
    }
     void getMoney() {
     }
     void giveMoney(){
     }
}
