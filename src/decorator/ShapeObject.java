package decorator;
//Shape的实现类
public class ShapeObject implements Shape{
    @Override
    public void draw() {
        System.out.println("color:red");
    }
}
