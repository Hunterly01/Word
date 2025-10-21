package Algorithm;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the first sales number");
        int firstNum = sc.nextInt();
        System.out.println("Enter the the second sales number");
        int secondNum = sc.nextInt();
        System.out.println("Enter the the third sales number");
        int thirdNum = sc.nextInt();

        int largest = 0;

        if  (firstNum > secondNum && firstNum > thirdNum) {
            largest = firstNum;
        }
        if (secondNum > firstNum && secondNum > thirdNum) {
            largest = secondNum;

            }
        if (thirdNum > firstNum && thirdNum > largest) {
            largest = thirdNum;
        }
        System.out.println("largest sales is "+ largest);


    }
}
