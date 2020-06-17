package com.offcn.gui02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 上午9:55:20
 */
public class Textfieldlistener {

	public static void main(String[] args) {
		
		Frame frame = new Frame("test textfieldlistener");
		
		TextField textField = new TextField();
		
		frame.add(textField);
		
		textField.addActionListener(new Myactinlistener06());
		//将文本的编码字符改成星号,触发激活时间时仍然可以得到文本内容
		textField.setEchoChar('*');
		
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}

class Myactinlistener06 implements  ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 调用e对象中的getSource会将事件的资源返回给我们,Object是对象的顶级父类
		/*
		 * 获取到文本对象之后就可以对文本对象进行操作，调用文本对象中的gettext方法可以
		 * 得到文本中的内容。。调用setText方法可以设置文本的内容.
		 * 
		 * */
		TextField tf = (TextField)e.getSource();
		
		System.out.println(tf.getText());
		
		tf.setText("");
	}
	
}
