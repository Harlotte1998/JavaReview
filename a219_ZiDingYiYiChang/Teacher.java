package HeiMa.a219_ZiDingYiYiChang;

/**
 * @author ：LC
 * @date ： 2021/11/16 16:48

.1.8自定义异常
格式:
    public class异常类名extends Exception {
        无参构造
        带参构造
    }


    范例:
    public class ScoreException extends Exception {
        public ScoreException() {}
        public ScoreException (String message) {
            super (message) ;
        }
    }

ScoreException



1.9 throws和throw的区别
    throws
        ●用在方法声明后面，跟的是异常类名
        ●表示抛出异常，由该方法的调用者来处理
        ●表示出现异常的一种可能性，并不一 定会发生这些异常

    throw
        ●用在方法体内, 跟的是异常对象名
        ●表示抛出异常， 由方法体内的语句处理
        ●执行throw-定抛出了某种异常



 */
public class Teacher {




    public void checkScore(int score) throws ScoreException{
        if (score<0|| score>100){
//            throw new ScoreException();
            throw new ScoreException("你输入的参数有误");



        }else {
            System.out.println("分数正常");
        }
    }
}
