package HeiMa.a154_JiChengZhongGouZaoFangFaDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:40
 * @Version 1.0
 */

public class Zi extends Fu{
    public  Zi(int age) {
        super(20);
        System.out.println("Zi中带参构造方法被调用");
    }

    public  Zi() {
        super(20);
        System.out.println("Zi中无参构造方法被调用");
    }
}
