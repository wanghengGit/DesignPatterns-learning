package designpatterns.abstractfactory;

import designpatterns.factory.Phone;

public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}