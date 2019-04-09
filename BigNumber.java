import java.util.Scanner;
public class BigNumber {
	public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	int choice;

	System.out.print("Input a number: ");
	choice = input.nextInt();

	if (choice > 1000000){
		System.out.println("That is a big number!");}
	}
}