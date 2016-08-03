package Horse1;

import java.awt.*;

import javax.swing.*;

import java.util.*;
public class Horse3 extends JPanel implements Runnable
{
	public static int count=0;
	public int a;
	ImageIcon i1 = new ImageIcon("C:/Users/SANKET/Desktop/java prog/SEM4_JAVA/guiimages/3.gif");
	JLabel l1 = new JLabel(i1);
	JTextField t1 = new JTextField();
	public Horse3()
	{
		this.setBounds(10,10,600,200);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		l1.setBounds(10,10,200,100);
		t1.setBounds(10,120,100,30);
		this.add(l1);this.add(t1);
	}
public static void main(String[] args)
{
	Horse3 h3 = new Horse3();
	JFrame f1 = new JFrame("HORSE RACE");
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setBounds(10,10,700,700);
	f1.add(h3);
	f1.setVisible(true);
	Thread th1 = new Thread(h3);
	th1.start();
}
@Override
public void run() 
{
//	String s1;
//	int a1;
//	s1=t1.getText();
//	a1=Integer.parseInt(s1);
	Random r1 = new Random();
	for(int i=0;i<470;i++)
{
	l1.setBounds(i,10,200,100);
	try{
		//Thread.sleep(20);
		Thread.sleep(1000/r1.nextInt(100));
	}
	catch(Exception ex)
	{
	}
}
	count++;
	a=count;
	t1.setText("I am "+ count);
if(count==3)
{
	Horse5 h5 = new Horse5();
//	f1.setVisible(false);
	
}
}

}
