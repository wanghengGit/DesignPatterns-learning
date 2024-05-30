//designpatterns.cor.President.java
package designpatterns.cor;

//���³��ࣺ���崦����
public class President extends Approver {
	public President(String name) {
		super(name);
	}
	
	//������������
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 500000) {
			System.out.println("���³�" + this.name + "�����ɹ�����" + request.getNumber() + "����" + request.getAmount() + "Ԫ���ɹ�Ŀ�ģ�" + request.getPurpose() + "��");  //��������
		}
		else {
			this.successor.processRequest(request);  //ת������
		}
	}
}