//designpatterns.bridge.LinuxImp.java
package designpatterns.bridge;

//Linux����ϵͳʵ���࣬�䵱����ʵ����
public class LinuxImp implements ImageImp {
  public void doPaint(Matrix m) {
  	//����Linuxϵͳ�Ļ��ƺ����������ؾ���
  	System.out.print("��Linux����ϵͳ����ʾͼ��");
  }
}