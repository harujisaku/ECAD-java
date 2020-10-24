package Wire;

import Wire.Wires;
import java.util.ArrayList;
/**
afdfdfdfdfd
*/
public class Wiring{
	ArrayList<Wires> wires = new ArrayList<Wires>();
	public Wiring(){

	}

	public void test(){
		System.out.println("Wiring");
	}

	public void addWires(){
		wires.add(new Wires());
	}

	public void addWire(int id,int posStartX,int posStartY,int posEndX,int posEndY){
		wires.get(id).addWire(id,posStartX,posStartY,posEndX,posEndY);
	}
}
