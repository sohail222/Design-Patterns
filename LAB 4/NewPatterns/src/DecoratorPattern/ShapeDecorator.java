package DecoratorPattern;

public abstract class ShapeDecorator implements Shape{
    Shape shapeobj;
    
    ShapeDecorator(Shape shape){
        this.shapeobj = shape;
    }
}
