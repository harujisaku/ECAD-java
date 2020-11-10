Label l = new Label("text",0,0);
RectButton button = new RectButton(10,10,100,20);
Button b = new Button("ttttt",button);
ECADPanel pane = new ECADPanel();
void setup(){
	size(200,200);
	noSmooth();
	pane.addObject(b);
	pane.addObject(l);
}

void draw(){
	background(255);
	pane.update();
}

void mousePressed(){
	println(b.isClick(mouseX,mouseY));
}
