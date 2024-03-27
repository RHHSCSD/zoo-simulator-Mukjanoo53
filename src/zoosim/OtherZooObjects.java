/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines a class for non-animal objects in the zoo, implementing the IObject interface to get to certain behaviors.
public class OtherZooObjects implements IObject {
    // Variable to hold the current orientation of the object in degrees.
    int degrees = 0;
    // Coordinates for the object's location in the zoo.
    int objX;
    int objY;
    // Dimensions of the object.
    int objWidthX;
    int objWidthY;
    // The type of object
    String type;
    // An array of possible object types. This could be used for validation or UI purposes.
    String[] objType = new String[]{"Rock", "Tree", "Food"};

    // Constructor to initialize an object with its location, dimensions, and type.
    public OtherZooObjects (int objX, int objY, int objWidthX, int objWidthY, String type){
        this.objX = objX;
        this.objY = objY;
        this.objWidthX = objWidthX;
        this.objWidthY = objWidthY;
        this.type = type;
    }

    // Implements the turn method from the IObject interface.
    // This method adjusts the object's orientation by the specified number of degrees.
    @Override
    public void turn(int degrees) {
        this.degrees += degrees; // Adds the given degrees to the current orientation.
    }

    // Implements the place method from the IObject interface.
    // This method sets the object's location to the specified coordinates.
    @Override
    public void place(int x, int y) {
        objX = x;
        objY = y; // Sets the object's position to the given coordinates.
    }
}
