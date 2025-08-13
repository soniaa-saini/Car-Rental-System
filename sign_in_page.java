package sonia_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import sonia_project.summary;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.DefaultComboBoxModel;

public class sign_in_page extends JFrame {

	String selectedValue;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JRadioButton maleinput;
	public JRadioButton femaleinput;
	public JTextField dobinput;
	public JTextField phonenoinput;
	public JTextField gmailinput;
	public JComboBox stateinput;
	public JTextField pincodeinput;
	public  static JTextField usernameinput;
	public static JTextField passwordinput;
	public JLabel alert ;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_in_page frame = new sign_in_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public sign_in_page() {
		setTitle("ZULO BOOKING - an app for car rental - MAIN PAGE - SIGN IN PAGE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton verifybutton = new JButton("VERIFY DETAILS");
		verifybutton.setForeground(new Color(255, 255, 255));
		verifybutton.setBackground(new Color(0, 0, 0));
		verifybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				summary frame2 = new summary();
				/*if(usernameinput.getText().equals("username") | passwordinput.getText().equals("password") | dobinput.getText().equals("dd/mm/yy") |  				phonenoinput.getText().equals("+91") | gmailinput.getText().equals("gmail") | pincodeinput.getText().equals("123") | stateinput.getSelectedItem().equals("Select") 
				| (maleinput.isSelected() || femaleinput.isSelected())) 
				{
					alert.setText("  *Please fill all details*  ");
				}
				else*/
				{
					frame2.usernameinputS.setText(usernameinput.getText());
					frame2.dobinputS.setText(dobinput.getText());
					frame2.phonenoinputS.setText(phonenoinput.getText());
					frame2.gmailinputS.setText(gmailinput.getText());
					frame2.stateinputS.setText(selectedValue);
					frame2.pincodeinputS.setText(pincodeinput.getText());
					if(maleinput.isSelected()) {
						frame2.genderinputS.setText(maleinput.getText());
					}
					else if(femaleinput.isSelected()) {
						frame2.genderinputS.setText(femaleinput.getText());
					}
					else {
						frame2.genderinputS.setText("Not Selected");
					}
					 frame2.setVisible(true);
					 dispose();

				}
				 try {
			            Class.forName("com.mysql.cj.jdbc.Driver");
			            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonia", "root", "suzie");
			            String sql = "INSERT INTO user (nameinput, ageinput, maleinput, femaleinput, phoneinput, addressinput, emailinput, cityinput, pincodeinput, passwordinput) "
			                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			            PreparedStatement ptst = con.prepareStatement(sql);

			            ptst.setString(2,usernameinput.getText());
			            ptst.setString(3,passwordinput.getText());
			            ptst.setString(4,maleinput.getText());
			            ptst.setString(5,femaleinput.getText());
			            ptst.setString(6,phonenoinput.getText());
			            ptst.setString(7,gmailinput.getText());
			            ptst.setString(8,dobinput.getText());
				        ptst.setString(9,stateinput.getSelectedItem().toString());
				        ptst.setString(10,pincodeinput.getText());
			            con.close();
			        } catch (Exception e1) {
			            System.out.println("Connection not established: ");
			        }
							}
		});
		
		alert = new JLabel("");
		alert.setForeground(new Color(139, 0, 0));
		alert.setFont(new Font("Sitka Display", Font.BOLD, 15));
		alert.setBounds(168, 575, 243, 23);
		contentPane.add(alert);
		
		verifybutton.setBounds(318, 620, 133, 30);
		contentPane.add(verifybutton);
		
		passwordinput = new JTextField();
		passwordinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				passwordinput.setForeground(Color.black);
				passwordinput.setText(null);
			}
		});
		passwordinput.setForeground(new Color(192, 192, 192));
		passwordinput.setText("password");
		passwordinput.setBounds(178, 134, 160, 23);
		contentPane.add(passwordinput);
		passwordinput.setColumns(10);
		
		JLabel username = new JLabel("Username :");
		username.setFont(new Font("Times New Roman", Font.BOLD, 15));
		username.setBounds(49, 77, 76, 18);
		contentPane.add(username);
		
		JLabel state = new JLabel("State :");
		state.setFont(new Font("Times New Roman", Font.BOLD, 15));
		state.setBounds(49, 473, 99, 14);
		contentPane.add(state);
		
		JLabel gmail = new JLabel("Gmail :");
		gmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		gmail.setBounds(49, 416, 74, 14);
		contentPane.add(gmail);
		
		JLabel Password = new JLabel("Password :");
		Password.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Password.setBounds(49, 137, 99, 14);
		contentPane.add(Password);
		
		JLabel pincode = new JLabel("Pincode :");
		pincode.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pincode.setBounds(49, 532, 99, 14);
		contentPane.add(pincode);

		JLabel sideimgcar = new JLabel("");
		Image trialimg = new ImageIcon(this.getClass().getResource("/signinimg.png")).getImage();
		
		JLabel dateofbirth = new JLabel("Date Of Birth :");
		dateofbirth.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dateofbirth.setBounds(49, 297, 111, 14);
		contentPane.add(dateofbirth);
		
		JLabel gender = new JLabel("Gender :");
		gender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		gender.setBounds(49, 193, 74, 14);
		contentPane.add(gender);
		
		JLabel phone_no= new JLabel("Phone no :");
		phone_no.setFont(new Font("Times New Roman", Font.BOLD, 15));
		phone_no.setBounds(49, 360, 99, 14);
		contentPane.add(phone_no);
		
		JLabel lblNewLabel_1 = new JLabel("Create new username and password :-");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_1.setBounds(27, 11, 410, 41);
		contentPane.add(lblNewLabel_1);
		
		username.setForeground(new Color(0, 0, 0));
		state.setForeground(Color.BLACK);
		gmail.setForeground(Color.BLACK);
		Password.setForeground(new Color(0, 0, 0));
		pincode.setForeground(Color.BLACK);
		dateofbirth.setForeground(Color.BLACK);
		gender.setForeground(Color.BLACK);
		phone_no.setForeground(Color.BLACK);
		
		phonenoinput = new JTextField();
		phonenoinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				phonenoinput.setForeground(Color.black);
				phonenoinput.setText(null);
			}
		});
		phonenoinput.setForeground(new Color(192, 192, 192));
		phonenoinput.setText("+91");
		phonenoinput.setBounds(178, 357, 171, 23);
		contentPane.add(phonenoinput);
		phonenoinput.setColumns(10);
		
		maleinput = new JRadioButton("Male");
		maleinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
					maleinput.setForeground(Color.black);
			}
		});
		maleinput.setOpaque(false);
		maleinput.setFont(new Font("Times New Roman", Font.BOLD, 13));
		maleinput.setForeground(new Color(255, 255, 255));
		maleinput.setBounds(178, 190, 56, 23);
		contentPane.add(maleinput);
		
		femaleinput = new JRadioButton("Female");
		femaleinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				femaleinput.setForeground(Color.black);
			}
		});
		femaleinput.setOpaque(false);
		femaleinput.setFont(new Font("Times New Roman", Font.BOLD, 13));
		femaleinput.setForeground(new Color(255, 255, 255));
		femaleinput.setBounds(178, 235, 68, 23);
		contentPane.add(femaleinput);
		
		if(maleinput.isSelected()) {
		 femaleinput.setEnabled(false);
		}
		else if(femaleinput.isSelected()) {
			maleinput.setEnabled(false);
		}

		gmailinput = new JTextField();
		gmailinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				gmailinput.setForeground(Color.black);
				gmailinput.setText(null);
			}
		});
		gmailinput.setForeground(new Color(192, 192, 192));
		gmailinput.setText("gmail");
		gmailinput.setBounds(178, 413, 225, 23);
		contentPane.add(gmailinput);
		gmailinput.setColumns(10);
		
		dobinput = new JTextField();
		dobinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				dobinput.setForeground(Color.black);
				dobinput.setText(null);
			}
		});
		dobinput.setForeground(new Color(192, 192, 192));
		dobinput.setText("dd/mm/yy");
		dobinput.setBounds(178, 294, 171, 23);
		contentPane.add(dobinput);
		dobinput.setColumns(10);
		
		stateinput = new JComboBox();
		stateinput.setModel(new DefaultComboBoxModel(new String[] {"Select", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujrat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Miroram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		stateinput.setForeground(new Color(0, 0, 0));
		stateinput.setBackground(new Color(255, 255, 255));
		stateinput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 selectedValue = stateinput.getSelectedItem().toString();
				
			}
		});
		stateinput.setBounds(178, 470, 171, 23);
		contentPane.add(stateinput);
		
		pincodeinput = new JTextField();
		pincodeinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				pincodeinput.setForeground(Color.black);
				pincodeinput.setText(null);
			}
		});
		pincodeinput.setForeground(new Color(192, 192, 192));
		pincodeinput.setText("123");
		pincodeinput.setBounds(178, 529, 171, 23);
		contentPane.add(pincodeinput);
		pincodeinput.setColumns(10);

		usernameinput = new JTextField();
		usernameinput.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				usernameinput.setForeground(Color.black);
				usernameinput.setText(null);
			}
		});
		usernameinput.setForeground(new Color(192, 192, 192));
		usernameinput.setText("username");
		usernameinput.setBounds(178, 76, 160, 23);
		contentPane.add(usernameinput);
		usernameinput.setColumns(10);
		
		sideimgcar.setIcon(new ImageIcon(trialimg));
		sideimgcar.setOpaque(true);
		sideimgcar.setBackground(new Color(210, 180, 140));
		sideimgcar.setBounds(0, 0, 1031, 660);
		contentPane.add(sideimgcar);
		
				
		
		
		
	}
}
