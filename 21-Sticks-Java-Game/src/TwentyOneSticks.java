import java.util.Scanner;

public class TwentyOneSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numSticks = 21;
		
		//Ask if player would like to go first; receive input
		System.out.println("Would you like to go first/ (Y/n)");
		Scanner input = new Scanner(System.in);
		String goFirst = input.nextLine();
		Scanner take = new Scanner(System.in);
		int numToTake = 0;
		
		
		//If player type "y" to go first
		while (numSticks > 0) {
			
			if (goFirst.equals("y") || goFirst.equals("Y")) {
				//Ask how many sticks to take; prints out remaining sticks		
				System.out.println("There are " + numSticks + " sticks");
				System.out.println("How many would you like to take? (1 or 2)");
				numToTake = take.nextInt();
				numSticks -= numToTake;
				
				//If player inputs # of sticks less than 1 assume 1; if # is greater than 2 assume 2				
				if (numToTake > 2) {
					numToTake = 2;
				}
				else if (numToTake < 1) {
					numToTake = 1;
				}
				
				numSticks -= numToTake;
				
				if (numSticks <= 0) {
					System.out.println("You lose!");
				}
				else {
					//Tell computer to take 1 stick if 2 sticks loses the game or if 3 sticks would be left; otherwise pick 2				
					if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) {
						numToTake = 1;
					}
					else {
						numToTake = 2;
					}
					System.out.println("Computer took " + numToTake + " sticks");
					numSticks -= numToTake;
				
					if (numSticks <= 0) {
						System.out.println("You win!");
					}
				}
			}else {
				if ((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) {
					numToTake = 1;
				}
				else {
					numToTake = 2;
				}
				System.out.println("Computer took " + numToTake + " sticks");
				numSticks -= numToTake;
				
				if (numSticks <= 0) {
					System.out.println("You win!");
				}
				else {
					System.out.println("There are " + numSticks + " sticks");
					System.out.println("How many sticks would you like to take? (1 or 2)");
					numToTake = take.nextInt();
					
					if (numToTake > 2) {
						numToTake = 2;
					}
					else if (numToTake < 1) {
						numToTake = 1;
					}
					numSticks -= numToTake;
					
					if (numSticks <= 0) {
						System.out.println("You lose!");
					}
				}
			}
		}
	}
}
