package register;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import register.cr;
public class crlogin extends JFrame implements ActionListener{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b;
	public crlogin()
	{
		JLabel l1 = new JLabel("Login");
		l1.setFont(new Font("Helvetica",Font.PLAIN,18));
		l1.setBounds(700,250,100,40);
		add(l1);
		l2 = new JLabel("Password");
		l2.setFont(new Font("Helvetica",Font.PLAIN,18));
		l2.setBounds(700,350,100,40);
		add(l2);
		t1 = new JTextField();
		t1.setFont(new Font("Helvetica",Font.PLAIN,15));
		t1.setBounds(825,250,200,40);
		add(t1);
		t2 = new JPasswordField();
		t2.setFont(new Font("Helvetica",Font.PLAIN,15));
		t2.setBounds(825,350,200,40);
		add(t2);
		setTitle("CR login");
		setSize(1900,1000);
		setLayout(null);
		setVisible(true);
		b = new JButton("submit");
		b.setFont(new Font("Helvetica",Font.BOLD,18));
		b.setBounds(725,450,150,50);
		add(b);
		b.addActionListener(this);
		ImageIcon i = new ImageIcon("D:\\java programs\\mrecw.jpeg");
		JLabel l = new JLabel(i);
		l.setBounds(20,10,1150,200);
		add(l);
	}
	public void actionPerformed(ActionEvent e)
	{
		try {
			if(e.getSource() == b)
			{
				String textuser = t1.getText().toString();
				String textpassword = t2.getText().toString();
				String username = "cr";
				String p1 = "ita";
				String p2 = "itb";
				String p3 = "itc";
				if(textuser.equals(username) && textpassword.equals(p1)) {
						cr c1 = new cr();
						 c1.crita();
				}
				else if(textuser.equals(username) && textpassword.equals(p2)) {
					cr c2 = new cr();
					   c2.critb();
				}
				else if(textuser.equals(username) && textpassword.equals(p3)) {
					cr c3 = new cr();
					 c3.critc();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect login");
				}
			}
		}
			catch (Exception e2) {
				System.out.println("Error while connecting to the database in faculty login window"+e2);
				}
		
	}
}
