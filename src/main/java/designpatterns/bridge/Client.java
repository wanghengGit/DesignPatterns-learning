//designpatterns.bridge.Client.java
package designpatterns.bridge;

//�ͻ��˲�����
public class Client {
	public static void main(String args[]) {
		Image image;
		ImageImp imp;
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("С��Ů");
	}
}