package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the equation with X ");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        int sign = equation.charAt(1);
        int result=0;
        char a = equation.charAt(0);
        int a1=Character.getNumericValue(a);
        char b = equation.charAt(2);
        int b1=Character.getNumericValue(b);
        char c = equation.charAt(4);
        int c1=Character.getNumericValue(c);
        if (equation.charAt(1) == '+') {
            sign = 1;
        } else sign = -1;

        if (equation.charAt(4) == 'x') {
            result = a1+(b1*sign);
            System.out.println(result);
        }
        if (equation.charAt(0) == 'x') {
            result = c1 - (sign) * b1;
            System.out.println(result);
        }
        if (equation.charAt(2) == 'x') {
            result = sign * (c1 - a1);
            System.out.println(result);
        }


    }
}



