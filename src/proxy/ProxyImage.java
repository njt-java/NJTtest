package proxy;

/**
 * 定义ImageObject的代理类（继承相同接口）
 *
 * 当被请求时，可以使用 代理对象ProxyImage 来获取 RealImage 类的对象功能。
 * Image image=new ProxyImage();
 * image.display();
 */

public class ProxyImage implements Image{

    private ImageObject imageObject;


    //对外提供ImageObject的功能
    @Override
    public void draw() {
        if(imageObject==null){
            imageObject=new ImageObject();
        }
        imageObject.draw();
    }
}
