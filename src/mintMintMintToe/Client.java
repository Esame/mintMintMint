package mintMintMintToe;


import java.util.Scanner;

public class Client {
	public static String playerName;
	public static int player; //ID of player
	public static int tier; //Tier of game
	public static void main(String[] args) {
		player = 1; //server assigned
		tier = 2; //server created
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter your name: ");
		playerName = reader.next(); 
		reader.close();
		
		TierN bigBoard = new TierN(null, tier, 0);
		TierN tinyBoard;      //test SQUARES. only for when there is no GUI to test
		tinyBoard = (TierN)bigBoard.ticTac[1];
		((Square)(tinyBoard.ticTac[8])).Interact();
		
	}

}
