import java.util.Scanner;
public class ForLoop {
	public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	int sum = 0, value = 0;
	for (int i = 1; i <= 10; i++){
		System.out.print("Enter Number "+i+": ");
		value = input.nextInt();
		if (value % 2 != 0){
			sum = sum + value;}
		}
	System.out.println("\n"+
	"Sum of odd numbers is: "+sum);
	}
}