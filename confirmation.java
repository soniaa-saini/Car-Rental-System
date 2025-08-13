package sonia_project;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmation extends JFrame {

	private JPanel contentPane;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField pincode;
	private JLabel gst;
	private JLabel delivery;
	private JLabel dcharges;
	private JLabel security;
	private JLabel scharges;
	private JLabel rent;
	private JLabel dcinput;
	private JLabel gstinput;
	private JLabel ocinput;
	private JLabel rentinput;
	private JLabel total;
	private JLabel totalinput;
	private JLabel line1;
	private JLabel line2;
	
	public int cbrent;
	int bill;
	private JButton confirmbutton;
	private JLabel confirmlabel1;
	private JLabel confirmlabel2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmation frame = new confirmation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void totalbill() {
		 bill = 537 + 2000 + 500 +cbrent;
		 totalinput.setText(Integer.toString(bill));
		}
	
	public confirmation() {
		setTitle("ZULO BOOKING - an app for car rental - CAR BILLLING");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image map = new ImageIcon(this.getClass().getResource("/map.png")).getImage();
		
		confirmlabel2 = new JLabel("");
		confirmlabel2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		confirmlabel2.setBackground(new Color(189, 183, 107,0));
		confirmlabel2.setOpaque(true);
		confirmlabel2.setBounds(156, 361, 500, 60);
		contentPane.add(confirmlabel2);
		
		confirmlabel1 = new JLabel("");
		confirmlabel1.setOpaque(true);
		confirmlabel1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		confirmlabel1.setBackground(new Color(95, 158, 160,0));
		confirmlabel1.setBounds(156, 306, 500, 60);
		contentPane.add(confirmlabel1);
		
		JLabel mapimg = new JLabel("");
		mapimg.setIcon(new ImageIcon(map));
		mapimg.setBounds(427, 166, 626, 468);
		contentPane.add(mapimg);
		
		JLabel design = new JLabel("");
		design.setBorder(new LineBorder(new Color(255, 204, 51), 611, true));
		design.setOpaque(true);
		design.setBackground(new Color(255, 255, 255));
		design.setBounds(660, 11, 655, 592);
		contentPane.add(design);
		
		JLabel deliveryaddress = new JLabel("Address For Delivery  :");
		deliveryaddress.setFont(new Font("Times New Roman", Font.BOLD, 23));
		deliveryaddress.setBounds(33, 34, 262, 30);
		contentPane.add(deliveryaddress);
		
		address = new JTextField();
		address.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				address.setText(null);
				address.setForeground(Color.black);
			}
		});
		address.setForeground(new Color(192, 192, 192));
		address.setText("Area");
		address.setFont(new Font("Times New Roman", Font.BOLD, 15));
		address.setBounds(148, 75, 300, 30);
		contentPane.add(address);
		address.setColumns(10);
		
		city = new JTextField();
		city.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				city.setText(null);
				city.setForeground(Color.black);
			}
		});
		city.setFont(new Font("Times New Roman", Font.BOLD, 15));
		city.setForeground(new Color(192, 192, 192));
		city.setText("City");
		city.setBounds(148, 116, 300, 30);
		contentPane.add(city);
		city.setColumns(10);
		
		state = new JTextField();
		state.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				state.setText(null);
				state.setForeground(Color.black);
			}
		});
		state.setFont(new Font("Times New Roman", Font.BOLD, 15));
		state.setText("State");
		state.setForeground(new Color(192, 192, 192));
		state.setBounds(148, 157, 300, 30);
		contentPane.add(state);
		state.setColumns(10);
		
		pincode = new JTextField();
		pincode.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				pincode.setText(null);
				pincode.setForeground(Color.black);
			}
		});
		pincode.setFont(new Font("Times New Roman", Font.BOLD, 15));
		pincode.setText("Pincode");
		pincode.setForeground(new Color(192, 192, 192));
		pincode.setBounds(148, 198, 300, 30);
		contentPane.add(pincode);
		pincode.setColumns(10);
		
		JButton nextbutton = new JButton("NEXT");
		nextbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		nextbutton.setForeground(new Color(165, 42, 42));
		nextbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame2 = new carbilling();
				delivery.setText("DELIVERY");
				dcharges.setText("CHARGES");
				gst.setText("GST");
				security.setText("SECURITY");
				scharges.setText("CHARGES");
				rent.setText("RENT");
				total.setText("TOTAL");
				line1.setText("-------------------------");
				line2.setText("-------------------------");
				dcinput.setText("500");
				ocinput.setText("2000");
				gstinput.setText("537");
				rentinput.setText(Integer.toString(cbrent));
				totalbill();
				confirmbutton.setBackground(new Color(255,204,51));
				confirmbutton.setForeground(new Color(165,42,42));
				confirmbutton.setText("CONFIRMED");
			}
		});
		nextbutton.setBackground(new Color(255, 204, 51));
		nextbutton.setBorder(null);
		nextbutton.setBounds(148, 256, 147, 40);
		contentPane.add(nextbutton);
		
		gst = new JLabel();
		gst.setFont(new Font("Times New Roman", Font.BOLD, 14));
		gst.setBounds(33, 379, 46, 14);
		contentPane.add(gst);
		
		delivery = new JLabel();
		delivery.setFont(new Font("Times New Roman", Font.BOLD, 14));
		delivery.setBounds(27, 337, 82, 14);
		contentPane.add(delivery);
		
		dcharges = new JLabel();
		dcharges.setFont(new Font("Times New Roman", Font.BOLD, 14));
		dcharges.setBounds(27, 352, 76, 14);
		contentPane.add(dcharges);
		
		security = new JLabel();
		security.setFont(new Font("Times New Roman", Font.BOLD, 14));
		security.setBounds(33, 407, 70, 14);
		contentPane.add(security);
		
		scharges = new JLabel();
		scharges.setFont(new Font("Times New Roman", Font.BOLD, 14));
		scharges.setBounds(33, 421, 70, 14);
		contentPane.add(scharges);
		
		rent = new JLabel();
		rent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rent.setBounds(33, 455, 46, 14);
		contentPane.add(rent);
		
		dcinput = new JLabel();
		dcinput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		dcinput.setBounds(148, 345, 96, 14);
		contentPane.add(dcinput);
		
		gstinput = new JLabel();
		gstinput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		gstinput.setBounds(148, 379, 96, 14);
		contentPane.add(gstinput);
		
		ocinput = new JLabel();
		ocinput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ocinput.setBounds(148, 414, 96, 14);
		contentPane.add(ocinput);
		
		rentinput = new JLabel();
		rentinput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rentinput.setBounds(148, 453, 96, 14);
		contentPane.add(rentinput);
		
		total = new JLabel();
		total.setFont(new Font("Times New Roman", Font.BOLD, 14));
		total.setBounds(33, 503, 76, 14);
		contentPane.add(total);
		
		totalinput = new JLabel();
		totalinput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		totalinput.setBounds(148, 503, 96, 14);
		contentPane.add(totalinput);
		
		line1 = new JLabel();
		line1.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		line1.setBounds(116, 478, 128, 14);
		contentPane.add(line1);
		
		line2 = new JLabel();
		line2.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		line2.setBounds(116, 528, 128, 14);
		contentPane.add(line2);
		
		confirmbutton = new JButton("");
		confirmbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		confirmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				confirmlabel1.setBackground(Color.BLACK);
				confirmlabel1.setForeground(new Color(165,42,42));
				confirmlabel2.setBackground(Color.BLACK);
				confirmlabel2.setForeground(new Color(165,42,42));
				//confirmlabel1.set
				confirmlabel1.setText("      Your Booking Has Been Confirmed !!");
				
				
				confirmlabel2.setText("      Thankyou For Visit :) ");
				
			}
		});
		confirmbutton.setBorder(null);
		confirmbutton.setBackground(Color.WHITE);
		confirmbutton.setBounds(113, 591, 128, 40);
		contentPane.add(confirmbutton);
		
	}
}
