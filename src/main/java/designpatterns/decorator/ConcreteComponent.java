package designpatterns.decorator;

//具体组件  “一幅画”
public class ConcreteComponent implements Component{
    @Override
    public void samp() {
        System.out.println("i am an picture");
    }
}