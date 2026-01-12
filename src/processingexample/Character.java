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
    protected String name;
    protected int x;
    protected int y;
    protected int power;
    // intstance variable
    
    // static variable
    protected static int totalCharacters = 0;
    
    // overloaded constructors
    public Character() {
        this("Unknown",0,0,10);
    }
    
    public Character(String name, int x, int y, int power) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.power = power;
        totalCharacter++;
    }
    
    

