/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines a WaterAnimal class that inherits from Animal and must implement the behaviors defined in the ISwimmable interface.
public class WaterAnimal extends Animal implements ISwimmable {
    // A specific property for water animals indicating whether they can breathe underwater.
    boolean canBreathe;
    int height;
    
    // Constructor that initializes a WaterAnimal object with its basic characteristics and the ability to breathe underwater.
    public WaterAnimal(String name, String species, char sex, int speed, int age, String sound) {
        // Calls the constructor of the superclass (Animal) to set common attributes.
        super(name, species, sex, speed, age, sound);
        // Sets the canBreathe property specific to WaterAnimal instances.
        this.canBreathe = true;
    }

    // Implements the canSwim method from the ISwimmable interface. 
    // Indicates that the animal can swim and modifies its height attribute to represent being underwater.
    @Override
    public boolean canSwim() {
        height = -1; // Height represents the animal's depth underwater
        return true; // Always returns true, indicating that WaterAnimal instances can swim.
    }

    // Implements the canSurface method from the ISwimmable interface.
    // Indicates that the animal can come to the water's surface.
    @Override
    public boolean canSurface() {
        height = 0; // Sets the height to 0, indicating the surface level of the water.
        return true; // Always returns true, indicating that WaterAnimal instances can surface.
    }
}
