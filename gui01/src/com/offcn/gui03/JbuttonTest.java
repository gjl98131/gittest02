package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 上午10:42:12
 */
public class JbuttonTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new	JFrame();
		
		JPanel jPanel = new JPanel();
		
		JButton jButton = new JButton("普通按钮");
		
		JButton jButton2 = new JButton("设置背景颜色");
		
		jButton2.setBackground(Color.YELLOW);
		
		JButton jButton3 = new JButton("设置按钮为不可用");
		
		jButton3.setEnabled(false);//设置按钮的可用性
		
		
		
		JButton jButton4 = new JButton("设置按钮底部对齐");
		
		Dimension dimension = new Dimension(160,200);
		
		jButton4.setPreferredSize(dimension);
		
		jButton4.setVerticalAlignment(3);//设置垂直对齐的方式
		
		jPanel.add(jButton);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 600, 300);

		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
