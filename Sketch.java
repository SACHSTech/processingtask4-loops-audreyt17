import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  strokeWeight((float)0.003*height);
    stroke(0, 0, 0);

    // Quadrant 1
    for (int i = height/20; i < height/2; i += height/20) {
      line(i,0,i, height/2);
      line(0, i, width/2, i);
    }

    // Quadrant 2
    fill(194, 45, 119);
    for (int circleY = ((height)/14); circleY <= ((height)/14)*7; circleY += ((height)/11)) { 
      for (int circleX = ((width)/14)+250; circleX <= ((width/14)*7)+250; circleX += ((width)/11)) {
        ellipse(circleX, circleY, 25, 25);
      }
    }

    // Quadrant 3
    strokeWeight((float)0.002*height);
    for (int i = 0; i <= height/2; i++) {
      stroke(i, i, i);
      line(i, height/2, i, height);
    }
    
    // Quadrant 4
    int xCoord = width * 3 / 4;
    int yCoord = height * 3 / 4;
    for (float angle = 0; angle < 2 * Math.PI; angle += Math.PI / 4) {
      stroke(0, 0 ,0); 
      strokeWeight(1);
      fill(237, 107, 59);

      pushMatrix();
      translate(xCoord, yCoord);
      rotate(angle); 
      ellipse(0, 0, width / 25, height / 3);
      popMatrix();
    }
    
    fill(0, 153, 48); 
    noStroke(); 
    ellipse(xCoord, yCoord, 50, 50);
  }
} 
// define other methods down here.