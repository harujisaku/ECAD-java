package wire;

import wire.Wire;
import java.util.ArrayList;
import collision.Collision;


public class Wires {
	protected ArrayList<Wire> wire = new ArrayList<Wire>();

	public Wires(){

	};

	public void addWire(int startPosX,int startPosY,int endPosX,int endPosY){
		wire.add(new Wire(startPosX,startPosY,endPosX,endPosY));
	}

	public void groupingWire(){

	}
}
