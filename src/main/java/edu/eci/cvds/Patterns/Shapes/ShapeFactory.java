package edu.eci.cvds.Patterns.Shapes;

import edu.eci.cvds.Patterns.Shapes.Concrete.Hexagon;
import edu.eci.cvds.Patterns.Shapes.Concrete.Pentagon;
import edu.eci.cvds.Patterns.Shapes.Concrete.Quadrilateral;
import edu.eci.cvds.Patterns.Shapes.Concrete.Triangle;

public class ShapeFactory{

    public Shape create(RegularShapeType type) {
        Shape shape = null;
        switch (type) {
            case Triangle:
                shape = new Triangle();
                break;
            case Quadrilateral:
                shape = new Quadrilateral();
                break;
            case Hexagon:
                shape = new Hexagon();
                break;
            case Pentagon:
                shape = new Pentagon();
                break;
        }
        return shape;
    }
}