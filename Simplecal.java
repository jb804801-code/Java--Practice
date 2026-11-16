public class ShiftOperator {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Original Number = " + a);

        System.out.println("Left Shift = " + (a << 1));

        System.out.println("Right Shift = " + (a >> 1));
    }
}
import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two number: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();


        System.out.print("Enter a operator(+, -, *, /): ");
        char operator = input.next().charAt(0);

        if(operator == '+'){
            System.out.println("Result = " + (num1 + num2));
        }
        else if(operator == '-'){
            System.out.println("Result = " + (num1 - num2));
        }
        else if(operator == '*'){
            System.out.println("Result = " + (num1 * num2));
        }
        else if(operator == '/'){
            System.out.println("Result = " + (num1 / num2));
        }
        else {
            System.out.println("Try again");
        }
        input.close();
    }
}
