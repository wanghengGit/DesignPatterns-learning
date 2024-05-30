package designpatterns.interpreter.extend;
import java.util.*;

//���ʽ�ڵ��ࣺ���ս�����ʽ
public class ExpressionNode extends Node {
	private ArrayList<Node> list = new ArrayList<Node>(); //����һ���������ڴ洢��������
	
	public void interpret(Context context) {
      //ѭ������Context�еı��
		while (true){
          //����Ѿ�û���κα�ǣ����˳�����
			if (context.currentToken() == null) {
				break;
			}
          //������ΪEND���򲻽���END���������ν��͹��̣����Լ���֮��Ľ���
			else if (context.currentToken().equals("END")) {
				context.skipToken("END");
				break;
			}
          //���Ϊ������ǣ�����ͱ�ǲ�������������
			else {
				Node commandNode = new CommandNode();
				commandNode.interpret(context);
				list.add(commandNode);
			}
		}
	}
	
  //ѭ��ִ��������е�ÿһ������
	public void execute() {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			((Node)iterator.next()).execute();
		}
	}
}