package register;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class principal extends JFrame implements ActionListener{
	
	JComboBox ca1,cb1,cc1,c2,c3,c4;
	JButton b1,b2;
	int i=0;
	String date;
	private String a11;
	private String a21;
	private String a31;
	private String a4;
	private String a5;
	private String a6;
	public principal()
	{
		String sa1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String sb1[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String sc1[] = {"2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
		String s2[] = {"1","2","3","4",};
		String s3[] = {"CSE","CSE-AIML","CSE-DS","CSE-CS","CSE-IOT","IT","ECE","EEE",};
		String s4[] = {"A","B","C","D",};
		JLabel l1 = new JLabel("Date");
		l1.setBounds(190,60,120,50);
		l1.setFont(new Font("Arial",Font.PLAIN,18));
		add(l1);
		JLabel l2 = new JLabel("Year");
		l2.setBounds(190,160,120,50);
		l2.setFont(new Font("Arial",Font.PLAIN,18));
		add(l2);
		JLabel l3 = new JLabel("Department");
		l3.setBounds(190,260,120,50);
		l3.setFont(new Font("Arial",Font.PLAIN,18));
		add(l3);
		JLabel l4 = new JLabel("Section");
		l4.setBounds(190,360,120,50);
		l4.setFont(new Font("Arial",Font.PLAIN,18));
		add(l4);
		ca1 = new JComboBox(sa1);
		ca1.setFont(new Font("Arial",Font.PLAIN,18));
		ca1.setBounds(350,60,80,50);
		add(ca1);
		cb1 = new JComboBox(sb1);
		cb1.setFont(new Font("Arial",Font.PLAIN,18));
		cb1.setBounds(430,60,150,50);
		add(cb1);
		cc1 = new JComboBox(sc1);
		cc1.setFont(new Font("Arial",Font.PLAIN,18));
		cc1.setBounds(580,60,100,50);
		add(cc1);
		c2 = new JComboBox(s2);
		c2.setFont(new Font("Arial",Font.PLAIN,18));
		c2.setBounds(350,160,200,50);
		add(c2);
		c3 = new JComboBox(s3);
		c3.setFont(new Font("Arial",Font.PLAIN,18));
		c3.setBounds(350,260,200,50);
		add(c3);
		c4 = new JComboBox(s4);
		c4.setFont(new Font("Arial",Font.PLAIN,18));
		c4.setBounds(350,360,200,50);
		add(c4);
		//b = new JButton("SUBMIT");
		//b.setBounds(350,420,200,50);
		//b.addActionListener(this);
		//add(b);
		b1 = new JButton("FACULTY DATA");
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBounds(200,460,200,50);
		b1.addActionListener(this);
		add(b1);
		b2 = new JButton("CR DATA");
		b2.setFont(new Font("Arial",Font.BOLD,18));
		b2.setBounds(450,460,200,50);
		b2.addActionListener(this);
		add(b2);
		//ImageIcon j = new ImageIcon("c:\\java programs\\principal.jpg");
		//JLabel pri = new JLabel(j);
		//pri.setBounds(0,0,900,700);
		//add(pri);
		setSize(1900,1000);
		setTitle("Principal page");
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{//string m;
		Object a1= ca1.getSelectedItem();
		Object a2 = cb1.getSelectedItem();
		Object a3 = cc1.getSelectedItem();
		String s1 = String.valueOf(a1);
		String s2 = String.valueOf(a2);
		String s3 = String.valueOf(a3);
	    date = (s1 + s2 + s3);
		System.out.println(date);
		if(e.getSource() == b1)
		{
			try
			{
				String s = date;
				frfaculty(s);
				
			}
			catch (Exception ae)
			{
				System.out.println(ae);
			} 
		}
		if(e.getSource() == b2)
		{
			try
			{
				String s = date;
				frcr(s);
			}
			catch (Exception ae)
			{
				System.out.println(ae);
			} 
		}
	}
		public void frfaculty(String s)
		{
			Container f = new JFrame("FACULTY DATA");
			f.setLayout(new FlowLayout() );
			f.setSize(1000,1000);
			DefaultTableModel model = new DefaultTableModel();
			JTable table = new JTable(model);
			table.setPreferredScrollableViewportSize(new Dimension(900,600));
			table.setFillsViewportHeight(true);
			f.add(new JScrollPane(table));
			model.addColumn("date");
			model.addColumn("period");
			model.addColumn("subject");
			model.addColumn("faculty");
			model.addColumn("topic");
			model.addColumn("feedback");
			try{
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "12345");//Establishing connection
				Statement sta = connection.createStatement();
				System.out.print("entered into database");
				String query = "select * from finfo where date = '" + s + "'";
				ResultSet result = sta.executeQuery(query);
				int flag = 0,i=0;
				while(result.next()) {
					a11 = result.getString("date");
					a21 = result.getString("period");
					a31 = result.getString("subject");
					a4 = result.getString("faculty");
					a5 = result.getString("topic");
					a6 = result.getString("feedback");
					if(date.equalsIgnoreCase(a11)) {
						flag = 1;
						f.setVisible(true);
						f.validate();
						model.insertRow(i, new Object[] {a11,a21,a31,a4,a5,a6});
						i++;
					}
				}
				if(flag==0) {
				    JOptionPane.showMessageDialog(null,"no data found on given date");
					System.out.println("no data found on given date");
				}
			}
			catch (SQLException e2) {
				System.out.println("Error while connecting to the database in principal window"+e2);
				}
			
			
		}
		public void frcr(String s)
		{
			Container f = new JFrame("CR DATA");
			f.setLayout(new FlowLayout() );
			f.setSize(1000,1000);
			DefaultTableModel model = new DefaultTableModel();
			JTable table = new JTable(model);
			table.setPreferredScrollableViewportSize(new Dimension(900,600));
			table.setFillsViewportHeight(true);
			f.add(new JScrollPane(table));
			model.addColumn("date");
			model.addColumn("period");
			model.addColumn("subject");
			model.addColumn("faculty");
			model.addColumn("topic");
			model.addColumn("feedback");
			try{
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "12345");//Establishing connection
				Statement sta = connection.createStatement();
				System.out.print("entered into database");
				String query = "select * from crinfo where date = '" + s + "'";
				ResultSet result = sta.executeQuery(query);
				int flag = 0,i=0;
				while(result.next()) {
					a11 = result.getString("date");
					a21 = result.getString("period");
					a31 = result.getString("subject");
					a4 = result.getString("faculty");
					a5 = result.getString("topic");
					a6 = result.getString("feedback");
					if(date.equalsIgnoreCase(a11)) {
						flag = 1;
						f.setVisible(true);
						f.validate();
						model.insertRow(i, new Object[] {a11,a21,a31,a4,a5,a6});
						i++;
					}
				}
				if(flag==0) {
				    JOptionPane.showMessageDialog(null,"no data found on given date");
					System.out.println("no data found on given date");
				}
			}
			catch (SQLException e2) {
				System.out.println("Error while connecting to the database in principal window"+e2);
				}
			
			
		}
}