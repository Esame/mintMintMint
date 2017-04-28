package mintMintMintToe;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Square extends Board{
int player;
	public Square(TierN parent, int pos){
		super(parent, pos);
		player = 0;
		
	}
	public void Interact(){
		player = Client.player;
		broadcastChange();	
	}
	public void broadcastChange(){
	ByteArrayOutputStream coord = new ByteArrayOutputStream();
	coord.write(Client.player);
	getCoord(coord);
	System.out.println(Arrays.toString(coord.toByteArray()));
		
	}
	
}
