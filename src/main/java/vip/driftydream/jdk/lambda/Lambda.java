package vip.driftydream.jdk.lambda;

import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * Created by Administrator on 2018/5/5.
 */
public class Lambda {

    //Lambda表达式不包含参数，使用空括号()表示没有参数，该lambda表达式实现了Runnable接口，该接口也只有一个run方法，没有参数，且返回类型为void
    Runnable noArguments = () -> System.out.println("hello world");

    //Lambda表达式包含且只包含一个参数，可省略参数的括号
    ActionListener oneArgument = event -> System.out.println("button clicked");

    //Lambda表达式的主体不仅可以是一个表达式，而且也可以是一段代码块，使用大括号{}将代码块括起来，代码块和普通方法遵循的规则一样，可以用返回或抛出异常来退出
    //只有一行代码的Lambda表达式也可以使用大括号{}
    Runnable multiStatement = () -> {
        System.out.println("hello");
        System.out.println("world");
    };

    //Lambda表达式也可以表示包含多个参数的方法，这行代码并不是将两个数字相加，而是创建了一个函数，用来计算两个数字相加的结果
    //变量add的类型是BinaryOperator<Long>,它并不是两个数字的和，而是将两个数字相加的那行代码
    BinaryOperator<Long> add = (x, y) -> x + y;

    //Lambda表达式可以显式声明参数类型，需要使用小括号将参数括起来，多个参数的情况也是如此
    BinaryOperator<Long> addExplict = (Long x, Long y) -> x + y;

    //Lambda表达式的类型依赖于上下文环境，是由编译器推断出来的


    public static void main(String[] args) {

        //name是一个既成事实上的final变量，既成事实上的final是指只能给该变量赋值一次，也就是说Lambda表达式引用的是值而不是变量
        String name = getUserName();
        JButton button = new JButton();
        button.addActionListener(event -> System.out.println("hi " + name));

        //如果给该变量多次复制，然后再Lambda表达式中引用它，编译器就会报错:
        // variable used in lambda expression should be final or effectively final
        String userName = getUserName();
        userName = formatUserName(userName);
        //button.addActionListener(event -> System.out.println("hi " + userName));

        //上面的行为也解释了Lambda表达式被称为闭包
    }

    private static String getUserName() {
        return "lambda";
    }

    private static String formatUserName(String userName) {
        return userName + "learn";
    }
}
