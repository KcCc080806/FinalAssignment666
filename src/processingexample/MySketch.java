/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import processing.core.PApplet; 
import processing.core.PImage;

/**
 *
 * @author karenchen
 */
    public class MySketch extends PApplet {
    private Person person;
    String userInput = "";
    int stage = 0;
    private PImage image;
    
    public void settings() {
        size(1400,800);
    }
    
    public void setup() {
        background(255);
        textSize(20);
        person = new Person(this, 20, 30, "Mr.Loo", 99, "images/pangu.png");
        this.image = this.loadImage("images/World.png");
    }
    
    public void draw() {
        background(255);
        
        
        if(stage == 0) {
            fill(0);
            text("Long ago, before heaven and earth existed, the universe was in a state of chaos.\n" + "\n" + "Within this "
                    + "chaos, a giant" + "named Pangu was born and slept for thousands of years.\n" + "\n" + "When Pangu "
                    + "awoke, he saw that the world " + "had no order. To bring balance, he used a great axe to separate "
                    + "the chaos.\n" + "\n" + "The light elements rose to form " + "the sky, while the heavy elements sank to become the "
                    + "earth.\n" + "\n" + "Standing between heaven and earth, " + "Pangu grew taller each day to keep them "
                    + "apart. Over time, the world stabilized, but Pangu became " + "exhausted.\n" +"\n" + "When Pangu finally"
                    + " fell, his body transformed into the natural world.\n" + "\n" + "His breath became the wind, his voice became "
                    + "thunder, his eyes became the sun and moon, and his blood formed " + "rivers.\n" + "\n" + "Through "
                    + "Pangu’s sacrifice, the world was created and life was made possible.", 150, 200);
            text(userInput, 20, 100);
        } else if (stage == 1) {
            this.image(image, 0, 0);
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

   