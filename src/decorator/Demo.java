package decorator;
//例子
public class Demo {
    public static void main(String[] args) {
        Shape shape=new ShapeObject();
        shape.draw();


        //实现功能扩展
        ShapeDecorator shapeDecorator=new ShapeDecorator(shape);
        shapeDecorator.draw();
    }
}
