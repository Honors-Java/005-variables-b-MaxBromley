//background = 255;
int rectX = (int) random(0,300);
int rectY = (int) random(0,300);
int rectH = (int) random(0,300);
int rectW = (int) random(0,300);

int red = (int) random(0, 255);
  int green = (int) random(0, 255);
  int blue = (int) random(0, 255);



void setup() {
	size(500, 500);
}

void draw() {
stroke(0);
 
int x = (int) random(mouseX + 20,mouseX - 20);
int y = (int) random(mouseY + 20,mouseY - 20);

//println(mouseX, mouseY)
  int r = (int) random(0, 255);
  int g = (int) random(0, 255);
  int b = (int) random(0, 255);
fill(r,g,b);
ellipse(x,y,10,10);
 fill(red, blue, green);
rect(rectX, rectY, rectH, rectW);
}



// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

void mousePressed(){
  red = random(0,255)
green = random(0,255)
blue = random(0,255)
  background(255)
  rectX = random(0,300)
rectY = random(0,300)
rectW = random(0,300)
rectH = random(0,300)
}


