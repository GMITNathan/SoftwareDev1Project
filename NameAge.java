import java.util.Scanner;
public class NameAge {
	public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	String name;
	int age;
	int counter = 1;

	System.out.print("Enter your name: ");
	name = input.nextLine();

	System.out.print("Enter your age: ");
	age = input.nextInt();

	while (counter <= age){
		System.out.println(counter+". "+name);
		counter++;}
	}
}