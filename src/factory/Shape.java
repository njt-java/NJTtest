package factory;

/**
 * 设计模式：工厂模式：
 * 创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 * 主要解决接口选择的问题。
 * 一个接口；多个实现类；一个提供这些实现类的工厂类
 */
public interface Shape {
    //定义接口
    void draw();
}
