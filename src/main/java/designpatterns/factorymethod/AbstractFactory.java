package designpatterns.factorymethod;

import designpatterns.factory.Phone;

public interface AbstractFactory {
    Phone makePhone();
}