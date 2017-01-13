package fr.alexandrenguyen.observer;

/**
 * Created by alenguye on 13/01/2017.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
}
