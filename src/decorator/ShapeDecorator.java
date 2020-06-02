package decorator;
//创建扩展了 ShapeDecorator 类的实体装饰类。
public class ShapeDecorator extends ShapeAbstract {

    public ShapeDecorator(Shape shape){
        super(shape);
    }

    //对外提供扩展的功能
    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    //将原实现类传入，实现功能扩展。
    private void setRedBorder(Shape shape){
        System.out.println("Border Color: Red");
    }
}
