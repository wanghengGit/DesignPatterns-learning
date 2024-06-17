package designpatterns.decorator;/**
 * @author wangheng
 * @date 2024/06/17 16:29
 * @desc
 **/

/**
 * packageName designpatterns.decorator
 * @author wangheng
 * @version JDK 17
 * @className Test
 * @date 2024/6/17
 * @description TODO
 */
public class Test {

    public static void main(String[] args) {
        Component comp=new ConcreteComponent();

        //给这幅画加一个画框
        Component comp1=new ConcreteDecoratorA(comp);
        comp1.samp();

        //再给这幅画加个玻璃
        System.out.println("=============================");
        Component comp2=new ConcreteDecoratorB(comp1);
        comp2.samp();
    }

}