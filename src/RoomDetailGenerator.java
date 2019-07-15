import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Generator!");

		Scanner scan = new Scanner(System.in);
		String cont = "Yes";
		while (cont.equals("Yes")) {

			System.out.println("Enter Length:");
			double valueLength = scan.nextDouble();

			System.out.println("Enter Width");
			double valueWidth = scan.nextDouble();

			double area = (valueLength * valueWidth);
			System.out.println("Area: " + (int) area);

			double perimeter = valueLength + valueLength + valueWidth + valueWidth;

			System.out.println("Perimeter: " + (int) perimeter);

			System.out.println("Would you like to continue? (Yes/No): ");

			cont = scan.next();
		}

		if (cont.equals("No")) {
			System.out.println("Thank you for using our generator!");
		}

		scan.close();
	}

}
