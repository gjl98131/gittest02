package com.offcn.gui03;

import java.awt.CardLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 上午9:17:28
 */
public class CardlayoutTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("test cardlayout");
		
		JPanel jPanel = new JPanel();
		
		JPanel jPanel1 = new JPanel();
		
		JPanel cards = new JPanel();
		
		cards.setLayout(new CardLayout());
		
		JButton jButton = new JButton("登录按钮");
		JButton jButton1 = new JButton("注册按钮");
		JButton jButton2 = new JButton("找回密码按钮");
		
		jPanel.add(jButton);
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		
		JTextField jTextField = new JTextField("用户名文本框",20);
		JTextField jTextField1 = new JTextField("密码文本框",20);
		JTextField jTextField2 = new JTextField("验证码文本框",20);
		
		jPanel1.add(jTextField);
		jPanel1.add(jTextField1);
		jPanel1.add(jTextField2);
		
		cards.add(jPanel,"card1");
		cards.add(jPanel1,"card2");
		
		CardLayout layout = (CardLayout) cards.getLayout();
		
		layout.show(cards, "card2");
		
		jFrame.add(cards);
		
		jFrame.setBounds(100, 100, 400, 200);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
