class ECADPanel{
	ArrayList<ECADObject> object = new ArrayList<ECADObject>();
	ECADPanel(){
	}

	int  addObject(ECADObject object){
		this.object.add(object);
		return this.object.size()-1;
	}

	void removeObject(int id){
		this.object.remove(id);
	}

	void update(){
		for(int i=0,len=object.size();i<len;i++){
			object.get(i).update();
		}
	}
}
