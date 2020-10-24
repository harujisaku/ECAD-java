package Wire;

import Wire.Wire;
import java.util.ArrayList;


public class Wires {
	ArrayList<Wire> wire = new ArrayList<Wire>();
	public Wires(){};

	public void addWire(int id,int posStartX,int posStartY,int posEndX,int posEndY){
		wire.add(new Wire());
	}
}
