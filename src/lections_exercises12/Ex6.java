/*
Создать метод случайным образом выбрасывающий одно из 3-х видов
исключений.
Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х
 */
package lections_exercises12;

import java.io.IOException;
import java.util.Random;

public class Ex6 {
    public void ThrowOneOfExceptions() throws IOException, CloneNotSupportedException, ArithmeticException{
        int random = GenerateRandomInt();
        if(random%2==0){
            throw new IOException();
        } if(random%3==0){
            throw  new CloneNotSupportedException();
        } else {
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        Ex6 ex = new Ex6();
        try {
            ex.ThrowOneOfExceptions();
        }catch(IOException | CloneNotSupportedException | ArithmeticException exe) {
            exe.printStackTrace();
        }
    }
    public static int GenerateRandomInt(){
        Random random1 = new Random();
        return  random1.nextInt();
    }
}
