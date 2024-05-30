//designpatterns.command.XMLUtil.java
package designpatterns.command;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ�����󣬿���ͨ�������Ĳ�ͬ���ز�ͬ�����ڵ�����Ӧ��ʵ��
		public static Object getBean(int i) {
			try {
				//�����ĵ�����
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;							
				doc = builder.parse(new File("src//designpatterns//command//config.xml")); 
			
				//��ȡ�����������ı��ڵ�
				NodeList nl = doc.getElementsByTagName("className");
	            Node classNode = null;
	            if (0 == i) {
	            	classNode = nl.item(0).getFirstChild();
	            }
	            else {
	            	classNode = nl.item(1).getFirstChild();
	            } 

	            String cName = classNode.getNodeValue();
	            
	            //ͨ����������ʵ�����󲢽��䷵��
	            Class c = Class.forName(cName);
		  	    Object obj = c.newInstance();
	            return obj;
	        }   
	       catch(Exception e){
	            e.printStackTrace();
	           	return null;
	       }
	}
}