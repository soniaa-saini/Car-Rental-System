package sonia_project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import com.toedter.calendar.JMonthChooser;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class rental_page extends JFrame {
	
	private JPanel contentPane;
	private JLabel carimg;
	Date fromdate;
	Date todate;
	public int rentdays;
	String num1;
	String num2;
	int day1;
	int day2;
	int days;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rental_page frame = new rental_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public rental_page() {
		setTitle("ZULO BOOKING - an app for car rental - RENTAL PAGE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("");
		Image headerimg = new ImageIcon(this.getClass().getResource("/55.jpg")).getImage();
		 
		 carimg = new JLabel("");
		 Image carimg1 = new ImageIcon(this.getClass().getResource("/100.png")).getImage();
		 carimg.setIcon(new ImageIcon(carimg1));
		 carimg.setBounds(591, 203, 450, 458);
		 contentPane.add(carimg);
		 
		 JLabel mainheading = new JLabel("WELCOME TO ZULO BOOKING - YOUR");
		 mainheading.setForeground(new Color(255, 255, 255));
		 mainheading.setBounds(184, 29, 639, 50);
		 mainheading.setFont(new Font("Times New Roman", Font.BOLD, 33));
		 contentPane.add(mainheading);
		 
		 JLabel mainheading1 = new JLabel("TRUSTED CAR PARTNER");
		 mainheading1.setForeground(new Color(255, 255, 255));
		 mainheading1.setBounds(291, 72, 425, 50);
		 mainheading1.setFont(new Font("Times New Roman", Font.BOLD, 33));
		 contentPane.add(mainheading1);
		 
		 JLabel lblNewLabel_1 = new JLabel("Drive in Comfort and Style with Our Wide Selection ");
		 lblNewLabel_1.setForeground(new Color(255, 255, 255));
		 lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 13));
		 lblNewLabel_1.setBounds(311, 133, 425, 23);
		 contentPane.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel = new JLabel("of Quality Vehicles, Perfect for Any Journey! ");
		 lblNewLabel.setForeground(new Color(255, 255, 255));
		 lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 13));
		 lblNewLabel.setBounds(337, 154, 347, 28);
		 contentPane.add(lblNewLabel);
		 header.setIcon(new ImageIcon(headerimg));
		header.setBounds(-3, 0, 133, 200);
		contentPane.add(header);
		
		JLabel header1 = new JLabel("");
		Image headerimg1 = new ImageIcon(this.getClass().getResource("/66.jpg")).getImage();
		 header1.setIcon(new ImageIcon(headerimg1));
		header1.setBounds(663, 0, 371, 200);
		contentPane.add(header1);
		
		JLabel lblNewLabel_2 = new JLabel("RENT A CAR !");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblNewLabel_2.setBounds(50, 233, 271, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel selecttype = new JLabel("SELECT  TYPE ");
		selecttype.setForeground(new Color(0, 0, 0));
		selecttype.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		selecttype.setBounds(50, 343, 115, 23);
		contentPane.add(selecttype);
		
		final JComboBox typecombobox = new JComboBox();
		typecombobox.setModel(new DefaultComboBoxModel(new String[] {"choose", "Afordable", "Expensive", "Popular"}));
		typecombobox.setBorder(null);
		typecombobox.setBackground(new Color(248, 248, 255));
		typecombobox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		typecombobox.setBounds(50, 389, 180, 23);
		contentPane.add(typecombobox);
		
		final JDateChooser tocalender = new JDateChooser();
		tocalender.getCalendarButton().setBackground(new Color(0, 0, 0));
		tocalender.setBorder(new LineBorder(new Color(255, 255, 255), 0, true));
		tocalender.setForeground(new Color(0, 0, 0));
		tocalender.setAutoscrolls(true);
		tocalender.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tocalender.setDateFormatString("d, MMM");
		tocalender.setBackground(new Color(255, 255, 255));
		tocalender.setBounds(50, 492, 80, 20);
		contentPane.add(tocalender);
		
		final JDateChooser fromcalender = new JDateChooser();	
		fromcalender.getCalendarButton().setBackground(new Color(0, 0, 0));
		fromcalender.setBackground(new Color(255, 255, 255));
		fromcalender.setDateFormatString("d,MMM");
		fromcalender.setBounds(150, 492, 80, 20);
		contentPane.add(fromcalender);
		
		JButton rentnow = new JButton("RENT NOW");
		rentnow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 carinfo  frame1 = new  carinfo();
				 SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd");
				  num1 = dateFormat2.format(tocalender.getDate());
		          num2 = dateFormat2.format(fromcalender.getDate());
		          day1 = Integer.parseInt(num1);
		          day2 = Integer.parseInt(num2);
		          days= day2-day1;
		          frame1.dayssearch.setText(Integer.toString(days));
		          frame1.typesearch.setText((String) typecombobox.getSelectedItem());
				 SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM");
				 final String formattedToDate = tocalender.getDate() != null ? dateFormat.format(tocalender.getDate()) : "No date selected";
			     final String formattedFromDate = fromcalender.getDate() != null ? dateFormat.format(fromcalender.getDate()) : "No date selected";
				 frame1.tosearch.setText(formattedToDate);
				 frame1.fromsearch.setText(formattedFromDate);
				 
				 frame1.setVisible(true);
				 dispose();
			}
		});
		rentnow.setBackground(new Color(0, 0, 0));
		rentnow.setForeground(new Color(255, 255, 255));
		rentnow.setFont(new Font("Times New Roman", Font.BOLD, 15));
		rentnow.setBounds(54, 582, 176, 33);
		contentPane.add(rentnow);
		
		
		JLabel header2 = new JLabel("");
		header2.setOpaque(true);
		header2.setBackground(new Color(0, 0, 0));
		header2.setBounds(127, 0, 537, 200);
		contentPane.add(header2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_3.setBounds(50, 452, 31, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FROM");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_4.setBounds(150, 452, 46, 14);
		contentPane.add(lblNewLabel_4);
	
	}
}
