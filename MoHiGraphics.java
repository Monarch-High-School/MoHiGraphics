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
import java.awt.geom.AffineTransform;

public class MoHiGraphics {

  /** instance of JFree's SVG Graphics library **/
  private SVGGraphics2D svgGraphics;
  private double w;
  private double h;
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


  public void drawOval(int centerX, int centerY, int width, int height) {
    
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
  
  public void drawEqTriangle() {
    
  }
  
  public void drawTriangle() {
    
  }

  public void drawPentagon() {
    
  }
  
  public void drawHexagon() {
    
  }

  public void drawOctagon() {
    
  }
  
  public void setTransparent(boolean transparent) {

  }
  
  public void setLineSize(int size) {
    
  } 

  /** 
   * Rotates the canvas by (degree).
   * Positive degree rotates canvas clockwise 
   * Negative degree rotates canvas anticlockwise
   * @param degree rotates the canvas by degrees
   */

  public void rotate(int degree)
  {
    AffineTransform rotation = AffineTransform.getRotateInstance(Math.toRadians(degree),svgGraphics.getWidth()/2,svgGraphics.getHeight()/2);
    svgGraphics.transform(rotation);
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