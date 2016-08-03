package Horse1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Horse5 implements ActionListener 
{
	JFrame f1 = new JFrame("HORSE RACE");
	JLabel l1=new JLabel("RESULT");
	JLabel l2=new JLabel("REMAINING AMOUNT:$");
	JTextField t1=new JTextField();
	JButton b1 = new JButton("BET AGAIN");
	JButton b2 = new JButton("EXIT");
public Horse5()
{
	f1.setLayout(null);
	f1.setBounds(10,10, 700, 700);
	l1.setBounds(200, 70, 100, 50);
	l2.setBounds(40, 150, 150, 30);
	t1.setBounds(220, 150, 150, 30);
	b1.setBounds(60, 300, 120, 30);
	b2.setBounds(200, 300, 120, 30);
	f1.setVisible(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(b1);
f1.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);

}
public static void main(String[] args) 
{
	Horse5 h5=new Horse5();
//	if(h2.h2a == 1 && m1.a == 1)
}

public void actionPerformed(ActionEvent arg0) 
{
	// TODO Auto-generated method stub
	if(arg0.getActionCommand().equals("EXIT"))
	{
		f1.setVisible(false);
	}
	else if(arg0.getActionCommand().equals("BET AGAIN"))
	{
		Horse1 h1 = new Horse1();
		f1.setVisible(false);
	}

}

}
