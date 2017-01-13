package fr.alexandrenguyen.decorator;

/**
 * Created by alenguye on 12/01/2017.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        System.out.println("I draw red");
    }

    public void setRedBorder() {
        System.out.println("And I set red border");
    }
}
