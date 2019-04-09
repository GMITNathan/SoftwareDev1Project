import java.util.Scanner;
public class Number {
	public static void main (String [] args){
	int num;
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number: ");
	num = input.nextInt();

	if (num == 0) {
		System.out.println("Number entered is equal to 0");}
		else if (num > 0) {
			System.out.println("Number entered is positive");}
				else if (num < 0) {
					System.out.println("Number entered is negative");}
	}
}