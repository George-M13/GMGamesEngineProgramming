package game_engine2D;

import processing.core.PApplet;

public class Tile extends Sprite {
	
	int strokeColour;
	int fillColour;
	public Tile(PApplet p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public Tile(PApplet p, int x, int y, int w, int h) {
		super(p, x, y);
		this.size.x = w;
		this.size.y = h;
		this.strokeColour = parent.color(255, 255, 255);
		this.fillColour = parent.color(0, 0, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
	
	public void render() {
		super.render();
		parent.pushMatrix(); // reset the translation and rotation
		parent.translate(this.transform.position.x, this.transform.position.y);
		parent.stroke(this.strokeColour);
		parent.fill(this.fillColour);
		parent.rect(0, 0, this.size.x, this.size.y);
		parent.popMatrix();
}

}
