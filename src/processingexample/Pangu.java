/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;

/**
 *
 * @author karenchen
 */
import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author karenchen
 */
public class Pangu {
  private int x, y;// position of the person
  private String name; // name of the person
  private int age; // age of the person
  private PApplet app; // the canvas used to display graphical element
  private PImage image;
  
  public Pangu(PApplet p, int x, int y, String name, int age, String imagePath) {
    this.app = p;
    this.x = x;
    this.y = y;
    this.name = name;
    this.age = age;
    this.image = app.loadImage(imagePath);
  }
  
  public void moveTo(int dx, int dy) {
      x += dx;
      y += dy;
  }
  
  public void draw() {
    app.image(image, x, y);
  }
}