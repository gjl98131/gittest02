package com.offcn.gui03;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 上午9:51:02
 */
public class GridlayoutTest02 {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("test gridlayout");
		
		JPanel jPanel = new JPanel();
		
		jPanel.setLayout(new GridLayout(3,3,5,5));
		
		Button button = new Button("1");
		Button button1 = new Button("2");
		Button button2 = new Button("3");
		Button button3 = new Button("4");
		Button button4 = new Button("5");
		Button button5 = new Button("6");
		Button button6 = new Button("7");
		Button button7 = new Button("8");
		Button button8 = new Button("9");
		
		
		jPanel.add(button);
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);
		jPanel.add(button4);
		jPanel.add(button5);
		jPanel.add(button6);
		jPanel.add(button7);
		jPanel.add(button8);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 200, 150);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		

	}

}
