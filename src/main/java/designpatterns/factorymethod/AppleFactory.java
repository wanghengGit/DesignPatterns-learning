package designpatterns.factorymethod;

import designpatterns.factory.IPhone;
import designpatterns.factory.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}