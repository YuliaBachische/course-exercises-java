package LectionExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int dividend = scan.nextInt();

        List<Integer> result = new ArrayList<>();

        int i = 1;
        int counter = 0;
        int elementsSum = 0;
        while (true)
        {
            if (dividend <= 2)
            {
                result.add(dividend);
                break;
            }

            if (elementsSum + i <= dividend)
            {
                result.add(i);
                elementsSum += i;
                i++;
                counter++;
            }
            else
            {
                counter --;
                while (dividend != elementsSum) {
                    result.set(counter, result.get(counter) + 1);
                    elementsSum += 1;
                }
                break;
            }
        }

        System.out.println(result.size());
        System.out.print(result.get(0));

        for (int j = 1; j < result.size(); j++)
        {
            System.out.print(" " + result.get(j));
        }
    }
}

