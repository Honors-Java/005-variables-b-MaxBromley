background = 255;

int xx = (int) random(0,100);
int yy = (int) random(0,100);
int w = (int) random(0,100);
int h = (int) random(0,100);
void mousePressed(){
  background(255)
  fill((int) random(0, 255), (int) random(0,(int) random(0,255)),255);
  rect(mouseX + xx, mouseX + yy, mouseX + w, mouseY + h);


}

void setup() {
	size(500, 500);
}

void draw() {

 int r = (int) random(0, 255);
  int g = (int) random(0, 255);
  int b = (int) random(0, 255);

int x = (int) random(0,60);
int y = (int) random(0,60);





// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
fill(r,g,b);
ellipse(mouseX + x, mouseY + y,10,10);


}