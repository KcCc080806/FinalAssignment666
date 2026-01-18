/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;

/**
 *
 * @author karenchen
 */
public class Character {
    protected int health;
    
    public Character() {
        this.health = 100;
    }
    
    public Character(int health) {
        this.health = health;
    }
    
    public void act() {
        System.out.println("The character is moving.");
    }
    
    public int getHealth() {
        return health;
    }
}