package designpatterns.factorymethod;

import designpatterns.factory.MiPhone;
import designpatterns.factory.Phone;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}