package singleton;
/**
 * 设计模式：单例模式：
 * 模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 单例类只能有一个实例。单例类必须自己创建自己的唯一实例。单例类必须给所有其他对象提供这一实例。
 *
 * 1.懒汉式（线程安全的如下）: 要用的时候才创建对象
 */
public class SingleObject2 {
    //创建 SingleObject 的一个对象
    private static SingleObject2 singleObject;

    //私有化构造方法，这样该类就不会被实例化
    private SingleObject2(){};

    //对外提供获取单一对象的方式
    public static synchronized SingleObject2 getSingleObject(){
        if(singleObject==null){
            return new SingleObject2();
        }
        return singleObject;
    }
}
