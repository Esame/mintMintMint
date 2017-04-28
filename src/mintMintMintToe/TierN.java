package mintMintMintToe;

public class TierN extends Board{ //recursively create an Nth tier TicTacToe board
Board ticTac[] = new Board[9]; //TicTac board has 9 spaces 0 through 8
	public TierN(TierN parent, int n, int pos) { //n is tier
		super(parent, pos);	
			for (int i = 0; i < 9; i++){
				if (n > 1){ //create a new (nested) tier board
					ticTac[i] = new TierN(this, n-1, i);
				}
				else if (n == 1){ //fill the basic TicTacToe board with normal squares
					ticTac[i] = new Square(this, i);
				}
			}
	}
	
}
