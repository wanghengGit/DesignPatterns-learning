package designpatterns.interpreter.extend;

//��������ڵ��ࣺ�ս�����ʽ
public class PrimitiveCommandNode extends Node {
	private String name;
	private String text;
	
  //���ͻ�������
	public void interpret(Context context) {
		name = context.currentToken();
		context.skipToken(name);
	    if (!name.equals("PRINT") && !name.equals("BREAK") && !name.equals ("SPACE")){
			System.err.println("�Ƿ����");
		}
		if (name.equals("PRINT")){
			text = context.currentToken();
			context.nextToken();
		}
	}
	
	public void execute(){
		if (name.equals("PRINT"))
			System.out.print(text);
		else if (name.equals("SPACE"))
			System.out.print(" ");
		else if (name.equals("BREAK"))
			System.out.println();
	}
}