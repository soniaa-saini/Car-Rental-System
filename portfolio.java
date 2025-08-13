package sonia_project;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

public class portfolio extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					portfolio frame = new portfolio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 Image img1 = new ImageIcon(this.getClass().getResource("/left.jpg")).getImage();
	 Image img2 = new ImageIcon(this.getClass().getResource("/middle.jpg")).getImage();
	 Image img3 = new ImageIcon(this.getClass().getResource("/right.jpg")).getImage();	 Image img4 = new ImageIcon(this.getClass().getResource("/side.jpg")).getImage();
	 Image img5 = new ImageIcon(this.getClass().getResource("/pfuser.png")).getImage();
	 Image img6 = new ImageIcon(this.getClass().getResource("/pfcar.png")).getImage();
	 Image img7 = new ImageIcon(this.getClass().getResource("/pfsummary.png")).getImage();
	 Image img8 = new ImageIcon(this.getClass().getResource("/pfgoal.png")).getImage();

	public portfolio() {
		setTitle("ZULO BOOKING - an app for car rental - ABOUT US - SONIA");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel leftimg = new JLabel("");
		leftimg.setIcon(new ImageIcon(img1));
		leftimg.setOpaque(true);
		leftimg.setBackground(new Color(0, 0, 0));
		leftimg.setBounds(0, 0, 258, 330);
		contentPane.add(leftimg);
		
		JLabel middleimg = new JLabel("");
		middleimg.setIcon(new ImageIcon(img2));
		middleimg.setOpaque(true);
		middleimg.setBackground(new Color(0, 0, 0));
		middleimg.setBounds(259, 331, 258, 330);
		contentPane.add(middleimg);
		
		JLabel rightimg = new JLabel("");
		rightimg.setIcon(new ImageIcon(img3));
		rightimg.setBackground(new Color(0, 0, 0));
		rightimg.setOpaque(true);
		rightimg.setBounds(517, 0, 258, 330);
		contentPane.add(rightimg);
		
		JLabel sideimg = new JLabel("");
		sideimg.setIcon(new ImageIcon(img4));
		sideimg.setBackground(new Color(0, 0, 0));
		sideimg.setOpaque(true);
		sideimg.setBounds(776, 331, 258, 330);
		contentPane.add(sideimg);
		
		JLabel lblNewLabel = new JLabel("SONIA ");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel.setBounds(350, 58, 97, 25);
		contentPane.add(lblNewLabel);
		
		JTextArea area = new JTextArea();
		area.setText("A female aspirant seeking for a bright future  and tirelessly trying to improve my skills");
		area.setFont(new Font("Monospaced", Font.PLAIN, 15));
		area.setWrapStyleWord(true); 
		area.setLineWrap(true); 
		area.setEditable(false); 
		area.setBackground(new Color(240,240,240));
		area.setBounds(303, 131, 182, 172);
		contentPane.add(area);
		
		JLabel usericon = new JLabel("");
		usericon.setIcon(new ImageIcon(img5));
	//  usericon.setOpaque(true);
		usericon.setBackground(new Color(192, 192, 192));
		usericon.setBounds(303, 53, 32, 32);
		contentPane.add(usericon);
		
		JLabel caricon = new JLabel("");
		caricon.setIcon(new ImageIcon(img6));
	//	caricon.setOpaque(true);
		caricon.setBackground(new Color(192, 192, 192));
		caricon.setBounds(30, 398, 32, 32);
		contentPane.add(caricon);
		
		JLabel lblNewLabel_1 = new JLabel("COMPANY ");
		lblNewLabel_1.setForeground(new Color(105, 105, 105));
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1.setBounds(88, 398, 120, 32);
		contentPane.add(lblNewLabel_1);
		
		JTextArea company = new JTextArea();
		company.setText("Our company offer rental car on    per day basis    with cash on delivery and free pickup services");
		company.setFont(new Font("Monospaced", Font.PLAIN, 15));
		company.setWrapStyleWord(true); 
		company.setLineWrap(true); 
		company.setEditable(false);
		company.setOpaque(false);
		company.setBounds(30, 470, 182, 151);
		contentPane.add(company);
		
		JLabel summaryicon = new JLabel("");
		 summaryicon.setIcon(new ImageIcon(img7));
		summaryicon.setBounds(562, 398, 32, 32);
		contentPane.add(summaryicon);
		
		JLabel lblNewLabel_2 = new JLabel("ABOUT US");
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_2.setBounds(618, 398, 120, 25);
		contentPane.add(lblNewLabel_2);
		
		JTextArea aboutus = new JTextArea();
		aboutus.setFont(new Font("Monospaced", Font.PLAIN, 15));
		aboutus.setText("A problem solver at heart, I bring creativity and technical expertise to every line of code I write");
		aboutus.setOpaque(false);
		aboutus.setWrapStyleWord(true); 
		aboutus.setLineWrap(true);
		aboutus.setBounds(559, 472, 163, 149);
		contentPane.add(aboutus);
		
		JLabel lblNewLabel_3 = new JLabel("GOAL");
		lblNewLabel_3.setForeground(new Color(105, 105, 105));
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_3.setBounds(901, 54, 73, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel goalicon = new JLabel("");
		goalicon.setIcon(new ImageIcon(img8));
		goalicon.setBounds(834, 58, 32, 32);
		contentPane.add(goalicon);
		
		JTextArea goal = new JTextArea();
		goal.setFont(new Font("Monospaced", Font.PLAIN, 15));
		goal.setText("An eager learner, I’m excited to grow as a developer and contribute my skills to building meaningful applications");
		goal.setOpaque(false);
		goal.setWrapStyleWord(true); 
		goal.setLineWrap(true);
		goal.setBounds(821, 131, 182, 158);
		contentPane.add(goal);
			}
		}
