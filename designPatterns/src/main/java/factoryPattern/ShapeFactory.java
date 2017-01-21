package factoryPattern;

import factoryPattern.objects.Circle;
import factoryPattern.objects.Rectangle;
import factoryPattern.objects.Shape;
import factoryPattern.objects.Square;

import java.io.Serializable;

public class ShapeFactory implements Serializable {

    public Object getShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                System.out.println("Unknown shape");
                return null;
        }
    }

}
