package mintMintMintToe;

public class TierN extends Board{
Board ticTac[] = new TierN[8];
	public TierN(int n) {

			for (int i = 0; i < 9; i++){
				if (n > 1){
					ticTac[i] = new TierN(n-1);
				}
				else if (n == 1){
					ticTac[i] = new Square();
				}
			}
	}
	
}
