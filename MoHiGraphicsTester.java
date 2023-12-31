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
    graphics = new MoHiGraphics(200, 200);
    graphics.drawRectangle(50, 50, 100, 50);
    graphics.saveToFile("testoutput/rectangle.svg");

    // test triangle
    graphics = new MoHiGraphics(200, 200);
    graphics.drawTriangle(50, 50, 50);
    graphics.saveToFile("testoutput/EqTriangle.svg");
    
    // test irregular triangle
    graphics = new MoHiGraphics(200, 200);
    graphics.drawIrregularTriangle(10, 10, 100, 50, 50, 150);
    graphics.saveToFile("testoutput/irregularTriangle.svg");

    // test pentagon
    graphics = new MoHiGraphics(200, 200);
    graphics.drawPentagon(100, 100, 50);
    graphics.saveToFile("testoutput/pentagon.svg");
    
    // test hexagon
    graphics = new MoHiGraphics(200,200);
    graphics.drawHexagon(100,100,50);
    graphics.saveToFile("testoutput/hexagon.svg");

    //test arc method
    graphics = new MoHiGraphics(200,200);
    graphics.drawArc(100,100,50,50,0,30);
    graphics.saveToFile("testoutput/arc.svg");
    
    // test octagon
    graphics = new MoHiGraphics(200, 200);
    graphics.drawOctagon(100, 100, 50);
    graphics.saveToFile("testoutput/octagon.svg");

    // test drawLine
    graphics = new MoHiGraphics(200, 200);
    graphics.drawLine(0, 0, 200, 200);
    graphics.drawLine(0, 200, 200, 0);
    graphics.saveToFile("testoutput/lines.svg");
    
    // test transparency change

    // test line size change
    graphics = new MoHiGraphics(200,200);
    graphics.setLineSize(20);
    graphics.drawSquare(50, 50, 100);
    graphics.saveToFile("testoutput/strokeSquare.svg");

    // test rotate
    graphics = new MoHiGraphics(200, 200);
    graphics.drawSquare(50, 50, 100);
    graphics.rotate(45);
    graphics.drawSquare(50, 50, 100);
    graphics.rotate(-25);
    graphics.drawSquare(50, 50, 100);
    graphics.saveToFile("testoutput/rotate.svg");

		// test clearCanvas
		graphics.clearCanvas();
		graphics.saveToFile("testoutput/clearCanvas.svg");
		
    // test text
    graphics = new MoHiGraphics(200, 200);
    graphics.drawText("Hello",100, 100,12, 0, 0, 0, MoHiGraphics.BOLD_ITALIC,"Serif");
    graphics.saveToFile("testoutput/text.svg");

  }
}