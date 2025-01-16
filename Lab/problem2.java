import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        int greatest = findGreatest(num1, num2, num3);

        if (greatest == 1) {
            System.out.println("The first number you entered, " + num1 + ", is the greatest.");
        } else if (greatest == 2) {
            System.out.println("The second number you entered, " + num2 + ", is the greatest.");
        } else if (greatest == 3) {
            System.out.println("The third number you entered, " + num3 + ", is the greatest.");
        }
    }

    public static int findGreatest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return 1;
        } else if (num2 >= num1 && num2 >= num3) {
            return 2;
        } else {
            return 3;
        }
    }
}
