package proxy;
//Image的实现类
public class ImageObject implements Image{
    @Override
    public void draw() {
        System.out.println("hello:proxy");
    }
}
