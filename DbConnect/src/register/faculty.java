package register;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class faculty extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t2,t3;  
	JButton b;
	JComboBox ca1,cb1,cc1,c1,c2,c3;
	public  void facultyita()
	{
		String s1[] = {"1","2","3","4","5","6","7"};
		String s2[] = {"MEFA","OOPS","DBMS","CO","FLAT","SE"};
		String s3[] = {"HARIKA","RAGHU","SHANMUGA","HARSHA","VENKATESH","PRADEEP"};
		String sa1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String sb1[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String sc1[] = {"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		l1 = new JLabel("Date");
		l1.setBounds(80,20,80,50);
		l1.setFont(new Font("Arial",Font.PLAIN,18));
		add(l1);
		l2 = new JLabel("period");
		l2.setFont(new Font("Arial",Font.PLAIN,18));
		l2.setBounds(80,100,80,50);
		add(l2);
		l3 = new JLabel("subject");
		l3.setFont(new Font("Arial",Font.PLAIN,18));
		l3.setBounds(80,180,80,50);
		add(l3);
		l4 = new JLabel("Faculty");
		l4.setFont(new Font("Arial",Font.PLAIN,18));
		l4.setBounds(80,260,80,50);
		add(l4);
		l5 = new JLabel("Topics");
		l5.setFont(new Font("Arial",Font.PLAIN,18));
		l5.setBounds(80,340,80,50);
		add(l5);
		l6 = new JLabel("Feedback");
		l6.setFont(new Font("Arial",Font.PLAIN,18));
		l6.setBounds(80,420,80,50);
		add(l6);
		ca1 = new JComboBox(sa1);
		ca1.setFont(new Font("Arial",Font.PLAIN,18));
		ca1.setBounds(190,20,80,50);
		add(ca1);
		cb1 = new JComboBox(sb1);
		cb1.setFont(new Font("Arial",Font.PLAIN,18));
		cb1.setBounds(270,20,150,50);
		add(cb1);
		cc1 = new JComboBox(sc1);
		cc1.setFont(new Font("Arial",Font.PLAIN,18));
		cc1.setBounds(420,20,80,50);
		add(cc1);
		t2 = new JTextField();
		t2.setFont(new Font("Arial",Font.PLAIN,18));
		t2.setBounds(190,340,200,50);
		add(t2);
		t3 = new JTextField();
		t3.setFont(new Font("Arial",Font.PLAIN,18));
		t3.setBounds(190,420,200,50);
		add(t3);
		c1 = new JComboBox(s1);
		c1.setFont(new Font("Arial",Font.PLAIN,18));
		c1.setBounds(190,100,100,50);
		add(c1);
		c2 = new JComboBox(s2);
		c2.setFont(new Font("Arial",Font.PLAIN,18));
		c2.setBounds(190,180,150,50);
		add(c2);
		c3 = new JComboBox(s3);
		c3.setFont(new Font("Arial",Font.PLAIN,18));
		c3.setBounds(190,260,150,50);
		add(c3);
		setTitle("Faculty");
		setSize(1900,1000);
		setLayout(null);
		setVisible(true);
		b = new JButton("submit");
		b.setFont(new Font("Arial",Font.BOLD,20));
		b.setBounds(120,540,150,50);
		add(b);
		b.addActionListener(this);	
	}
	public void facultyitb()
	{
		String s1[] = {"1","2","3","4","5","6","7"};
		String s2[] = {"MEFA","OOPS","DBMS","CO","FLAT","SE"};
		String s3[] = {"HARIKA","RAGHU","NAVYATHA","SRILAXMI","SUDHAKAR","PRADEEP"};
		String sa1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String sb1[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String sc1[] = {"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		l1 = new JLabel("Date");
		l1.setFont(new Font("Arial",Font.PLAIN,18));
		l1.setBounds(80,20,80,50);
		add(l1);
		l2 = new JLabel("period");
		l2.setFont(new Font("Arial",Font.PLAIN,18));
		l2.setBounds(80,100,80,50);
		add(l2);
		l3 = new JLabel("subject");
		l3.setFont(new Font("Arial",Font.PLAIN,18));
		l3.setBounds(80,180,80,50);
		add(l3);
		l4 = new JLabel("Faculty");
		l4.setFont(new Font("Arial",Font.PLAIN,18));
		l4.setBounds(80,260,80,50);
		add(l4);
		l5 = new JLabel("Topics");
		l5.setFont(new Font("Arial",Font.PLAIN,18));
		l5.setBounds(80,340,80,50);
		add(l5);
		l6 = new JLabel("Feedback");
		l6.setFont(new Font("Arial",Font.PLAIN,18));
		l6.setBounds(80,420,80,50);
		add(l6);
		ca1 = new JComboBox(sa1);
		ca1.setFont(new Font("Arial",Font.PLAIN,18));
		ca1.setBounds(190,20,80,50);
		add(ca1);
		cb1 = new JComboBox(sb1);
		cb1.setFont(new Font("Arial",Font.PLAIN,18));
		cb1.setBounds(270,20,150,50);
		add(cb1);
		cc1 = new JComboBox(sc1);
		cc1.setFont(new Font("Arial",Font.PLAIN,18));
		cc1.setBounds(420,20,80,50);
		add(cc1);
		t2 = new JTextField();
		t2.setFont(new Font("Arial",Font.PLAIN,18));
		t2.setBounds(190,340,200,50);
		add(t2);
		t3 = new JTextField();
		t3.setFont(new Font("Arial",Font.PLAIN,18));
		t3.setBounds(190,420,200,50);
		add(t3);
		c1 = new JComboBox(s1);
		c1.setFont(new Font("Arial",Font.PLAIN,18));
		c1.setBounds(190,100,100,50);
		add(c1);
		c2 = new JComboBox(s2);
		c2.setFont(new Font("Arial",Font.PLAIN,18));
		c2.setBounds(190,180,150,50);
		add(c2);
		c3 = new JComboBox(s3);
		c3.setFont(new Font("Arial",Font.PLAIN,18));
		c3.setBounds(190,260,150,50);
		add(c3);
		setTitle("Faculty");
		setSize(1900,1000);
		setLayout(null);
		setVisible(true);
		b = new JButton("submit");
		b.setFont(new Font("Arial",Font.BOLD,20));
		b.setBounds(120,540,150,50);
		add(b);
		b.addActionListener(this);	
	}
	public void facultyitc()
	{
		String s1[] = {"1","2","3","4","5","6","7"};
		String s2[] = {"MEFA","OOPS","DBMS","CO","FLAT","SE"};
		String s3[] = {"HARIKA","DHAMODHAR","IMRAN","SRILAXMI","PRATHYUSHA","PRADEEP"};
		String sa1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String sb1[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String sc1[] = {"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		l1 = new JLabel("Date");
		l1.setFont(new Font("Arial",Font.PLAIN,18));
		l1.setBounds(80,20,80,50);
		add(l1);
		l2 = new JLabel("period");
		l2.setFont(new Font("Arial",Font.PLAIN,18));
		l2.setBounds(80,100,80,50);
		add(l2);
		l3 = new JLabel("subject");
		l3.setFont(new Font("Arial",Font.PLAIN,18));
		l3.setBounds(80,180,80,50);
		add(l3);
		l4 = new JLabel("Faculty");
		l4.setFont(new Font("Arial",Font.PLAIN,18));
		l4.setBounds(80,260,80,50);
		add(l4);
		l5 = new JLabel("Topics");
		l5.setFont(new Font("Arial",Font.PLAIN,18));
		l5.setBounds(80,340,80,50);
		add(l5);
		l6 = new JLabel("Feedback");
		l6.setFont(new Font("Arial",Font.PLAIN,18));
		l6.setBounds(80,420,80,50);
		add(l6);
		ca1 = new JComboBox(sa1);
		ca1.setFont(new Font("Arial",Font.PLAIN,18));
		ca1.setBounds(190,20,80,50);
		add(ca1);
		cb1 = new JComboBox(sb1);
		cb1.setFont(new Font("Arial",Font.PLAIN,18));
		cb1.setBounds(270,20,150,50);
		add(cb1);
		cc1 = new JComboBox(sc1);
		cc1.setFont(new Font("Arial",Font.PLAIN,18));
		cc1.setBounds(420,20,80,50);
		add(cc1);
		t2 = new JTextField();
		t2.setFont(new Font("Arial",Font.PLAIN,18));
		t2.setBounds(190,340,200,50);
		add(t2);
		t3 = new JTextField();
		t3.setFont(new Font("Arial",Font.PLAIN,18));
		t3.setBounds(190,420,200,50);
		add(t3);
		c1 = new JComboBox(s1);
		c1.setFont(new Font("Arial",Font.PLAIN,18));
		c1.setBounds(190,100,100,50);
		add(c1);
		c2 = new JComboBox(s2);
		c2.setFont(new Font("Arial",Font.PLAIN,18));
		c2.setBounds(190,180,150,50);
		add(c2);
		c3 = new JComboBox(s3);
		c3.setFont(new Font("Arial",Font.PLAIN,18));
		c3.setBounds(190,260,150,50);
		add(c3);
		setTitle("Faculty");
		setSize(1900,1000);
		setLayout(null);
		setVisible(true);
		b = new JButton("submit");
		b.setFont(new Font("Arial",Font.BOLD,20));
		b.setBounds(120,600,150,50);
		add(b);
		b.addActionListener(this);	
		JButton b1 = new JButton("verify");
		b.setFont(new Font("Arial",Font.BOLD,20));
		b.setBounds(120,540,150,50);
		add(b);
		b.addActionListener(this);	
	}
	
	public void actionPerformed1(ActionEvent e)   //adding panel table 
	{
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "12345");
			String query = "select * from finfo";
			PreparedStatement p = connection.prepareStatement(query);
			ResultSet rs = p.executeQuery();
			JTable table;
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		String s5,s6;
		Object s2;
		Object s4;
		Object s3;
		s5 =t2.getText();
		s6 =t3.getText();
		s2 = c1.getSelectedItem().toString();
		s3 = c2.getSelectedItem().toString();
		s4 = c3.getSelectedItem().toString();
		Object a1= ca1.getSelectedItem();
		Object a2 = cb1.getSelectedItem();
		Object a3 = cc1.getSelectedItem();
		String dd = String.valueOf(a1);
		String mm = String.valueOf(a2);
		String yyyy = String.valueOf(a3);
	    String date = (dd + mm + yyyy);
			if(e.getSource() == b)
			{
				{
					//JOptionPane.showMessageDialog(null,"Data is successfully inserted",JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null,"Data is successfully inserted");
				}
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "12345");//Establishing connection
					System.out.println("Connected With the database successfully");
					String q = "insert into finfo(date,period,subject,faculty,topic,feedback)" + "values(?,?,?,?,?,?)";
					PreparedStatement ps = connection.prepareStatement(q);
					ps.setString(1,date);
					ps.setString(2,(String) s2);        
					ps.setString(3,(String) s3);     
					ps.setString(4,(String) s4);    
					ps.setString(5,s5);
					ps.setString(6,s6);
					ps.execute();
					connection.close();
					} catch (SQLException e1) {
					System.out.println("Error while connecting to the database"+e1);
					}
			}
	}
}