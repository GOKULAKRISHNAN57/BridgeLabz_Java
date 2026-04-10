package core_programming.control_flow.Level_3;

import java.util.Scanner;

class simple_calculator_switch_case {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String operator = input.next();

        double result;

        switch (operator) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;

            case "-":
                result = first - second;
                System.out.println(result);
                break;

            case "*":
                result = first * second;
                System.out.println(result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}