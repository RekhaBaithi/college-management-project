package register;
import java.awt.event.*;
import java.sql.SQLException;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class Princi extends JFrame implements ActionListener
{
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b;
		public Princi()
		{
		
			JLabel l1 = new JLabel("Login");
			l1.setFont(new Font("Helvetica",Font.PLAIN,18));
			l1.setBounds(700,250,100,40);
			add(l1);
			l2 = new JLabel("Password");
			l2.setFont(new Font("Helvetica",Font.PLAIN,18));
			l2.setBounds(700,350,100,40);
			add(l2);
			ImageIcon i = new ImageIcon("D:\\java programs\\mrecw.jpeg");
			JLabel l = new JLabel(i);
			l.setBounds(20,10,1150,200);
			add(l);
			ImageIcon j = new ImageIcon("D:\\java programs\\principal.jpg");
			JLabel pri = new JLabel(j);
			pri.setBounds(5,0,900,700);
			add(pri);
			t1 = new JTextField();
			t1.setBounds(825,250,200,40);
			add(t1);
			t1.setFont(new Font("Helvetica",Font.PLAIN,15));
			t2 = new JPasswordField();
			t2.setFont(new Font("Helvetica",Font.PLAIN,15));
			t2.setBounds(825,350,200,40);
			add(t2);
			setTitle("Principal login");
			setSize(1900,1000);
			setLayout(null);
			setVisible(true);
			b = new JButton("submit");
			b.setFont(new Font("Helvetica",Font.BOLD,18));
			b.setBounds(725,450,150,50);
			add(b);
			b.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
			try {
				if(e.getSource() == b)
				{
					String textuser = t1.getText().toString();
					String textpassword = t2.getText().toString();
					String username = "principal";
					String password = "mrecw";
					if(textuser.equals(username) && textpassword.equals(password)) {
						new principal();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect login");
					}
				}
			}
				catch (Exception e2) {
					System.out.println("Error while connecting to the database in principal window"+e2);
					}
		}

}
