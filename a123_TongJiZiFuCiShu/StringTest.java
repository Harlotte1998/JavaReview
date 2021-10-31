package HeiMa.a123_TongJiZiFuCiShu;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 10:44
 * @Version 1.0

案例:统计字符次数
需求:键盘录入-个字符串,统计该字符串中大写字母字符,小写字母字符，数字字符出现的次数(不考虑其他字符
    思路:
        ①键盘录入一个字符串，用Scanner实现
        ②要统计三种类型的字符个数,需定义三个统计变量，初始值都为0
        ③遍历字符串,得到每-个字符
        ④判断该字符属于哪种类型，然后对应类型的统计变量+1
            假如ch是一个字符， 我要判断它属于大写字母，小写字母，还是数字,
            直接判断该字符是否在对应的范围即可
            ●大写字母: ch>='A' &&ch<='Z'
            ●小写字母: ch>='a' &&ch<='z'
            ●数字: ch>='0' &&ch<='9'

            使用==做比较
                ●基本类型:比较的是数据值是否相同
                ●引用类型: 比较的是地址值是否相同
            字符串是对象，它比较内容是否相同,是通过一个方法来实现的，这个方法叫: equals()
                ●public boolean equals(Object anObject):将此字符串与指定对象进行比较。
            由于我们比较的是字符串对象，所以参数直接传递一个字符串

            ⑤输出三种类型的字符个数



 */

public class StringTest {
    public static void main(String[] args) {
        //①键盘录入一个字符串，用Scanner实现
        System.out.println("请输入一串字符");
        Scanner sc =new Scanner(System.in);
        String line=sc.nextLine();

        //②要统计三种类型的字符个数,需定义三个统计变量，初始值都为0
        int i=0;
        int j=0;
        int k=0;
        //③遍历字符串,得到每-个字符
        for(int m=0;m<line.length();m++){
            char ch=line.charAt(m);
            //④判断该字符属于哪种类型
            if (ch>='A' &&ch<='Z'){
                //然后对应类型的统计变量+1
                i++;
            }else if(ch>='a' &&ch<='z'){
                j++;
            }else if(ch>='0' &&ch<='9'){
                k++;
            }
        }

        //⑤输出三种类型的字符个数
        System.out.println("大写字母字符:"+i );
        System.out.println("小写字母字符:"+j);
        System.out.println("数字字符:"+k);


    }
}
