package fr.alexandrenguyen.decorator;

/**
 * Created by alenguye on 12/01/2017.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I draw a rectangle");
    }
}
