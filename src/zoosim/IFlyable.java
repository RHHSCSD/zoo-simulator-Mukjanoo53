/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines an interface for objects capable of flight.
public interface IFlyable {
    // Method to initiate flight.
    public void fly();

    // Method to handle the landing process.
    public void land();

    // Method to check if the object is currently in flight. Returns true if the object is flying, false otherwise.
    public boolean isFlying();
}

