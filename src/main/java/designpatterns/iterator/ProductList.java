//designpatterns.iterator.ProductList.java
package designpatterns.iterator;
import java.util.*;

//��Ʒ�����ࣺ����ۺ���
public class ProductList extends AbstractObjectList {
	public ProductList(List<Object> products) {
		super(products);
	}
	
	//ʵ�ִ�������������ľ��幤������
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
} 
