package fr.alexandrenguyen.observer;

/**
 * Created by alenguye on 13/01/2017.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
