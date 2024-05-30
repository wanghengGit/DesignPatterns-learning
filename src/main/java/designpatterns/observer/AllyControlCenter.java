//designpatterns.observer.AllyControlCenter.java
package designpatterns.observer;
import java.util.*;

//ս�ӿ��������ࣺĿ����
public abstract class AllyControlCenter {
	protected String allyName; //ս������
	protected ArrayList<Observer> players = new ArrayList<Observer>(); //����һ���������ڴ洢ս�ӳ�Ա
	
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	public String getAllyName() {
		return this.allyName;
	}
	
	//ע�᷽��
	public void join(Observer obs) {
		System.out.println(obs.getName() + "����" + this.allyName + "ս�ӣ�");
		players.add(obs);
	}
	
	//ע������
	public void quit(Observer obs) {
		System.out.println(obs.getName() + "�˳�" + this.allyName + "ս�ӣ�");
		players.remove(obs);
	}
	
	//��������֪ͨ����
	public abstract void notifyObserver(String name);
}