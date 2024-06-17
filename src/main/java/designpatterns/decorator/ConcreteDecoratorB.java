package designpatterns.decorator;

//具体装饰器B
class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void samp(){
        super.samp();
        System.out.println("给这个picture加个玻璃");
    }
}