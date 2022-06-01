package Practice_Ivy;


import java.util.Scanner;

public class sumOfThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3:");
        int num3 = scan.nextInt();

        int result = num1 + num2 + num3;
        System.out.println("Sum: " + result);
        scan.close();

    }

}
