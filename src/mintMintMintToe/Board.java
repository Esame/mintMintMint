package mintMintMintToe;

import java.io.ByteArrayOutputStream;

//shared abstract board to have squares and TierN boards fit in the same array 
public abstract class Board {
	protected TierN parent;
	protected int pos;
	
	public Board (TierN parent, int pos){ //every board needs to store its position
		this.parent = parent;
		this.pos = pos;
	}
	
	public void getCoord(ByteArrayOutputStream coord){
		if (parent != null){
		parent.getCoord(coord);
		coord.write(pos);
		}
		
	}
}
