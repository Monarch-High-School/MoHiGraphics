/**
 * MoHiGraphics
 * This class is intended for beginning Java programming students
 * who would like to engage in simple graphics programming. It 
 * provides more explicit methods and more intuitive parameters
 * that wrap around JFree's SVG library (which itself is a subclass 
 * of the Java AWT Library
 * @author Monarch High School - 2023-2024 Capstone Course
 * @version August 24, 2023
 * @since 0.1
 */

import java.awt.*;
import org.jfree.svg.*;
import java.io.FileWriter;
import java.io.IOException;

public class MoHiGraphics {

  /** instance of JFree's SVG Graphics library **/
  private SVGGraphics2D svgGraphics;

  /**
   * Creates a new MoHiGraphics object.
   *
   * @param width The width of the image in pixels
   * @param height The height of the image in pixels
   */
  public MoHiGraphics(double width, double height) {
      // set up svggraphics object
    svgGraphics = new SVGGraphics2D(width, height);

      // set default stroke to 1
    svgGraphics.setStroke(new BasicStroke(1.0f));
  }

  /** 
   * Draws a circle with center at (centerX, centerY) with radius.
   * @param centerX the x coordinate of the center
   * @param centerY the y coordinate of the center
   * @param radius the radius of the circle
   */
  public void drawCircle(int centerX, int centerY, int radius) {
    svgGraphics.drawOval(centerX-radius, centerY-radius, radius*2, radius*2);
  }


  /**
 	 * Draws a oval with center at centerX,centerX with width
	 * @param centerX the x coordinate of the center
	 * @param centerY the y coordinate of the center
	 * @param width the width of the oval
	 * @param height the height of the oval
	**/

  public void drawOval(int centerX, int centerY, int width, int height) {
    svgGraphics.drawOval(centerX-(width/2),centerY-(height/2),width,height);
  }

  
  /** 
   * Draws a square with upper left corner at (leftTopX, leftTopY) with size.
   * @param leftTopX the x coordinate of the upper left corner
   * @param leftTopY the y coordinate of the upper left corner
   * @param size the size of the square
   */
  public void drawSquare (int leftTopX, int leftTopY, int size) {
    int[] xCoords = new int[] {leftTopX, leftTopX+size, leftTopX+size, leftTopX};
    int[] yCoords = new int[] {leftTopY, leftTopY, leftTopY+size, leftTopY+size};
    
    svgGraphics.drawPolygon(xCoords, yCoords, 4);
  }

  public void drawRectangle(int leftTopX, int leftTopY, int width, int height) {
   
  }

  
  public void drawTriangle() {
    
  }

  
  /**
 * @param x1 the x coordinate of the first point on the triangle
 * @param y1 the y coordinate of the first point on the triangle
 * @param x2 the x coordinate of the second point on the triangle
 * @param y2 the y coordinate of the second point on the triangle
 * @param x3 the x coordinate of the third point on the triangle
 * @param y3 the y coordinate of the third point on the triangle
 */
  public void drawIrregularTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    int[] xCoords = new int[] {x1,x2,x3};
    int[] yCoords = new int[] {y1,y2,y3};
    svgGraphics.drawPolygon(xCoords,yCoords,3);

  }

  public void drawPentagon() {
    
  }

 /**
  * Draws a regular hexagon: so, the shape has 6 equal sides and 6 
  * interior angles, each with a measure of 120 degrees
  * @param centerX, the x-coordinate of the center of the hexagon
  * @param centerY, the y-coordinate of the center of the hexagon
  * @param distToVertex, the length of the line from the center to 
  * any vertex/corner of the hexagon
  * With the distance to a corner and the Math class built into 
  * Java, the x and y values for all six vertices of the hexagon can 
  * be calculated, and so the method can draw a regular hexagon
  */
  public void drawHexagon(int centerX, int centerY, int distToVertex) 
  {
    int valY = (int) (distToVertex /2);
    int valX = (int)(distToVertex * Math.cos(Math.PI/6));
    int [] xPts = new int[] {centerX - valX, centerX,centerX + valX, centerX + valX, centerX, centerX - valX};
    int [] yPts = new int[] {centerY - valY, centerY - 2*valY, centerY - valY, centerY + valY, centerY + 2*valY, centerY + valY};
    svgGraphics.drawPolygon(xPts, yPts, 6);
  }

   public void arc(int x, int y, int width, int height, int startAngle, int arcAngle)
  {
    svgGraphics.drawArc(x,y,width,height,startAngle,arcAngle);
  }
  
  public void drawOctagon() {
    
  }

  /**
   * Sets brush to transparent or opaque
   * @param boolean to set transparency on/off
   */
  public void setTransparent(boolean transparent) {
    Color col = svgGraphics.getColor();
    int red = col.getRed();
    int green = col.getGreen();
    int blue = col.getBlue();

    int alpha = transparent ? 0 : 255;
    
    svgGraphics.setColor(new Color( red, green, blue, alpha ));
  }
  
  public void setLineSize(int size) {
    
  } 
  
  /**
   * Overlays a grid in reflex blue color.
   * The gridlines will be added at increments 
   * specified in the parameter.
   * @param increments How frequently to draw a grid line
   */
  public void addGrid(int increments) {
      // force negative increments to be positive
    if (increments < 0) increments *= -1;
      // set 0 increments to be 10
    if (increments == 0) increments = 10;
      // set color to reflex blue (23,23,150)
    svgGraphics.setColor(new Color(23, 23, 150));
      // set stroke size to 0.25
    svgGraphics.setStroke(new BasicStroke(0.25f));
      // set number offsets
    int verticalNumOffset = 10;
    int horizontalNumOffset = 5;
      // add vertical grid lines and number
    for (int i = 0; i <= svgGraphics.getWidth(); i += increments) {
      svgGraphics.drawLine(i, 0, i, (int)svgGraphics.getHeight());
        // only numbers beyond 0
      if (i > 0) svgGraphics.drawString(String.valueOf(i), i-horizontalNumOffset, verticalNumOffset);
    }
      // add horizontal grid lines
    for (int i = 0; i <= svgGraphics.getHeight(); i += increments) {
      svgGraphics.drawLine(0, i, (int)svgGraphics.getWidth(), i);     // offset numbers
      int offset = (i == 0) ? i+verticalNumOffset : i+horizontalNumOffset;
      svgGraphics.drawString(String.valueOf(i), 0, offset);
    }
    
      // reset strok to black and 0.25
    svgGraphics.setColor(Color.BLACK);
    svgGraphics.setStroke(new BasicStroke(1.0f));
  }
  
  /**
   * Saves the current image to a file given by 
   * filename in SVG format.
   * @param filename String representing the filename to save to.
   */
  public void saveToFile(String filename) {
      // write the SVG data to file
      // we can use FileWriter because SVG is text
    try {
      FileWriter outFileWriter = new FileWriter(filename);
      outFileWriter.write(svgGraphics.getSVGDocument());
      outFileWriter.close();
    }
    catch (IOException e) {
      System.out.println("Could not write file because "+e.getMessage());
    }
  }
}