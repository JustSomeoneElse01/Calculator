import java.util.Scanner;

public class UserInterface {

	public static void game() {

		String operator = null;

		Scanner scanner = new Scanner(System.in);
		Input input = new Input();
		Logic logic = new Logic();

		System.out.println("Enter a number");
		double num1 = input.inputNumber();

		System.out.println("Enter an operation (+, -, *, /)");

		do {
			operator = scanner.nextLine();
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				break;
			} else {
				System.out.println("please enter either +, -, *, or /");
			}

		} while (true);

		System.out.println("Enter a second number");
		double num2 = input.inputNumber();

		double answer = logic.math(num1, num2, operator);

		System.out.println(answer);

	}
}
