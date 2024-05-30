//designpatterns.command.calculator.AbstractCommand.java
package designpatterns.command.calculator;

//����������
public abstract class AbstractCommand {
	public abstract int execute(int value); //��������ִ�з���execute()
	public abstract int undo(); //������������undo()
}

