package Horse1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Horse2 implements ActionListener
{
	public int h2a;
	JFrame f1 = new JFrame("HORSE RACE");
	JLabel l1=new JLabel("SELECT A HORSE");
	JLabel l2=new JLabel("RED DASH");
	JLabel l3=new JLabel("IRISH");
	JLabel l4=new JLabel("TERRENATO");
//	JLabel l5=new JLabel("FORD");
	JLabel l6=new JLabel("SPEED:*****");
	JLabel l7=new JLabel("SPEED:*");
	JLabel l8=new JLabel("SPEED:***");
//	JLabel l9=new JLabel("SPEED:**");
	JButton b1 = new JButton("BACK");
	JRadioButton r1 = new JRadioButton("Horse no:1");
	JRadioButton r2 = new JRadioButton("Horse no:2");
	JRadioButton r3 = new JRadioButton("Horse no:3");
//	JRadioButton r4 = new JRadioButton("Horse no:4");
	ButtonGroup bg = new ButtonGroup();

public Horse2()
{
	f1.setLayout(null);
	f1.setBounds(10,10, 800, 800);
	l1.setBounds(260, 20, 200, 50);
	l2.setBounds(20, 60, 100, 50);
	l3.setBounds(220, 60, 100, 50);
	l4.setBounds(420, 60, 100, 50);
//	l5.setBounds(620, 60, 100, 50);
	l6.setBounds(20, 600, 100, 50);
	l7.setBounds(220, 600, 100, 50);
	l8.setBounds(420, 600, 100, 50);
//	l9.setBounds(620, 600, 100, 50);
	r1.setBounds(20, 550, 200, 50);
	r2.setBounds(220, 550, 100, 50);
	r3.setBounds(420, 550, 100, 50);
//	r4.setBounds(620,550, 100, 50);
	b1.setBounds(20,700,100,30);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
//f1.add(l5);
f1.add(l6);
f1.add(l7);
f1.add(l8);
//f1.add(l9);
f1.add(b1);
f1.add(r1);f1.add(r2);f1.add(r3);//f1.add(r4);
bg.add(r1);bg.add(r2);bg.add(r3);//bg.add(r4);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
//r4.addActionListener(this);
b1.addActionListener(this);
}

public static void main(String[] args) 
{
	Horse2 h2=new Horse2();
}

@Override
public void actionPerformed(ActionEvent arg0) 
{
	// TODO Auto-generated method stub
	if(arg0.getActionCommand().equals("BACK"))
	{
		Horse1 h1 = new Horse1();
		f1.setVisible(false);
	}
	else if(arg0.getActionCommand().equals("Horse no:1"))
	{
		h2a=1;
//		system.sleep(1000);
		Horse4 h4 = new Horse4();
		f1.setVisible(false);
	}
	else if(arg0.getActionCommand().equals("Horse no:2"))
	{
		h2a=2;
		Horse4 h4 = new Horse4();
		f1.setVisible(false);
	}
	else if(arg0.getActionCommand().equals("Horse no:3"))
	{
		h2a=3;
		Horse4 h4 = new Horse4();
		f1.setVisible(false);
	}
}

}
