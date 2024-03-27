/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.*;
/**
 *
 * @author Mukarram
 */
// Defines the Animal class that implements the IEntity interface
public class Animal implements IEntity {
    // Fields representing the animal's properties.
    int id;
    String name;
    String species;
    char sex;
    int age;
    // Position on the X and Y axis with initial out-of-bound values.
    int xPos = -10000;
    int yPos = -10000;
    // Dimensions of the animal
    int xWidth;
    int yWidth;
    // Speed of the animal, with predefined minimum and maximum values.
    int speed;
    int minSpeed = 1;
    int maxSpeed = 10;
    // The direction the animal is facing, in degrees.
    int degrees = 0;
    // Hunger and fatigue levels, represented as percentages.
    int hunger = 50;
    int fatigue = 50;
    // The height of the animals location
    int height = 0;
    // An Image object representing a visual representation of the animal.
    Image image;
    // The sound the animal makes.
    String sound;

    // Constructor to initialize an Animal object with basic attributes.
    public Animal(String name, String species, char sex, int speed, int age, String sound) {
        // Sets the animal's properties using the provided parameters.
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.sound = sound;
        this.age = age;

        // Validates and sets the speed, defaults to 5 if outside min/max range.
        if (speed < maxSpeed && speed > minSpeed) {
            this.speed = speed;
        } else {
            this.speed = 5;
        }
    }
    
    private void animalSetter(String name, String species, char sex, int speed, int age, String sound) {
    }

    // Implements movement by adjusting the animal's position based on its speed and direction.
    @Override
    public void move() {
        double radians = Math.toRadians(degrees);
        yPos += speed * Math.sin(radians);
        xPos += speed * Math.cos(radians);
    }

    // Outputs the sound the animal makes.
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    // Simulates eating, setting hunger to 100% and displaying the fullness level.
    @Override
    public void eat() {
        hunger = 100;
        System.out.println("Animal is " + hunger + " % full");
    }

    // Simulates sleeping, setting fatigue to 100% and displaying the wakefulness level.
    @Override
    public void sleep() {
        fatigue = 100;
        System.out.println("Animal is " + fatigue + " % awake");
    }

    // Adjusts the animal's facing direction by a specified number of degrees.
    @Override
    public void turn(int degrees) {
        this.degrees += degrees;
    }

    // Places the animal at a specified location.
    @Override
    public void place(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
