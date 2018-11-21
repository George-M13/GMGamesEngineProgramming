package game_engine2D;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class GameObject extends ProcessingEntity {
	public ArrayList<GameComponent> components;
	public BoxCollider2D boxCol;
	public BoundingBox bb;
	public boolean collided;
	public String CollideInfo = "NONE";
	public Physics2D physics;
	public GameObject(PApplet p) {
		super(p);
		this.components = new ArrayList<GameComponent>();
	}

	public String name;
	public String tag;
	public Transform transform = new Transform();
	public abstract void start();
	public abstract void update();
	public abstract void render();
	public String ToString() {
		return this.name;
	}


	public void keyPressed(char key, int keyCode){}
	public void keyReleased(char key, int keyCode){}
}
