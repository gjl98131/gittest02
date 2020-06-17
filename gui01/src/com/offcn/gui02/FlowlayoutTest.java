package com.offcn.gui02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午4:41:47
 */
public class FlowlayoutTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");
		JButton jButton6 = new JButton("6");
		JButton jButton7 = new JButton("7");
		JButton jButton8 = new JButton("8");
		JButton jButton9 = new JButton("9");
		
		jFrame.add(jButton1);
		jFrame.add(jButton2);
		jFrame.add(jButton3);
		jFrame.add(jButton4);
		jFrame.add(jButton5);
		jFrame.add(jButton6);
		jFrame.add(jButton7);
		jFrame.add(jButton8);
		jFrame.add(jButton9);
		
		jFrame.setSize(330, 150);

		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
