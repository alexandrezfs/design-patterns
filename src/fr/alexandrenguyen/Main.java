package fr.alexandrenguyen;

import fr.alexandrenguyen.adapter.AudioPlayer;
import fr.alexandrenguyen.decorator.Circle;
import fr.alexandrenguyen.decorator.RedShapeDecorator;
import fr.alexandrenguyen.decorator.Shape;
import fr.alexandrenguyen.observer.BinaryObserver;
import fr.alexandrenguyen.observer.HexaObserver;
import fr.alexandrenguyen.observer.OctalObserver;
import fr.alexandrenguyen.observer.Subject;

public class Main {

    public static void main(String[] args) {

        System.out.println("Playing design pattern adapter");

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();

        System.out.println("Playing design pattern decorator");

        Shape redShapeDecorator = new RedShapeDecorator(new Circle());
        redShapeDecorator.draw();

        System.out.println("Playing design pattern observer");

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
    }

}
