package HeiMa.a187_01_LeiMingZuoWeiXingCanHeFanHuiZhi;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/10 18:58
 * @Version 1.0

猫的操作类
 */
public class CatOperator {

    //将Cat 作为这个方法的形参
    public void useCat(Cat c){
        //在这个方法内部 通过变量c 调用了方法 eat
        c.eat();
    }


    //类名作为返回值    返回值是 Cat类型的数据
    public Cat getCat(){
        Cat c=new Cat();
        return  c;
    }

}
