//designpatterns.cor.Client.java
package designpatterns.cor;

public class Client {
	public static void main(String[] args) {
		Approver wjzhang,gyang,jguo,meeting;
		wjzhang = new Director("���޼�");
		gyang = new VicePresident("���");
		jguo = new President("����");
		meeting = new Congress("���»�");
	
		//����ְ����
		wjzhang.setSuccessor(gyang);
		gyang.setSuccessor(jguo);
		jguo.setSuccessor(meeting);
		
		//�����ɹ���
		PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"�������콣");
		wjzhang.processRequest(pr1);
		
		PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"����������");
		wjzhang.processRequest(pr2);
	
		PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"���򡶾����澭��");
		wjzhang.processRequest(pr3);

		PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"�����һ���");
		wjzhang.processRequest(pr4);
	}
} 
