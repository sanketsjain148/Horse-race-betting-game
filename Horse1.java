package Horse1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Horse1 implements ActionListener
{
	JFrame f1 = new JFrame("HORSE RACE");
	JLabel l1=new JLabel("CASH:$");
	JLabel l2=new JLabel("BET AMOUNT:$");
	JLabel l3=new JLabel("PLACED BET:$");
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JButton b1 = new JButton("PLACE BET");
	JButton b2 = new JButton("SELECT A HORSE");
	Font font1 = new Font("Verdana", Font.BOLD,18);
	Font font2 = new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT,18);
	Font font3 = new Font("Serif", Font.BOLD,20);
	ImageIcon i1 = new ImageIcon("E:/h1.jpg");
	JLabel l11 =new JLabel();
	public Horse1()
	{
		f1.setLayout(null);
		f1.setBounds(100,100, 500, 500);
		l1.setBounds(20, 20, 100, 50);
		l2.setBounds(20, 60, 100, 50);
		l3.setBounds(20, 170, 100, 50);
		t1.setBounds(140, 30, 150, 30);
		t2.setBounds(140, 70, 150, 30);
		t3.setBounds(140, 180, 150, 30);
		b1.setBounds(70, 125, 100, 30);
		b2.setBounds(320, 270, 150, 30);
		l11.setBounds(0, 0, 500,500);
		//i1.setBounds(0,0,500,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.getContentPane();
		f1.add(l1);f1.add(t1);
		f1.add(l2);f1.add(t2);
		f1.add(b1);
		f1.add(l3);f1.add(t3);
		f1.add(b2);
		l11.setIcon(i1);
		f1.add(l11);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		Horse1 h1=new Horse1();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("PLACE BET"))
		{
			String s1,s2,s3;
			int a1,a2,a3;
			s1=t1.getText();
			s2=t2.getText();
			a1=Integer.parseInt(s1);
			a2=Integer.parseInt(s2);
			if(a1 > a2)
			{
			t3.setText(s2);
			}
			else
			{
			t3.setText("insufficient cash");
			}
		}
		else if(arg0.getActionCommand().equals("SELECT A HORSE"))
		{
			Horse2 h2 = new Horse2();
			f1.setVisible(false);
		}
			
	}
}





