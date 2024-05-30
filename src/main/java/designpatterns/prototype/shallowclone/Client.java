//designpatterns.prototype.shallowclone.Client.java
package designpatterns.prototype.shallowclone;

public class Client {
	public static void main(String args[]) {
		WeeklyLog log_previous = new WeeklyLog(); //����ԭ�Ͷ���
		log_previous.setName("���޼�");
		log_previous.setDate("��12��");
		log_previous.setContent("���ܹ�����æ��ÿ��Ӱ࣡");
		
		System.out.println("****�ܱ�****");
		System.out.println("�ܴΣ�" + log_previous.getDate());
		System.out.println("������" + log_previous.getName());
		System.out.println("���ݣ�" + log_previous.getContent());
		System.out.println("--------------------------------");
		
		WeeklyLog log_new;
		log_new = log_previous.clone(); //���ÿ�¡����������¡����
		log_new.setDate("��13��");
		System.out.println("****�ܱ�****");
		System.out.println("�ܴΣ�" + log_new.getDate());
		System.out.println("������" + log_new.getName());
		System.out.println("���ݣ�" + log_new.getContent());
	}
}