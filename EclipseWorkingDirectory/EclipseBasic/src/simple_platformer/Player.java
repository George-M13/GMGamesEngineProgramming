/**
 * 
 */
package simple_platformer;

import game_engine2D.Physics2D;
import game_engine2D.Sprite;
import processing.core.PApplet;
import processing.core.PVector;


/**
 * @author Rod Martin r.martin1@salford.ac.uk
 *
 */
public class Player extends Sprite {
	float speed = 3f;
	float gravity = 0.1f;
	private PVector size = new PVector(12,12);
	private PVector velocity = new PVector(0,0);
	public int stroke = parent.color(120,120,255);
	public int fill = parent.color(255);
	
	public Physics2D physics;
	/**
	 * @param p
	 */
	public Player(PApplet p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	 public Player(PApplet p, float x, float y, float w, float h) {
	        super(p);
	        speed = 3.0f;
	    }
	 public void start() {
		 this.transform.position.x = parent.width / 2;
		 this.transform.position.y = parent.height / 2;
		 physics = new Physics2D(this);
		 physics.start();
	 }
	/* (non-Javadoc)
	 * @see game_engine2D.Sprite#update()
	 */
	@Override
	public void update() {
		this.physics.checkCollison();
	}
	@Override
	public void render(){
		parent.fill(this.fill);
		parent.stroke(this.stroke);
		parent.rect(this.transform.position.x, this.transform.position.y, this.size.x, this.size.y);

	}
}
