# MoHi Graphics

Version 0.1 - Monarch High School, Coding Capstone Class, 2023-2024

© August-September 2023

## Overview
This Java class was developed for introductory AP Computer Science A students to start a first project in graphics programming without having to learn the nuances of the AWT library. The goal is to expose an easier to use set of methods that will generate simple shapes in a more intuitive way. 

The class utilizes JFree organization's SVG library so that the output can be in raster instead of vector format.

## Dependencies, Building, and Usage
This library is intended to be compiled and the resulting `.class` file is intended to be packaged as a jar file using the command:
```sh
jar cf MoHiGraphics.jar MoHiGraphics.class
```

### Dependencies
Before building, the [JFree SVG library](https://www.jfree.org/jfreesvg/) (Download link) should be downloaded as a `.jar` file and added to the classpath. 

### Build
To build the library, use the command
`javac MoHiGraphics.java`

### Usage
When added to the classpath, no import statement should be needed. The object can be instantiated with: 
```java
MoHiGraphics graphics = new MoHiGraphics(100, 100);
``` 
where the arguments to the constructor are the width and height of the image.

## Testing
The `MoHiGraphicsTester` class contains an executable `main()` method that will call each of the methods and save an appropriate SVG file to a folder called `testoutput`.

## Team Members
- Stephen Buch
- Parth Chudappa
- Zach Dykstra
- Jonah Kim
- Josh Kim
- Ishani Pandey
- Yash Ruhil
- Max Webb
- Ben Willcutt
- Kevin Wong