package ecad.parts;
import java.util.ArrayList;
public class Parts {
	ArrayList<Part> part = new ArrayList<Part>();
	Parts(){}

	public void addPart(int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath,String partsGroup){
		part.add(new Part(posX,posY,sizeX,sizeY,ofsetX,ofsetY,partPath,partsGroup));
	}

	public void removePart(int partId){
		part.remove(partId);
	}

	public void movePart(int partId,int posX,int posY){
		part.get(partId).movePart(posX,posY);
	}

	public void relativeMovePart(int partId,int posX,int posY){
		part.get(partId).relativeMovePart(posX,posY);
	}

	public void directionPart(int partId,int direction){
		part.get(partId).directionPart(direction);
	}

	public void setDirection(int partId,int direction){
		part.get(partId).setDirection(direction);
	}

	public int getDirection(int partId){
		return part.get(partId).getDirection();
	}

	public void ofsetBasedMovePart(int partId,int posX,int posY){
		part.get(partId).ofsetBasedMovePart(posX,posY);
	}

	public Part getPart(int partId){
		return part.get(partId);
	}

	public int getPartLength(){
		return part.size();
	}

	public String getPartPath(int partId){
		return part.get(partId).getPartPath();
	}
}
