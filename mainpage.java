package sonia_project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage extends JFrame {

	private JPanel contentPane;
	private JLabel carimg;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainpage() {
		setTitle("ZULO BOOKING - an app for car rental - MAIN PAGE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = 	new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/mainpageimg.png")).getImage();
			
			JButton aboutus = new JButton("ABOUT US");
			aboutus.setForeground(new Color(255, 255, 255));
			aboutus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					portfolio portfolio1 = new portfolio();
					portfolio1.setVisible(true);
					dispose();
				}
			});
			
			JButton cardetails = new JButton("CAR DETAILS");
			cardetails.setForeground(new Color(255, 255, 255));
			cardetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 login_page  login_page1 = new  login_page();
				 login_page1.setVisible(true);
				 dispose();
			}
		});
			
			JLabel aboutusicon = new JLabel("");
			Image aboutusimg = new ImageIcon(this.getClass().getResource("/aboutusicon.png")).getImage();
			aboutusicon.setIcon(new ImageIcon(aboutusimg));
			//aboutusicon.setBackground(new Color(0, 0, 0));
			//aboutusicon.setOpaque(true);
			aboutusicon.setBounds(816, 20, 24, 28);
			contentPane.add(aboutusicon);
			
			JLabel registrationicon = new JLabel("");
			Image registrationiconimg = new ImageIcon(this.getClass().getResource("/registrationicon.png")).getImage();
			registrationicon.setIcon(new ImageIcon(registrationiconimg));
			//registrationicon.setOpaque(true);
			//registrationicon.setBackground(new Color(0, 0, 0));
			registrationicon.setBounds(379, 20, 30, 28);
			contentPane.add(registrationicon);
			
			JLabel caricon = new JLabel("");
			Image cariconimg = new ImageIcon(this.getClass().getResource("/caricon.png")).getImage();
			caricon.setIcon(new ImageIcon(cariconimg));
			//caricon.setBackground(new Color(0, 0, 0));
			//caricon.setOpaque(true);
			caricon.setBounds(573, 20, 24, 28);
			contentPane.add(caricon);
			
			JLabel wheelicon = new JLabel("");
			//wheelicon.setOpaque(true);
			Image wheeliconimg = new ImageIcon(this.getClass().getResource("/wheelicon.png")).getImage();
			wheelicon.setIcon(new ImageIcon(wheeliconimg));
			//wheelicon.setBackground(new Color(0, 0, 0));
			wheelicon.setBounds(35, 11, 50, 49);
			contentPane.add(wheelicon);
			
			JLabel loginicon = new JLabel("");
			Image loginiconimg = new ImageIcon(this.getClass().getResource("/usericon.png")).getImage();
			loginicon.setIcon(new ImageIcon(loginiconimg));
			//loginicon.setOpaque(true);
			//loginicon.setBackground(new Color(0, 0, 0));
			loginicon.setBounds(182, 20, 30, 20);
			contentPane.add(loginicon);
			
			JLabel lblNewLabel_3 = new JLabel("Worldwide");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(64, 205, 184, 50);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_2 = new JLabel("Rent Car In");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(57, 153, 207, 50);
			contentPane.add(lblNewLabel_2);
			
			JLabel mainheading = new JLabel("ZULO BOOKING ");
			mainheading.setForeground(new Color(255, 255, 255));
			mainheading.setBounds(670, 540, 327, 50);
			mainheading.setFont(new Font("Times New Roman", Font.BOLD, 35));
			contentPane.add(mainheading);
			
			JLabel lblNewLabel = new JLabel("Plan your trip with us now ");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD, 13));
			lblNewLabel.setBounds(711, 587, 240, 28);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Rent a car online today & enjoy ");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 13));
			lblNewLabel_1.setBounds(757, 615, 251, 23);
			contentPane.add(lblNewLabel_1);
			
			
		JButton register = new JButton("REGISTER");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_in_page sign_in_page1 = new sign_in_page();
				sign_in_page1.setVisible(true); 
				dispose();
			}
		});
		register.setForeground(new Color(255, 255, 255));
		register.setBackground(new Color(255, 255, 255));
		register.setBorderPainted(false);
		register.setFont(new Font("Times New Roman", Font.BOLD, 17));
		register.setOpaque(false);
		register.setBounds(394, 19, 127, 23);
		contentPane.add(register);
		cardetails.setBounds(591, 19, 154, 23);
		cardetails.setBackground(new Color(255, 255, 255));
		cardetails.setBorderPainted(false);
		cardetails.setFont(new Font("Times New Roman", Font.BOLD, 17));
		cardetails.setOpaque(false);
		contentPane.add(cardetails);
			aboutus.setBackground(new Color(255, 255, 255));
			aboutus.setBorderPainted(false);
			aboutus.setFont(new Font("Times New Roman", Font.BOLD, 17));
			aboutus.setOpaque(false);
			aboutus.setBounds(834, 19, 117, 23);
			contentPane.add(aboutus);
		
			JButton loginbutton = new JButton("LOGIN");
			loginbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					login_page login_page1 = new login_page();
					login_page1.setVisible(true);
					dispose();
				}
			});
			loginbutton.setForeground(new Color(255, 255, 255));
			loginbutton.setBackground(new Color(255, 255, 255));
			loginbutton.setBorderPainted(false);
			loginbutton.setFont(new Font("Times New Roman", Font.BOLD, 17));
			loginbutton.setOpaque(false);
			loginbutton.setBounds(202, 13, 96, 35);
			contentPane.add(loginbutton);
		
		JLabel mainimg = new JLabel();
		mainimg.setBounds(0, 0, 1034, 661);
		mainimg.setBackground(new Color(0,0,0));
		mainimg.setOpaque(true);
		mainimg.setIcon(new ImageIcon(img));
		contentPane.add(mainimg);
		
	
		
		
		
				

	}
}
