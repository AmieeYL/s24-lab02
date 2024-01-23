package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shapeR = new Rectangle(2,3);
        Shape shapeC = new Circle(1);
        Shape shapeS = new Square(2);
        // Rectangle rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(shapeR);

        renderer.draw();
    }
}
