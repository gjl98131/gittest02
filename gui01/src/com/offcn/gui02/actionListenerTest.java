package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午2:50:24
 */
public class actionListenerTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		Button button = new Button("确定");
		
		Button button1 = new Button("取消");
	
		
		frame.setLayout(new GridLayout(1,2));

		frame.add(button);
		frame.add(button1);
		
		button.addActionListener(new Myactionlistener());;
		button1.addActionListener(new Myactionlistener());
		
		frame.pack();
		
		frame.setVisible(true);
		
	}

}
class Myactionlistener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//if语句就是判断语句  括号里面是条件表达式 条件成立执行if关键字后的代码块，否则执行else后的代码块
		if (e.getActionCommand().equals("确定")) {
		
			Frame frame = new Frame("新窗口");
		
		
			frame.setSize(200,200);
		
		
			frame.setVisible(true);
		
		}else {
			
			System.exit(0);
		}		
		
	}
		
}
