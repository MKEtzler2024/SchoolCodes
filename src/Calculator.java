import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double num1;
        double num2;
        double answer;
        String operation;
        String repeatAnswer;
        boolean repeat = true;
        while(repeat ==true) {
            System.out.print("Enter your first number          : ");
            num1 = scnr.nextDouble();
            System.out.print("Enter your second number         : ");
            num2 = scnr.nextDouble();
            System.out.print("Enter a math operation (+ - * /) : ");
            operation = scnr.next();

            answer = calculate(num1, num2, operation);
            System.out.println("The answer is : " + answer);
            System.out.println("Wanna math again? ");
            repeatAnswer = scnr.next();
            if ((repeatAnswer.equalsIgnoreCase("yes")) || (repeatAnswer.equalsIgnoreCase("y"))) {
                repeat = true;
            }
            else {
                repeat = false;
                System.out.println("Goodbye");
            }
        }

    }
    public static double calculate(double num1, double num2, String operation){
        double result=0;
        switch(operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 !=0){
                result = num1 / num2;
                break;
                }
                else{
                    System.out.println("Divide by Zero error");
                }
                break;
            default:
                System.out.println("Invalid answer");

        }

        return result;

    }



    }
