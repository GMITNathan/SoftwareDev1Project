import java.util.Scanner;
public class Two {
	public static void main (String [] args) {
	int one;
	int two;
	Scanner input = new Scanner (System.in);

	System.out.print("Enter first number: ");
	one = input.nextInt();
	System.out.print("Enter second number: ");
	two = input.nextInt();

	if (one == 2 && two == 2){
		System.out.println("Both number are equal to 2.");}
	else if (one == 2 || two == 2) {
		System.out.println("One of the numbers is equal to 2.");
		if (one == 2){ System.out.println("First number equals 2");}
		if (two == 2){ System.out.println("Second number equals 2");}}
	else {
		System.out.println("Neither are equal to 2.");}

	}
}