package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午3:41:33
 */
public class KeyListenerTest {

	public static void main(String[] args) {
		
		Frame frame = new Frame("test keylistener");
		
		frame.setLayout(new GridLayout(2,1));
		
		frame.setSize(300,200);
		
		Button button = new Button("请按下键盘");
		
		TextField textField = new TextField();
		
		button.addKeyListener(new MyKeyListener(textField));
		
		frame.add(button);
		
		frame.add(textField);
		
		
		
		frame.setVisible(true);

	}

}

class MyKeyListener implements KeyListener{

	TextField t1;
	
	public MyKeyListener(TextField t1) {
		
		this.t1 = t1;
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		/*
		 * t1.settext 设置文本框中的内容  需要字符串作为参数
		 * 
		 * t1.gettext  获取当前文本矿中的内容 与e.getkeychar(键盘按下的每个字符) 拼接
		 * 得到一个字符串
		 * */
		
		t1.setText(t1.getText()+e.getKeyChar());
		 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

