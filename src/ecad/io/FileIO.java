package ecad.io;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import ecad.ECAD;
public class FileIO {
	final String MARK ="***";
	final String VERSION = "Version";
	final String PITCH = "Pitch";
	final String BOARD = "Board";
	final String TYPE = "Type";
	final String PARTS = "Parts";
	final String BOTTOM_LINE = "BottomLine";
	final String TOP_LINE = "TopLine";
	final String BOTTOM_JUMP = "BottomJump";
	final String TOP_JUMP = "TopJump";
	final String AREA = "Area";
	final String[] MARK_ARRAY = {VERSION,PITCH,BOARD,TYPE,PARTS,BOTTOM_LINE,TOP_LINE,BOTTOM_JUMP,TOP_JUMP,AREA};
	ECAD ecad;
	File file;
	BufferedReader br;
	String mode;
	public void loadFile(ECAD ecad,String path){
		this.ecad=ecad;
		try{
			file = new File(path);
			if (checkBeforeReadfile(file)){
				br = new BufferedReader(new FileReader(file));
				String str;
				while((str = br.readLine()) != null){
					System.out.println(str);
					if(str.indexOf(MARK)!=-1){
						for (String a :MARK_ARRAY ) {
							if (str.equals(MARK+" "+a)) {
								mode=a;
								break;
							}
						}
					}else{
						loadParameter(str);
						System.out.println(mode);
					}
				}
				br.close();
			}else{
				System.out.println("ファイルが見つからないか開けません");
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}

	private boolean checkBeforeReadfile(File file){
		if (file.exists()){
			if (file.isFile() && file.canRead()){
				return true;
			}
		}
		return false;
	}

	private void loadParameter(String str){
		String data[];
		switch (mode) {
			case VERSION:
				break;
			case PITCH:
				break;
			case TYPE:
			break;
			case PARTS:
			try {
				str+=",";
				str+=br.readLine();
				str+=",";
				str+=br.readLine();
				data=str.split(",",-1);
				for (String a :data ) {
					System.out.println(a);
				}
				ecad.addPart("0",data[1],data[2],data[3],data[4],"0","0",data[0],data[0]);
			} catch(IOException e) {
				System.out.println(e);
			}
			break;
			case BOTTOM_LINE:
				data=str.split(",",-1);
				System.out.println(data.length);
				ecad.addWire("0",data[0],data[1],data[2],data[3]);
			break;
			case TOP_LINE:
				data=str.split(",",-1);
				ecad.addWire("1",data[0],data[1],data[2],data[3]);
			break;
			case BOTTOM_JUMP:
				data=str.split(",",-1);
				ecad.addWire("2",data[0],data[1],data[2],data[3]);
			break;
			case TOP_JUMP:
				data=str.split(",",-1);
				ecad.addWire("3",data[0],data[1],data[2],data[3]);
			break;
			case AREA:
				data=str.split(",",-1);
				ecad.addWire("4",data[0],data[1],data[2],data[3]);
			break;
			default:
			System.out.println("error"+mode+"is not ECADs");
				break;

		}
	}

	private void setPitch(String a){
	}

	private void setBoard(){

	}
}
