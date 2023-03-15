
import java.util.Scanner;
public class Main {
    static int maxNum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else{
            return num3;
        }
    }
    static int minNum(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }
        else{
            return num3;
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number\n");
        int num1 = reader.nextInt();
        System.out.println("Enter second number\n");
        int num2 = reader.nextInt();
        System.out.println("Enter third number\n");
        int num3 = reader.nextInt();

        System.out.println("The max numbers is: "+maxNum(num1,num2,num3));
        System.out.println("The min numbers is: "+minNum(num1,num2,num3));

    }
}