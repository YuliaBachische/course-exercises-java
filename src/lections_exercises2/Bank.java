package lections_exercises2;

public class Bank {
    public int money;
    public int money20 = 20;
    public int money30 = 30;
    public int money50 = 50;
    public Bank(int money){
        int money50 = money/50;
        if(((money%50)%30) ==0) {
            int money30 = money/30;
        } else if(((money%50)%20) == 0){
            int money20 = money/20;
        }
    }
    public void giveMoney(){
        System.out.println("20 рублей - " + " " + money20 + " " + "30 рублей - "+ " " + money30 + " " + "50 рублей - " + " " + money50);
    }
    public void getMoney(int getMoney20, int getMoney30, int getMoney50){
        getMoney20 +=money20;
        getMoney30 +=money30;
        getMoney20 +=money20;
        boolean success = true;
        if(success){
            System.out.println("Операция выполнена успешно");
        }else{
            System.out.println("Ошибка выполнения");
        }

    }
    public void main(String[]args){
        Bank first = new Bank(300);
        first.giveMoney();
    }
}
