package designpatterns.decorator;

//抽象装饰器
class Decorator implements Component{

    private Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void samp() {
        this.component.samp();
    }
}
