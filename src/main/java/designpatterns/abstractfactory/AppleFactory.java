package designpatterns.abstractfactory;

import designpatterns.factory.IPhone;
import designpatterns.factory.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}