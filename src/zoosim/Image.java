/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Mukarram
 */
// Defines a class to represent image data with basic properties.
public class Image {
    // Width of the image.
    int width;
    // Length (height) of the image.
    int length;

    // Constructor to initialize an Image object with specific dimensions.
    public Image(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // Getters and Setters for the width and length properties to provide easy access to these fields.
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
