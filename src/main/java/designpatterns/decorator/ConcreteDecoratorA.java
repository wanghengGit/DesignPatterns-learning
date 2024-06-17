package designpatterns.decorator;

//具体装饰器A
class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void samp(){
        super.samp();
        System.out.println("给这个picture加个画框");
    }
}

