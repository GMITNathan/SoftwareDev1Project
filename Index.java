import java.util.Scanner;

public class Index{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		while (true) { //While loop to repeat program choice
			Scanner x = new Scanner(System.in);
				System.out.print("\n"+
				"//////////////////////////////  \n"+
				"///    Choose Your Game    ///  \n"+
				"//////////////////////////////  \n  \n"+
				"1. Lisa  \n"+
				"2. BigNumber  \n"+
				"3. Number  \n"+
				"4. Two  \n"+
				"5. NameAge  \n"+
				"6. ForLoops  \n"+
				"7. Months  \n"+
				"8. Cards  \n"+
				"9. EXIT  \n"+
				"<Choose option 1 to 9> ");
			  	int choice = x.nextInt();

				if(choice == 1){
					Lisa.main(null); //Calls Lisa.java
			  		}
			  	else if(choice == 2){ //Calls BigNumber.java
					BigNumber.main(null);
					}
				else if(choice == 3){ //Calls Number.java
			  	  	Number.main(null);
					}
				else if(choice == 4){ //Calls Two.java
			  	  	Two.main(null);
					}
				else if(choice == 5){ //Calls NameAge.java
			  	  	NameAge.main(null);
					}
				else if(choice == 6){ //Calls ForLoop.java
			  	  	ForLoop.main(null);
					}
				else if(choice == 7){ //Calls Months.java
			      	Months.main(null);
					}
				else if(choice == 8){ //Calls Cards.java
			      	Cards.main(null);
					}
				else if(choice == 9){ //Quits
					System.exit(0);
					}
				else{
					System.out.println("Incorrect Choice (1-9 ONLY)");
  					}
  				//Game has ended
			System.out.print("Do you want to play again, type 'yes' or 'no': "); //Presents choice for playing again
			if (input.nextLine().equals("no")) { //If input is equal to no program will break and end
				System.out.println("Thanks for playing!"); //Prints  thank you message
				break;
				}
		}//end while loop
	}//end main
}//end
