package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{
    
    RedShapeDecorator(Shape shape){
        super(shape);
    }
    
        
    public void setRedBorder(){
        System.out.println("Setting Red Border");
    }
    
    public void draw(){
        shapeobj.draw();
    }
    
}
