/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines a class for bird animals, extending the Animal class and implenting the IFlyable interface.
public class BirdAnimal extends Animal implements IFlyable {
    boolean canFly; // Indicates whether the bird can fly.
    int height; // Tracks the current flying height of the bird.
    
    // Constructor for BirdAnimal, initializing it with attributes specific to birds and the ability to fly
    public BirdAnimal(String name, String species, char sex, int age, int speed, String sound) {
        super(name, species, sex, speed, age, sound); // Call to the superclass constructor to initialize common attributes.
        this.canFly = true; // Assuming all instances of BirdAnimal can fly by default.
    }

    // Implements the fly method from the IFlyable interface.
    @Override
    public void fly() {
        if (canFly) {
            height = 1; // Sets a simple representation of being in flight. 
        }
    }

    // Implements the land method from the IFlyable interface.
    @Override
    public void land() {
        height = 0; // Resets height to 0, indicating landing.
    }

    // Implements the isFlying method from the IFlyable interface.
    @Override
    public boolean isFlying() {
        return height > 0; // If height is greater than 0, the bird is considered to be flying.
    }
}
