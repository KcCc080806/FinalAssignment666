/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import processing.core.PApplet; 

/**
 *
 * @author karenchen
 */
    public class MySketch extends PApplet {
    private Person person;
    String userInput = "";
    int stage = 0;
    
    public void settings() {
        size(400,400);
    }
    
    public void setup() {
        background(255);
        textSize(20);
        person = new Person(this, 20, 30, "Mr.Loo", 99, "images/car.png");
    }
    
    public void draw() {
        background(255);
        
        if(stage == 0) {
            fill(0);
            text("Enter text:", 20, 50);
            text(userInput, 20, 100);
        } else if (stage == 1) {
            person.draw();
            
            if(keyPressed) {
                if(keyCode == LEFT) {
                    person.moveTo(-5,0);
                } else if(keyCode == RIGHT) {
                    person.moveTo(5,0);
                } else if(keyCode == UP) {
                    person.moveTo(0,-5);
                } else if(keyCode == DOWN) {
                    person.moveTo(0,5);
                }
            }
        }
    }
    public void keyPressed() {
        if(stage == 0) {
            if (keyCode == ENTER) {
                stage = 1;
            } else if(key != CODED) {
                userInput += key;
            }
        }
    }
}

   