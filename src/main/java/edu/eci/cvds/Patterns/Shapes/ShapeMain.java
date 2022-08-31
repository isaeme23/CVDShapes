package edu.eci.cvds.Patterns.Shapes;
public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory example = new ShapeFactory();
        if (args == null || args.length != 1){
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = example.create(type);
            System.out.println(String.format("Successfully created a %s with %s sides.", type,shape.getNumberOfEdges()));
        } catch (IllegalArgumentException ex) {System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}