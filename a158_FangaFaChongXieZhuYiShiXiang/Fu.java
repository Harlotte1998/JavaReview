package HeiMa.a158_FangaFaChongXieZhuYiShiXiang;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 17:12
 * @Version 1.0

1.9方法重写注意事项
    ●私有方法不能被重写(父类私有成员子类是不能继承的)
    ●子类方法访问权限不能更低(public> 默认>私有)


 */

public class Fu {

    private void show(){
        System.out.println("Fu中的 show方法 被调用");
    }

/*    public void method(){
        System.out.println("Zi中的 method方法被调用");
    }*/


     void method(){
        System.out.println("Zi中的 method方法被调用");
    }
    //  void前面没有修饰符  系统会自带一个默认的 修饰符   但是权限是最低的
    //  此时重写父类的方法  会报错
    //  子类 重写  父类 方法  子类访问权限不能小于父类

}
