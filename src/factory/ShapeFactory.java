package factory;
//定义工厂对象
public class ShapeFactory {

    //根据传入参数提供不同的对象
    public Shape getShape(String color){
        if(color=="red"){
            return new ShapeObject1();
        }else if (color=="green"){
            return new ShapeObject2();
        }else if (color=="pink"){
            return new ShapeObject3();
        }
        return null;
    }

}
