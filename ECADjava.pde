import ecad.ECAD;
// import gui.*;
ECAD e = new ECAD();
Label l = new Label("text",0,0);
DefaultButton button = new RectButton(10,10,100,20);
Button b = new Button("ttttt",button);
void setup(){
	size(200,200);
	noSmooth();
	e.main(null);
}

void draw(){
	b.update();
}

void mousePressed(){
	println(b.isClick(mouseX,mouseY));
}
