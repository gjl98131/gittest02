package com.offcn.gui03;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午3:15:06
 */
public class JlistTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		String[] strs = new String[] {"身份证","结婚证","离婚证"};
		
		JList jList = new JList(strs);
		
		jPanel.add(jList);
		
		frame.add(jPanel);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
		
	}

}
