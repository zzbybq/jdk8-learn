package vip.driftydream.jdk.lambda;

import java.awt.event.ActionEvent;
import java.util.EventListener;

/**
 * Lambda表达式本身的类型：函数接口，使用只有一个方法的接口来表示某特定方法并反复使用
 * Created by Administrator on 2018/5/6.
 */
public interface ActionListener extends EventListener {

    void actionPerformed(ActionEvent event);
}

//java中重要的函数接口
//Predicate<T>  参数:T,返回类型:boolean 这张唱片已经发行了吗
//Consumer<T> 参数:T,返回类型:void  输出一个值
//Function<T,R> 参数:T,返回类型:R   获得Artist对象的名字
//Supplier<T> 参数:None,返回类型：T  工厂方法
//UnaryOperator<T> 参数:T,返回类型:T  逻辑非(!)
//BinaryOperator<T> 参数:(T,T),返回类型:T  求两个数的乘积(*)

