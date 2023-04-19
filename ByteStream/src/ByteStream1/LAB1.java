package ByteStream1;

public class LAB1 {
    public static void main(String[] args){
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();

        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle);
        rectangleDecorator.draw();
    }
}
