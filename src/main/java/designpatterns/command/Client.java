//designpatterns.command.Client.java
package designpatterns.command;

public class Client {
	public static void main(String args[]) {
		FBSettingWindow fbsw = new FBSettingWindow("���ܼ�����");
			
		FunctionButton fb1,fb2;
		fb1 = new FunctionButton("���ܼ�1");
		fb2 = new FunctionButton("���ܼ�2");
		
		Command command1,command2;
        //ͨ����ȡ�����ļ��ͷ������ɾ����������
		command1 = (Command)XMLUtil.getBean(0);
		command2 = (Command)XMLUtil.getBean(1);
	    
        //���������ע�빦�ܼ�
		fb1.setCommand(command1);
		fb2.setCommand(command2);
		
		fbsw.addFunctionButton(fb1);
		fbsw.addFunctionButton(fb2);
		fbsw.display();
		
        //���ù��ܼ���ҵ�񷽷�
		fb1.onClick();
		fb2.onClick();
	}
}