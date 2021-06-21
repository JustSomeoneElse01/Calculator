import java.util.Scanner;
public class Input {
	Scanner scanner = new Scanner(System.in);
	
	public double inputNumber() {
		
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Please enter a valid number");
			}
		}
	}

}
