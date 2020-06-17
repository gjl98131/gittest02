package com.offcn.gui03;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 下午1:42:32
 */
public class JtextareaTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JTextArea jTextArea = new JTextArea("请输入内容",7,20);
		
		jTextArea.setFont(new Font("宋体", Font.BOLD, 16));
		
		jTextArea.setBackground(Color.yellow);
		
		jTextArea.setLineWrap(true);//设置文本域自动换行
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);//将文本域添加进滚动窗口
		
		Dimension preferredSize = jTextArea.getPreferredSize();//获取文本域的大小对象
		
		jScrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		jPanel.add(jScrollPane);
		
		frame.add(jPanel);
		
		frame.setBounds(200, 200, 350, 150);
		
		frame.setVisible(true);

	}

}
