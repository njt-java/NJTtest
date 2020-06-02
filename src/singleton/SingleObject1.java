package singleton;
/**
 * 设计模式：单例模式：
 * 模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 单例类只能有一个实例。单例类必须自己创建自己的唯一实例。单例类必须给所有其他对象提供这一实例。
 *
 * 1.饿汉式：不会等到要用的时候创建，类加载的时候就创建了
 * 线程安全 比较常用，但容易产生垃圾对象，类加载就初始化，浪费内存
 */
public class SingleObject1 {
    //创建 SingleObject 的一个对象
    private static SingleObject1 singleObject=new SingleObject1();

    //私有化构造方法，这样该类就不会被实例化
    private SingleObject1(){};

    //对外提供获取单一对象的方式
    public static SingleObject1 getSingleObject(){
        return singleObject;
    }
}
