package decorator;
//创建实现了 Shape 接口的抽象装饰类。
public abstract class ShapeAbstract implements Shape{
    protected Shape shape;

    public ShapeAbstract(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
    }

}
