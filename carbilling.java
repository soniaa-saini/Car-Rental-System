package sonia_project;

import java.awt.EventQueue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class carbilling extends JFrame {

private JPanel contentPane;
private JLabel haedline;
private JLabel car;
private JLabel seater;
private JLabel price;
private JLabel rating;
private JLabel mileage;
private JLabel to;
private JLabel from;

 int hi20price = 1500;
 int tiprice = 1700;
 int msprice = 1000;
 int mssprice = 2000;
 int hcprice = 1500;
 int mmprice = 2000;
 int sum=1;
 public int days;

public JLabel carname;
public JLabel carseater;
public JLabel carprice;
public JLabel carmileage;
public JLabel carrating;
public JLabel carfrom;
public JLabel carto;
private JButton cancelbutton;
private JButton confirmbutton;
public JLabel carimg;
private JLabel totalrent;
public JLabel rentinput;
private JButton nextbutton;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carbilling frame = new carbilling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void getrent() {
		carinfo frame1 = new carinfo();
		 rental_page frame2 = new  rental_page();
		// days=Integer.parseInt(frame2.daysinput.getText());
		 
			if(frame1.namehi20.getText().equals(carname.getText())) {
			 sum=hi20price*days;
			 rentinput.setText(Integer.toString(sum));
				}
			else if(frame1.namems.getText().equals(carname.getText())) {
				 sum=msprice*days;
				 rentinput.setText(Integer.toString(sum));
					}
			else if(frame1.namehc.getText().equals(carname.getText())) {
				 sum=hcprice*days;
				 rentinput.setText(Integer.toString(sum));
					}
			else if(frame1.nameti.getText().equals(carname.getText())) {
				 sum=tiprice*days;
				 rentinput.setText(Integer.toString(sum));
					}
			else if(frame1.namemss.getText().equals(carname.getText())) {
				 sum=mssprice*days;
				 rentinput.setText(Integer.toString(sum));
					}
			else if(frame1.namemm.getText().equals(carname.getText())) {
				 sum=mmprice*days;
				 rentinput.setText(Integer.toString(sum));
					}
			}
	
	public carbilling() {
		setTitle("ZULO BOOKING - an app for car rental - CONFIRMATION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Image cancel = new ImageIcon(this.getClass().getResource("/crossicon.png")).getImage();
		Image confirm = new ImageIcon(this.getClass().getResource("/tickicon.png")).getImage();
		contentPane.setLayout(null);
		
		nextbutton = new JButton("NEXT");
		nextbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmation frame2 = new confirmation();
				frame2.cbrent=Integer.parseInt(rentinput.getText());
				frame2.setVisible(true);
				dispose();
			}
		});
		nextbutton.setForeground(Color.WHITE);
		nextbutton.setBackground(Color.WHITE);
		nextbutton.setBorder(null);
		nextbutton.setBounds(336, 549, 125, 36);
		contentPane.add(nextbutton);
		
		mileage = new JLabel("MILEAGE                 :");
		mileage.setFont(new Font("Times New Roman", Font.BOLD, 16));
		mileage.setBounds(32, 213, 148, 20);
		contentPane.add(mileage);
		
		haedline = new JLabel("Are you really want to rent this car  ??");
		haedline.setBounds(32, 27, 408, 30);
		contentPane.add(haedline);
		haedline.setForeground(new Color(0, 0, 0));
		haedline.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		car = new JLabel("CAR                           :");
		car.setBounds(33, 96, 147, 20);
		contentPane.add(car);
		car.setForeground(new Color(0, 0, 0));
		car.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		seater = new JLabel("SEATER                    :");
		seater.setBounds(32, 135, 147, 20);
		contentPane.add(seater);
		seater.setForeground(new Color(0, 0, 0));
		seater.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		price = new JLabel("PRICE PER DAY     :");
		price.setBounds(32, 174, 145, 20);
		contentPane.add(price);
		price.setForeground(new Color(0, 0, 0));
		price.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		rating = new JLabel("RATING                    :");
		rating.setBounds(32, 252, 148, 20);
		contentPane.add(rating);
		rating.setForeground(new Color(0, 0, 0));
		rating.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		to = new JLabel("TO                               :");
		to.setFont(new Font("Times New Roman", Font.BOLD, 16));
		to.setBounds(32, 332, 151, 20);
		contentPane.add(to);
		
		from = new JLabel("FROM                        :");
		from.setFont(new Font("Times New Roman", Font.BOLD, 16));
		from.setBounds(30, 291, 150, 20);
		contentPane.add(from);
		
		carname = new JLabel("");
		carname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carname.setBounds(209, 100, 200, 20);
		contentPane.add(carname);
		
		carseater = new JLabel("");
		carseater.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carseater.setBounds(209, 136, 200, 20);
		contentPane.add(carseater);
		
		carprice = new JLabel("");
		carprice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carprice.setBounds(209, 175, 200, 20);
		contentPane.add(carprice);
		
		carmileage = new JLabel("");
		carmileage.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carmileage.setBounds(209, 214, 200, 20);
		contentPane.add(carmileage);
		
		carrating = new JLabel("");
		carrating.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carrating.setBounds(209, 253, 200, 20);
		contentPane.add(carrating);
		
		carfrom = new JLabel("");
		carfrom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carfrom.setBounds(209, 292, 200, 20);
		contentPane.add(carfrom);
		
		carto = new JLabel("");
		carto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		carto.setBounds(209, 333, 200, 20);
		contentPane.add(carto);
		
		cancelbutton = new JButton("CANCEL");
		cancelbutton.setForeground(Color.WHITE);
		cancelbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		cancelbutton.setBackground(Color.BLACK);
		cancelbutton.setBorder(null);
		cancelbutton.setBounds(157, 415, 118, 36);
		contentPane.add(cancelbutton);
		
		confirmbutton = new JButton("CONFIRM");
		confirmbutton.setForeground(Color.WHITE);
		confirmbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		confirmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalrent.setText("Total rent : ");
				getrent();
				nextbutton.setBackground(new Color(0,0,0));
				nextbutton.setText("NEXT");
				
			}
		});
		confirmbutton.setBackground(Color.BLACK);
		confirmbutton.setBorder(null);
		confirmbutton.setBounds(320, 415, 120, 36);
		contentPane.add(confirmbutton);
		
		carimg = new JLabel("");
		carimg.setBounds(564, 60, 460, 310);
		contentPane.add(carimg);
		
		totalrent = new JLabel("");
		totalrent.setFont(new Font("Times New Roman", Font.BOLD, 16));
		totalrent.setBounds(32, 562, 118, 20);
		contentPane.add(totalrent);
		
		rentinput = new JLabel("");
		rentinput.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rentinput.setBounds(198, 562, 90, 20);
		contentPane.add(rentinput);
	
	}
}
