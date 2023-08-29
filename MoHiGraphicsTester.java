/**
 * MoHiGraphicsTester
 * This class is intended for beginning Java programming students
 * who would like to engage in simple graphics programming. It
 * provides more explicit methods and more intuitive parameters
 * that wrap around JFree's SVG library (which itself is a subclass
 * of the Java AWT Library
 * 
 * @author Monarch High School - 2023-2024 Capstone Course
 * @version August 24, 2023
 * @since 0.1
 */

class MoHiGraphicsTester {

  public static void main(String[] args) {
    // declare graphics object
    MoHiGraphics graphics;

    // test circle
    graphics = new MoHiGraphics(200, 200);
    graphics.drawCircle(100, 100, 50);
    graphics.saveToFile("testoutput/circle.svg");


      // test oval
    graphics = new MoHiGraphics(200,200);
		graphics.drawOval(50,50,50,100);
    graphics.saveToFile("testoutput/oval.svg");
		
      // test square
    graphics = new MoHiGraphics(200, 200);
    graphics.drawSquare(50, 50, 100);
    graphics.saveToFile("testoutput/square.svg");

    // test rectangle


    // test triangle

    // test irregular triangle
    graphics = new MoHiGraphics(200, 200);
    graphics.drawIrregularTriangle(10, 10, 100, 50, 50, 150);
    graphics.saveToFile("testoutput/irregularTriangle.svg");

    // test pentagon

    // test hexagon
    graphics = new MoHiGraphics(200,200);
    graphics.drawHexagon(100,100,50);
    graphics.saveToFile("testoutput/hexagon.svg");

    //test arc method
    graphics = new MoHiGraphics(200,200);
    graphics.arc(100,100,50,50,0,30);
    graphics.saveToFile("testoutput/arc.svg");
    
    // test octagon

    // test transparency change
    graphics = new MoHiGraphics(200, 200);
    graphics.drawCircle(100, 100, 50);
    graphics.setTransparent(true);
    graphics.drawCircle(50, 50, 50);
    graphics.saveToFile("testoutput/transparency.svg");

    // test line size change

  }
}