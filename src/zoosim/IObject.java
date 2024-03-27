/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines an interface for Objects.
public interface IObject {
    // Method to rotate the object by a specified number of degrees.
    public void turn(int degrees);

    // Method to place the object at a specified location within the environment.
    public void place(int x, int y);
}


