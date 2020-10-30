package harujisaku.parts;
import java.util.ArrayList;
public class BoardParts{
	ArrayList<Parts> parts = new ArrayList<Parts>();
	public BoardParts(){}

	public void addParts(){
		parts.add(new Parts());
	}

	public void removeParts(int partsId){
		parts.remove(partsId);
	}

	public void addPart(int partsId,int posX,int posY,int sizeX,int sizeY,int ofsetX,int ofsetY,String partPath,String partsGroup){
		if (parts.size()>=partsId) {
			parts.add(new Parts());
		}
		parts.get(partsId).addPart(posX,posY,sizeX,sizeY,ofsetX,ofsetY,partPath,partsGroup);
	}

	public void addPart(String partsId,String posX,String posY,String sizeX,String sizeY,String ofsetX,String ofsetY,String partPath,String partsGroup){
		addPart(Integer.parseInt(partsId),Integer.parseInt(posX),Integer.parseInt(posY),Integer.parseInt(sizeX),Integer.parseInt(sizeY),Integer.parseInt(ofsetX),Integer.parseInt(ofsetY),partPath,partsGroup);
	}

	public void removePart(int partsId,int partId){
		parts.get(partsId).removePart(partId);
	}

	public void movePart(int partsId,int partId,int posX,int posY){
		parts.get(partsId).movePart(partId,posX,posY);
	}

	public void relativeMovePart(int partsId,int partId,int posX,int posY){
		parts.get(partsId).relativeMovePart(partId,posX,posY);
	}

	public void directionPart(int partsId,int partId,int direction){
		parts.get(partsId).directionPart(partId,direction);
	}

	public int getDirection(int partsId,int partId){
		return parts.get(partsId).getDirection(partId);
	}

	public Part getPart(int partsId,int partId){
		return parts.get(partsId).getPart(partId);
	}

	public Parts getParts(int partsId){
		return parts.get(partsId);
	}

	public int getPartLength(int partsId){
		return parts.get(partsId).getPartLength();
	}
}
