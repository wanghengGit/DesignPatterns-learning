package designpatterns.interpreter.extend;

//ѭ������ڵ��ࣺ���ս�����ʽ
public class LoopCommandNode extends Node {
	private int number; //ѭ������
	private Node commandNode; //ѭ������еı��ʽ
	
  //����ѭ������
	public void interpret(Context context) {
		context.skipToken("LOOP");
		number = context.currentNumber();
		context.nextToken();
		commandNode = new ExpressionNode(); //ѭ������еı��ʽ
		commandNode.interpret(context);
	}
	
	public void execute() {
		for (int i=0;i<number;i++)
			commandNode.execute();
	}
}