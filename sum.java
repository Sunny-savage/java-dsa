import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num2);

        System.out.println("the sum is : " + (num2 + number));

        sc.close();

    }

}
