/**
 * MoHiGraphicsTester
 * This class is intended for beginning Java programming students
 * who would like to engage in simple graphics programming. It 
 * provides more explicit methods and more intuitive parameters
 * that wrap around JFree's SVG library (which itself is a subclass 
 * of the Java AWT Library
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
    
    
      // test square
    graphics = new MoHiGraphics(200, 200);
    graphics.drawSquare(50, 50, 100);
    graphics.saveToFile("testoutput/square.svg");


      // test rectangle


      // test equilateral triangle


      // test triangle


      // test pentagon


      // test hexagon

    
      // test octagon


      // test transparency change


      // test line size change

  }
}