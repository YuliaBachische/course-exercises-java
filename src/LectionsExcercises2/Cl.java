package LectionsExcercises2;

import java.util.Scanner;
public class Cl{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringBuilder str = new StringBuilder();

        line = line.replace("^[0]", "");
        String line2 = str.append(line).reverse().toString();

        if((line.toCharArray()[line.length()-1] == '0')&&(line.length()==2)||(line.length() ==3)){
            System.out.println("1");
        }else if(line.equals(line2)){
        System.out.println("1");
        }else {
            System.out.println("32");
        }

}
}


