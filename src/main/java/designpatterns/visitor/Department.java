//designpatterns.visitor.Department.java
package designpatterns.visitor;

//�����ࣺ�����������
public abstract class Department {
    //����һ�����صķ��ʷ��������ڷ��ʲ�ͬ���͵ľ���Ԫ��
	public abstract void visit(FulltimeEmployee employee);
	public abstract void visit(ParttimeEmployee employee);	
}