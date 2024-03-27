/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines a class for land animals, extending the Animal class.
// This inheritance implies that LandAnimal shares all characteristics and behaviors defined in Animal.
public class LandAnimal extends Animal{
    
    // Constructor for the LandAnimal class. It simply calls the superclass (Animal) constructor
    // with all the necessary parameters for initializing an animal object.
    public LandAnimal(String name, String species, char sex, int speed, int age, String sound) {
        super(name, species, sex, speed, age, sound);
        // Here, the super keyword is used to invoke the constructor of the parent class (Animal),
        // ensuring that a LandAnimal object is properly initialized with the given attributes.
    }
}
