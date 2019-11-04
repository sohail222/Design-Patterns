package DecoratorPattern;

public class Main {
    public static void main(String args[]){
        Shape obj = new Circle();
        ShapeDecorator redobj = new RedShapeDecorator(obj);
        redobj.draw();
    }
}
