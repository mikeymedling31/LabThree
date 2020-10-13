import java.util.Scanner;

public class DecisionMaking {
	public static void main (String []args) {
		System.out.println("Hello please enter your name.");
		Scanner input = new Scanner (System.in);
		String userName = input.next();
		
		System.out.println("Please enter any number between 1 and 100.");
		int userNumber = input.nextInt();
		
			if(userNumber % 2 != 0 && userNumber >= 60) {
				System.out.println(userName+ " you chose " +userNumber+ " which is an Odd "
					+ "number and over 60.");
			}else if(userNumber % 2 != 0 && userNumber < 60){
				System.out.println(userName+ " you chose " +userNumber+ " which is an Odd.");
			}else if(userNumber % 2 == 0 && userNumber >= 2 && userNumber <=25){
				System.out.println(userName+ " you chose a number that is even and less than 25.");
			}else if(userNumber % 2 == 0 && userNumber >= 26 && userNumber <=60) {
				System.out.println(userName+ " you chose a number that is even.");
			}else if(userNumber % 2 == 0 && userNumber >60) {
				System.out.println(userName+ " you chose " +userNumber+ " which is an even.");
			}
		input.close();
		System.exit(0);
	}
}