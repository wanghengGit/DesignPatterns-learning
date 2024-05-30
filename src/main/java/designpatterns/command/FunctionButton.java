package designpatterns.command;

//���ܼ��ࣺ��������
public class FunctionButton {
	private String name; //���ܼ�����
	private Command command; //ά��һ������������������
	
	public FunctionButton(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
  //Ϊ���ܼ�ע������
	public void setCommand(Command command) {
		this.command = command;
	}
	
  //��������ķ���
	public void onClick() {
		System.out.print("������ܼ���");
		command.execute();
	}
}