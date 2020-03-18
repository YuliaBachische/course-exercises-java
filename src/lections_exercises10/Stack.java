package lections_exercises10;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    ArrayList<Character> numbers = new ArrayList<>();
    int size = numbers.size();
    public void push(String num){
        char [] chars = num.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            this.numbers.add(chars[i]);
        }

    }
    public int pop(int num){
        StringBuilder str = new StringBuilder();
        for (int i = numbers.size(); i >num; i++) {
            str.append(numbers.get(numbers.size()));
        }

    }
    public void setSize(int num){
        this.size = num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredNumber = scanner.nextLine();
    }
}
