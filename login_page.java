package sonia_project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;

public class login_page extends JFrame {
 
	String permanentusername= "suzie";
	String permanentpass="zx12";
	private static final long serialVersionUID = 1L;
	public  JPanel contentPane;
	private JTextField mainpasswordinput;
	private JTextField mainusernameinput;
	public JButton next;
	public JLabel blackbg;
	private JLabel brownbg;
	private JLabel carimg;
	private JLabel login;
	private JLabel newaccount;
	private JLabel loginicon;
	private JLabel passowordicon;
	private JLabel nexticon;
	
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page frame = new login_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login_page() {
		setTitle("ZULO BOOKING - an app for car rental - LOGIN PAGE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		 contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nexticon = new JLabel("");
		Image nexticonimg = new ImageIcon(this.getClass().getResource("/nexticon.png")).getImage();
		nexticon.setIcon(new ImageIcon(nexticonimg));
		nexticon.setBounds(735, 400, 20, 20);
		contentPane.add(nexticon);
		JLabel mainheading = new JLabel("ZULO BOOKING ");
		mainheading.setForeground(new Color(0, 0, 0));
		mainheading.setBounds(97, 426, 327, 50);
		mainheading.setFont(new Font("Segoe Print", Font.BOLD, 36));
		contentPane.add(mainheading);
		
		JLabel lblNewLabel = new JLabel("Plan your trip with us now ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		lblNewLabel.setBounds(169, 472, 284, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rent a car online today & enjoy ");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(213, 500, 240, 14);
		contentPane.add(lblNewLabel_1);
		
		mainusernameinput = new JTextField();
		mainusernameinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				mainusernameinput.setText("");
				mainusernameinput.setForeground(new Color(0,0,0));

			}
		});
		mainusernameinput.setForeground(SystemColor.activeCaptionBorder);
		mainusernameinput.setText("username");
		mainusernameinput.setBounds(669, 226, 210, 28);
		contentPane.add(mainusernameinput);
		mainusernameinput.setColumns(10);
		
		blackbg = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/yellowcar.jpg")).getImage();
		blackbg.setIcon(new ImageIcon(img));
		blackbg.setOpaque(true);
		blackbg.setBounds(64, 78, 400, 306);
		contentPane.add(blackbg);
		
		mainpasswordinput = new JTextField();
		mainpasswordinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				mainpasswordinput.setText("");
				mainpasswordinput.setForeground(new Color(0,0,0));

			}
		});
		mainpasswordinput.setForeground(new Color(192, 192, 192));
		mainpasswordinput.setText("password");
		mainpasswordinput.setBounds(669, 289, 210, 28);
		contentPane.add(mainpasswordinput);
		 
		next= new JButton("NEXT         ");
		next.setHorizontalAlignment(SwingConstants.RIGHT);
		next.setBounds(698, 393, 167, 36);
		next.setFont(new Font("Times New Roman", Font.BOLD, 16));
		next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		next.setBackground(new Color(0, 0, 0));
		next.setForeground(new Color(255, 255, 255));
		contentPane.add(next);	
		
		brownbg = new JLabel("");
		brownbg.setForeground(new Color(192, 192, 192));
		brownbg.setOpaque(true);
		brownbg.setBackground(new Color(255, 255, 255));
		brownbg.setBounds(0, 0, 400, 461);
		contentPane.add(brownbg);
		
		login = new JLabel("LOGIN");
		login.setFont(new Font("Times New Roman", Font.BOLD, 35));
		login.setForeground(new Color(0, 0, 0));
		login.setBounds(693, 111, 133, 36);
		contentPane.add(login);
		
		newaccount = new JLabel("Create new account..");
		newaccount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		newaccount.setBounds(685, 499, 167, 14);
		contentPane.add(newaccount);
		
		JButton signinbutton = new JButton("Sign in");
		signinbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signinbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_in_page sign_in_page1 = new sign_in_page();
				sign_in_page1.setVisible(true);
			}
		});
		signinbutton.setForeground(new Color(0, 0, 255));
		signinbutton.setBorderPainted(false);
		signinbutton.setBackground(new Color(255, 255, 255));
		signinbutton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		signinbutton.setBounds(677, 524, 93, 20);
		contentPane.add(signinbutton);
		
		loginicon = new JLabel("");
		Image loginiconimg = new ImageIcon(this.getClass().getResource("/loginicon.png")).getImage();
		loginicon.setIcon(new ImageIcon(loginiconimg));
		loginicon.setBounds(629, 230, 20, 20);
		contentPane.add(loginicon);
		
		passowordicon = new JLabel("");
		Image passwordiconimg = new ImageIcon(this.getClass().getResource("/passwordicon.png")).getImage();
		passowordicon.setIcon(new ImageIcon(passwordiconimg));
		passowordicon.setBounds(629, 293, 20, 20);
		contentPane.add(passowordicon);
		
		next.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	rental_page frame1 = new rental_page();
		        if (mainpasswordinput.getText().equals(permanentpass) & mainusernameinput.getText().equals(permanentusername)){
	
		          //  frame2.hellotext2.setText(sign_in_page.firstnameinput.getText());
		            frame1.setVisible(true);
		            dispose();
		        }
		        else if(mainpasswordinput.getText().equals(sign_in_page.passwordinput.getText()) &  mainusernameinput.getText().equals( sign_in_page.usernameinput.getText()) ) {
		         //   frame2.hellotext2.setText(sign_in_page.firstnameinput.getText());
		            frame1.setVisible(true);
		            dispose();
		        }
		        else {
		            blackbg.setText("*The password you entered is incorrect*");
		        }
		    }
		});
	}
}
