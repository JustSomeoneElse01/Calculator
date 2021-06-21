
public class Logic {

	public double math(double num1, double num2, String operator) {
		while (true) {
			switch (operator) {
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				return num1 / num2;
			}
		}
	}
}
