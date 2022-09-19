package register;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class first implements ActionListener{
	JFrame f;
	JButton b1,b2,b3;
	JLabel l;
	first()
	{
		f = new JFrame("Home Page");
		b1 = new JButton("PRINCIPAL");
		b1.setFont(new Font("Calibri",Font.PLAIN,21));
		b2 = new JButton("FACULTY");
		b2.setFont(new Font("Calibri",Font.PLAIN,21));
		b3 = new JButton("CR");
		b3.setFont(new Font("Calibri",Font.PLAIN,21));
		b1.setBounds(350,250,150,100);
		b2.setBounds(550,250,150,100);
		b3.setBounds(750,250,150,100);
		ImageIcon i = new ImageIcon("D:\\java programs\\mrecw.jpeg");
		JLabel l = new JLabel(i);
		l.setBounds(20,10,1150,200);
		f.add(l);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setSize(1920,1080);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		if(obj==b1) 
		{
			new Princi();
		}
		if(obj==b2) 
		{
			new flogin();
		}
		if(obj==b3)
		{
			new crlogin();
		}
	}

	public static void main(String[] args) {
		new first();
	}

}
