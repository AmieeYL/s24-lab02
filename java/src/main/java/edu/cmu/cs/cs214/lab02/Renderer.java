package edu.cmu.cs.cs214.lab02;

import javax.sound.midi.ShortMessage;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape shape;
    
    public Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
