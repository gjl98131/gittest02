package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午3:40:51
 */
public class JlistTest02 {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		jPanel.setLayout(new BorderLayout(0,0));//默认在窗口边框进行布局

		jFrame.add(jPanel);
		
		JScrollPane jScrollPane = new JScrollPane();
		
		jPanel.add(jScrollPane,BorderLayout.CENTER);
		
		JList jList = new JList();
		
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// 限定列表框只能一次选中一个
		
		jScrollPane.setViewportView(jList);
		
		String[] strs = new String[12];
			
		for (int i = 0; i < strs.length; i++) {
			
			strs[i] = "这是第"+(i+1)+"个元素";
			
		}
		
		jList.setListData(strs);//给列表赋值
		
		jFrame.setBounds(100, 100, 300, 200);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
	}

}
