package simple_platformer;


import game_engine2D.*;
import processing.core.PApplet;


public class Launcher extends BaseLauncher{

	public Launcher(PApplet p) {
		super(p);
	}

	public void StartGame(){
		super.StartGame();
        Player player = new Player(parent, parent.width/2,parent.height/2,60, 60);
        player.start();
        this.gameManager.addPlayer(player);
        //this.gameManager.addBoundingBox(player);
   
        int platforms = 8;
        for(int i = 0; i < platforms; i++){
            Tile platform = new Tile(parent, 50 + i * 55, parent.height-50,50, 20);
            platform.start();
            platform.transform.boundingBox.fromSize(platform.transform.size);
            this.gameManager.addObject(platform);
            this.gameManager.addBoundingBox(platform);
        }
    }
	  public void UpdateAll(){
	        super.UpdateAll();
	    }

}
