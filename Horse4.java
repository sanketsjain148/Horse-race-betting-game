package Horse1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Horse4 extends Horse3 implements ActionListener
{
JFrame f1 = new JFrame("HORSE RACE");
Horse3 m1 = new Horse3();
Horse3 m2 = new Horse3();
Horse3 m3 = new Horse3();
JButton b1 = new JButton("start");
public Horse4()
{
	f1.setBounds(10,10,700,600);
	f1.setLayout(null);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m1.setBounds(10,10,600,200);
	m2.setBounds(10,210,600,200);
	m3.setBounds(10,410,600,200);
	b1.setBounds(620,50,60,30);
	f1.add(m1);f1.add(m2);f1.add(m3);
	f1.add(b1);
	f1.setVisible(true);
	b1.addActionListener(this);
}
public static void main(String[] args) 
	{
	Horse4 r1 = new Horse4();
	}
@Override
public void actionPerformed(ActionEvent arg0) 
{
	// TODO Auto-generated method stub
	Thread th1 = new Thread(this.m1);    //do not invoke r1 explicitely
	th1.start();
	Thread th2 = new Thread(m2);
	th2.start();
	Thread th3 = new Thread(m3);
	th3.start();

	//	f1.setVisible(false);
}

}
