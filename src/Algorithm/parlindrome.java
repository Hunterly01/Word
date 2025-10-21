package Algorithm;

import java.util.Scanner;

public class parlindrome {

    public static boolean check_parlindrome(int number){
        int original = number;
        int reversed = 0;
        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }



    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numbered = sc.nextInt();
        boolean reversed = check_parlindrome(numbered);
        System.out.print(reversed);

    }


}




