package sonia_project;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;

public class summary extends JFrame {
	
	 public static String password;
	private static final long serialVersionUID = 1L;

	 public JTextField passwordinput;
	public JLabel dobinputS;
	public JLabel genderinputS;
	public JLabel phonenoinputS;
	public JLabel gmailinputS;
	public JLabel stateinputS;
	public JLabel pincodeinputS;
	public static JLabel usernameinputS;
	public JTextField addressinput;
	public JTextField pincodeinput;
	JPanel frame3;
		
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summary frame = new summary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public summary() {
		setTitle("ZULO BOOKING - an app for car rental - DETAILS SUMMARY");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		frame3 = new JPanel();
		frame3.setBackground(new Color(255, 255, 255));
		frame3.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frame3);
		frame3.setLayout(null);
		
		JButton loginbutton = new JButton("LOGIN");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_page login_page1 = new login_page();
				login_page1.setVisible(true);
				dispose();
			}
		});
		
		JLabel loginicon = new JLabel("");
		Image imgg = new ImageIcon(this.getClass().getResource("/loginicon.png")).getImage();
		loginicon.setIcon(new ImageIcon(imgg));
		loginicon.setBounds(828, 24, 28, 30);
		frame3.add(loginicon);
		
		loginbutton.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 15));
		loginbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginbutton.setBackground(new Color(0, 0, 0));
		loginbutton.setForeground(new Color(255, 255, 255));		
		loginbutton.setBounds(514, 599, 125, 30);
		frame3.add(loginbutton);
		
		JButton registrationbutton = new JButton("Register New User");
		registrationbutton.setOpaque(false);
		registrationbutton.setBorderPainted(false);
		registrationbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		registrationbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registrationbutton.setBackground(new Color(0, 0, 0));
		registrationbutton.setForeground(new Color(25, 25, 112));
		registrationbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_in_page sign_in_page1 = new sign_in_page();
				sign_in_page1.setVisible(true);
				dispose();
			}
		});
		registrationbutton.setBounds(824, 24, 200, 30);
		frame3.add(registrationbutton);
		
		JLabel verifydetails = new JLabel("VERIFY YOUR DETAILS..");
		verifydetails.setForeground(Color.black);
		verifydetails.setForeground(new Color(0, 0, 0));
		verifydetails.setFont(new Font("Times New Roman", Font.BOLD, 35));
		verifydetails.setBounds(255, 13, 452, 41);
		frame3.add(verifydetails);
		
		JLabel dobS = new JLabel("Date of birth     :");
		dobS.setForeground(Color.black);
		dobS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		dobS.setBounds(105, 279, 140, 14);
		frame3.add(dobS);
		
		JLabel genderS = new JLabel("Gender               :");
		genderS.setForeground(Color.black);
		genderS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		genderS.setBounds(105, 219, 140, 14);
		frame3.add(genderS);
		
		JLabel phonenoS = new JLabel("Phone No.          :");
		phonenoS.setForeground(Color.black);
		phonenoS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		phonenoS.setBounds(105, 346, 140, 14);
		frame3.add(phonenoS);
		
		JLabel gmailS = new JLabel("Gmail                 :");
		gmailS.setForeground(Color.black);
		gmailS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		gmailS.setBounds(105, 407, 140, 14);
		frame3.add(gmailS);
		
		JLabel stateS = new JLabel("State                    :");
		 stateS.setForeground(Color.black);
		stateS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		stateS.setBounds(105, 461, 140, 14);
		frame3.add(stateS);
		
		JLabel pincodeS = new JLabel("Pincode              :");
		pincodeS.setForeground(Color.black);
		pincodeS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		pincodeS.setBounds(105, 517, 140, 14);
		frame3.add(pincodeS);
		
		dobinputS = new JLabel("dob");
		dobinputS .setForeground(Color.black);
		dobinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		dobinputS.setBounds(255, 278, 200, 19);
		frame3.add(dobinputS);
		
		genderinputS = new JLabel("gender");
		genderinputS.setForeground(Color.black);
		genderinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		genderinputS.setBounds(255, 218, 200, 18);
		frame3.add(genderinputS);
		
		phonenoinputS = new JLabel("phone no");
		phonenoinputS.setForeground(Color.black);
		phonenoinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		phonenoinputS.setBounds(255, 345,200, 19);
		frame3.add(phonenoinputS);
		
		gmailinputS = new JLabel("gmail");
		gmailinputS.setForeground(Color.black);
		gmailinputS.setBackground(new Color(255, 255, 255));
		gmailinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gmailinputS.setBounds(255, 406, 261, 18);
		frame3.add(gmailinputS);
		
		stateinputS = new JLabel("state");
		stateinputS.setForeground(Color.black);
		stateinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		stateinputS.setBounds(255, 460, 200, 18);
		frame3.add(stateinputS);
		
		pincodeinputS = new JLabel("pincode");
		pincodeinputS.setForeground(Color.black);
		pincodeinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		pincodeinputS.setBounds(255, 516, 200, 19);
		frame3.add(pincodeinputS);
		
		JLabel usernameS = new JLabel("Username          :");
		usernameS.setForeground(Color.black);
		usernameS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		usernameS.setBounds(105, 162, 140, 14);
		frame3.add(usernameS);
		
		 usernameinputS = new JLabel("username");
		 usernameinputS.setForeground(Color.black);
		 usernameinputS.setForeground(new Color(0, 0, 0));
		usernameinputS.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		usernameinputS.setBounds(255, 161, 200, 18);
		frame3.add(usernameinputS);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/summaryimg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 1034, 661);
		frame3.add(lblNewLabel);
		
	}
}
