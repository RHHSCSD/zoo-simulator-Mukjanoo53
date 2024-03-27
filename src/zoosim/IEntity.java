/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines an interface for entities, extending the capabilities of IObject to include common behaviors.
public interface IEntity extends IObject {
    // Method for moving the entity. 
    public void move();

    // Method for producing sound. 
    public void makeSound();

    // Method for eating. 
    public void eat();

    // Method for sleeping.
    public void sleep();
}
