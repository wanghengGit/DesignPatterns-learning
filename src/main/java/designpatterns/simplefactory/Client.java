//designpatterns.simplefactory.Client.java
package designpatterns.simplefactory;

public class Client {
	public static void main(String args[]) {
		Chart chart;
		chart = ChartFactory.getChart("histogram"); //ͨ����̬��������������Ʒ
		
		//String type = XMLUtil.getChartType(); //��ȡ�����ļ��еĲ���
		//chart = ChartFactory.getChart(type);  //������Ʒ����

		chart.display();
	}
}
