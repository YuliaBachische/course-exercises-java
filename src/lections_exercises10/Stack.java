/*
Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно
спроектированный класс, поддерживающий
3 операции:
1.)Задать размер стека
2.)Внести цифру в стек.
3.) Извлечь цифру из стека.
Вывести число, у которого цифры идут в обратном порядке
 */
package lections_exercises10;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    private static Logger LOGGER = Logger.getLogger(Stack.class);
    static ArrayList<Character> numbers = new ArrayList<>();
    int size = numbers.size();
    public void push(String num) {
        char[] chars = num.toCharArray();
        for (char aChar : chars) {
            numbers.add(aChar);
        }
    }
    public StringBuilder pop(){
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <=numbers.size(); i++) {
            str.append(numbers.get(numbers.size() - i));
        }
        return str;
    }
    public void setSize(int num){
        this.size = num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String enteredNumber = scanner.nextLine();
        Stack stack = new Stack();
        stack.push(enteredNumber);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(stack.pop());
    }
}
