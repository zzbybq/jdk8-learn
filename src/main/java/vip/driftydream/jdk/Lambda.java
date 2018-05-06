package vip.driftydream.jdk;

import java.awt.event.ActionListener;

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


    public static void main(String[] args){

    }
}
