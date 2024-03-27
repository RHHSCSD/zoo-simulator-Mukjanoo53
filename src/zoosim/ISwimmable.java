/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// An interface that defines swimming capabilities for implementing classes.
public interface ISwimmable {
    // Method to determine if the object can come to the surface of the water.
    public boolean canSurface();

    // Method to determine if the object can swim.
    public boolean canSwim();
}
