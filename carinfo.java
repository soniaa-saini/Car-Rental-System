package sonia_project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class carinfo extends JFrame {

	private JPanel contentPane;
	public JLabel typesearch;
	public JLabel fromsearch;
	public JLabel tosearch;
	public static JLabel dayssearch ;
	
	public JLabel  ratingms, ratinghi20, ratinghc,ratingmm, ratingti, ratingmss;
	public JLabel  pricems, pricehi20, pricehc,pricemm, priceti, pricemss;  
	public JLabel  namems, namehi20, namehc,nameti, namemss, namemm;
	public JLabel  seaterms, seaterhi20, seaterhc, seatermm, seaterti, seatermss;
	public JLabel mileagehi20 , mileagehc , mileageti , mileagemss , mileagems , mileagemm ;
	
	Image halfstar;
	Image fullstar;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carinfo frame = new carinfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public carinfo() {
		setTitle("ZULO BOOKING - an app for car rental - CAR INFO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1050, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel car6 = new JLabel("");
		Image carimg6 = new ImageIcon(this.getClass().getResource("/mm.png")).getImage();
		Image arrow1 = new ImageIcon(this.getClass().getResource("/arrowicon.png")).getImage();
		
		JButton mmbutton = new JButton("");
		mmbutton.setBackground(new Color(255, 255, 255,0));
		mmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carmm.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(namemm.getText());
				frame4.carseater.setText(seatermm.getText());
				frame4.carprice.setText(pricemm.getText());
				frame4.carmileage.setText(mileagemm.getText());
				frame4.carrating.setIcon(new ImageIcon(fullstar));
				// frame4.background.setBackground(new Color(51,102,102,50));
				 frame4.carfrom.setText(fromsearch.getText());
					frame4.carto.setText(tosearch.getText());
				 frame4.setVisible(true);	
				 dispose();		
			}
		});
		 fullstar = new ImageIcon(this.getClass().getResource("/fullstar.png")).getImage();
		 halfstar = new ImageIcon(this.getClass().getResource("/halfstar.png")).getImage();
		Image icon1 = new ImageIcon(this.getClass().getResource("/aboutusicon.png")).getImage();
		
		mileageti = new JLabel("11-12km/l");
		mileageti.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mileageti.setBounds(85, 594, 58, 14);
		contentPane.add(mileageti);
		
		mileagems = new JLabel("24-31 km/l ");
		mileagems.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mileagems.setBounds(409, 389, 72, 14);
		contentPane.add(mileagems);
		
		mileagehc = new JLabel("18-27 km/l");
		mileagehc.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mileagehc.setBounds(731, 389, 63, 14);
		contentPane.add(mileagehc);
		
		mileagemss = new JLabel("24-25 km/l");
		mileagemss.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mileagemss.setBounds(409, 593, 72, 14);
		contentPane.add(mileagemss);
		
		mileagemm = new JLabel("16-17km/l");
		mileagemm.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mileagemm.setBounds(731, 593, 73, 14);
		contentPane.add(mileagemm);
		
		mileagehi20 = new JLabel("19-25 km/l");
		mileagehi20.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mileagehi20.setBounds(85, 390, 58, 14);
		contentPane.add(mileagehi20);
		
		JLabel lblNewLabel_27 = new JLabel("");
		 lblNewLabel_27.setIcon(new ImageIcon(icon1));
		lblNewLabel_27.setBounds(791, 26, 20, 23);
		contentPane.add(lblNewLabel_27);
		
		JButton aboutusbutton = new JButton("ABOUT US");
		aboutusbutton.setBackground(new Color(255, 255, 255,0));
		aboutusbutton.setOpaque(false);
		aboutusbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				portfolio portfolio1 = new portfolio();
				portfolio1.setVisible(true);
				dispose();
				
			}
		});
		aboutusbutton.setBorder(null);
		aboutusbutton.setForeground(new Color(255, 255, 255));
		aboutusbutton.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		aboutusbutton.setBounds(809, 26, 100, 23);
		contentPane.add(aboutusbutton);
		
		 ratingms = new JLabel("");
		ratingms.setIcon(new ImageIcon(fullstar));
		ratingms.setBounds(567, 271, 80, 15);
		contentPane.add(ratingms);
		
		 ratinghi20 = new JLabel("");
		ratinghi20.setIcon(new ImageIcon(fullstar));
		ratinghi20.setBounds(241, 271, 80, 15);
		contentPane.add(ratinghi20);
		
		 ratingmm = new JLabel("");
		 ratingmm.setIcon(new ImageIcon(fullstar));
		ratingmm.setBounds(883, 469, 80, 15);
		contentPane.add(ratingmm);
		
		 ratinghc = new JLabel("");
		ratinghc.setIcon(new ImageIcon(halfstar));
		ratinghc.setBounds(883, 271, 80, 15);
		contentPane.add(ratinghc);
		
		 ratingti = new JLabel("");
		 ratingti.setIcon(new ImageIcon(halfstar));
		ratingti.setBounds(241, 469, 80, 15);
		contentPane.add(ratingti);
		
		 ratingmss = new JLabel("");
		ratingmss.setIcon(new ImageIcon(halfstar));
		ratingmss.setBounds(567, 469, 80, 15);
		contentPane.add(ratingmss);
		mmbutton.setBorder(null);

		mmbutton.setIcon(new ImageIcon(arrow1));
		mmbutton.setBounds(829, 627, 28, 23);
		contentPane.add(mmbutton);
		
		JButton hi20button = new JButton("");
		hi20button.setBackground(new Color(255, 255, 255,0));
		hi20button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carhi20.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(namehi20.getText());
				frame4.carseater.setText(seaterhi20.getText());
				frame4.carprice.setText(pricehi20.getText());
				frame4.carmileage.setText(mileagehi20.getText());
				frame4.carrating.setIcon(new ImageIcon(fullstar));
				//frame4.background.setBackground(new Color(204, 204, 51,50));
				frame4.carfrom.setText(fromsearch.getText());
				frame4.carto.setText(tosearch.getText());
				 frame4.setVisible(true);	
				 dispose();
				 }
		});
		
		JButton mssbutton = new JButton("");
		mssbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carmss.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(namemss.getText());
				frame4.carseater.setText(seatermss.getText());
				frame4.carprice.setText(pricemss.getText());
				frame4.carmileage.setText(mileagemss.getText());
				frame4.carrating.setIcon(new ImageIcon(halfstar));
			//	 frame4.background.setBackground(new Color(255, 102, 0, 50));
				 frame4.carfrom.setText(fromsearch.getText());
					frame4.carto.setText(tosearch.getText());
				 frame4.setVisible(true);	
				 dispose();			
			}
		});
		mssbutton.setBorder(null);
		mssbutton.setIcon(new ImageIcon(arrow1));
		mssbutton.setBackground(new Color(255, 255, 255,0));
		mssbutton.setBounds(505, 627, 28, 23);
		contentPane.add(mssbutton);
		
		hi20button.setBorder(null);
		hi20button.setIcon(new ImageIcon(arrow1));
		hi20button.setBounds(182, 421, 28, 23);
		contentPane.add(hi20button);
		
		JButton tibutton = new JButton("");
		tibutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carti.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(nameti.getText());
				frame4.carseater.setText(seaterti.getText());
				frame4.carprice.setText(priceti.getText());
				frame4.carmileage.setText(mileageti.getText());
				frame4.carrating.setIcon(new ImageIcon(halfstar));
			//	 frame4.background.setBackground(new Color(102,0,51,50));
				 frame4.carfrom.setText(fromsearch.getText());
					frame4.carto.setText(tosearch.getText());
				 frame4.setVisible(true);	
				 dispose();	
			}
		});
		tibutton.setBorder(null);

		tibutton.setIcon(new ImageIcon(arrow1));
		tibutton.setBackground(new Color(255, 255, 255,0));
		tibutton.setBounds(182, 627, 28, 23);
		contentPane.add(tibutton);
		
		JButton hcbutton = new JButton("");
		hcbutton.setBackground(new Color(255, 255, 255,0));
		hcbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carhc.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(namehc.getText());
				frame4.carseater.setText(seaterhc.getText());
				frame4.carprice.setText(pricehc.getText());
				frame4.carmileage.setText(mileagehc.getText());
				frame4.carrating.setIcon(new ImageIcon(fullstar));
				// frame4.background.setBackground(new Color(165,42,42,50));
				 frame4.carfrom.setText(fromsearch.getText());
					frame4.carto.setText(tosearch.getText());
				 frame4.setVisible(true);	
				 dispose();		
			}
		});
		hcbutton.setBorder(null);
		hcbutton.setIcon(new ImageIcon(arrow1));
		hcbutton.setBounds(829, 421, 31, 23);
		contentPane.add(hcbutton);
		
		JButton msbutton = new JButton("");
		msbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				carbilling frame4 = new carbilling();
				frame4.days=Integer.parseInt(dayssearch.getText());
				Image big1 = new ImageIcon(this.getClass().getResource("/carms.png")).getImage();
				frame4.carimg.setIcon(new ImageIcon(big1));
				frame4.carname.setText(namems.getText());
				frame4.carseater.setText(seaterms.getText());
				frame4.carprice.setText(pricems.getText());
				frame4.carmileage.setText(mileagems.getText());
				frame4.carrating.setIcon(new ImageIcon(fullstar));
			//	frame4.background.setBackground(new Color(0.0f,0.0f,0.0f,0.1f));
				frame4.carfrom.setText(fromsearch.getText());
				frame4.carto.setText(tosearch.getText());
				frame4.setVisible(true);	
				dispose();	
			}
		});
		msbutton.setBorder(null);
		msbutton.setBackground(new Color(255, 255, 255,0));
		msbutton.setIcon(new ImageIcon(arrow1));
		msbutton.setBounds(505, 421, 28, 23);
		contentPane.add(msbutton);
		
		seaterhi20 = new JLabel("4 Seater");
		seaterhi20.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seaterhi20.setBounds(85, 409, 58, 14);
		contentPane.add(seaterhi20);
		
		pricehi20 = new JLabel(" 1500 /-");
		pricehi20.setForeground(new Color(0, 0, 0));
		pricehi20.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		pricehi20.setOpaque(true);
		pricehi20.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		pricehi20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pricehi20.setBounds(241, 397, 50, 20);
		contentPane.add(pricehi20);
		
		seaterti = new JLabel("8 Seater");
		seaterti.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seaterti.setBounds(85, 613, 46, 14);
		contentPane.add(seaterti);
		
		priceti = new JLabel(" 1700 /-");
		priceti.setForeground(new Color(0, 0, 0));
		priceti.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		priceti.setOpaque(true);
		priceti.setFont(new Font("Times New Roman", Font.BOLD, 14));
		priceti.setBounds(241, 600, 50, 20);
		contentPane.add(priceti);
		
		seaterms = new JLabel("4 Seater");
		seaterms.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seaterms.setBounds(409, 409, 46, 14);
		contentPane.add(seaterms);
		
	    pricems = new JLabel(" 1000 /-");
		pricems.setForeground(new Color(0, 0, 0));
		pricems.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		pricems.setOpaque(true);
		pricems.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pricems.setBounds(567, 398, 50, 20);
		contentPane.add(pricems);
		
		seatermss = new JLabel("8 Seater");
		seatermss.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seatermss.setBounds(409, 613, 46, 14);
		contentPane.add(seatermss);
		
		pricemss = new JLabel(" 2000 /-");
		pricemss.setForeground(new Color(0, 0, 0));
		pricemss.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		pricemss.setOpaque(true);
		pricemss.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pricemss.setBounds(567, 600, 50, 20);
		contentPane.add(pricemss);
		
		seaterhc = new JLabel("4 Seater");
		seaterhc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seaterhc.setBounds(731, 409, 46, 14);
		contentPane.add(seaterhc);
		
		pricehc = new JLabel(" 1500 /-");
		pricehc.setForeground(new Color(0, 0, 0));
		pricehc.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		pricehc.setOpaque(true);
		pricehc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pricehc.setBounds(885, 397, 50, 20);
		contentPane.add(pricehc);
		
		seatermm = new JLabel("8 Seater");
		seatermm.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		seatermm.setBounds(731, 613, 46, 14);
		contentPane.add(seatermm);
		
		pricemm = new JLabel(" 2000 /-");
		pricemm.setForeground(new Color(0, 0, 0));
		pricemm.setBackground(new Color(0.0f,0.0f,0.0f,0.4f));
		pricemm.setOpaque(true);
		pricemm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pricemm.setBounds(885, 600, 50, 20);
		contentPane.add(pricemm);
		
		
		namemm = new JLabel("  Mahindra Marazzo");
		namemm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		namemm.setBounds(713, 470, 176, 14);
		contentPane.add(namemm);
		
		namemss = new JLabel(" Maruti Suzuki S-Presso");
		namemss.setFont(new Font("Times New Roman", Font.BOLD, 16));
		namemss.setBounds(397, 470, 182, 23);
		contentPane.add(namemss);
		
		nameti = new JLabel("  Toyoto Innova");
		nameti.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nameti.setBounds(71, 470, 107, 14);
		contentPane.add(nameti);
		
		namehc = new JLabel("  Honda City ");
		namehc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		namehc.setBounds(713, 270, 91, 14);
		contentPane.add(namehc);
		
		namems = new JLabel("  Maruti Suzuki");
		namems.setFont(new Font("Times New Roman", Font.BOLD, 16));
		namems.setBounds(397, 270, 121, 14);
		contentPane.add(namems);
		
		namehi20 = new JLabel("  Hyundai i20");
		namehi20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		namehi20.setBounds(71, 270, 107, 14);
		contentPane.add(namehi20);
		car6.setIcon(new ImageIcon(carimg6));
		car6.setBounds(781, 519, 150, 70);
		contentPane.add(car6);
		
		JLabel car5 = new JLabel("");
		Image carimg5 = new ImageIcon(this.getClass().getResource("/mss.png")).getImage();
		car5.setIcon(new ImageIcon(carimg5));
		car5.setBounds(463, 519, 150, 70);
		contentPane.add(car5);
		
		JLabel car4 = new JLabel("");
		Image carimg4 = new ImageIcon(this.getClass().getResource("/ti.png")).getImage();
		car4.setIcon(new ImageIcon(carimg4));
		car4.setBounds(133, 519, 150, 70);
		contentPane.add(car4);
		
		JLabel car3 = new JLabel("");
		Image carimg3 = new ImageIcon(this.getClass().getResource("/hc.png")).getImage();
		car3.setIcon(new ImageIcon(carimg3));
		car3.setBounds(768, 304, 150, 73);
		contentPane.add(car3);
		
		JLabel car2 = new JLabel("");
		Image carimg2 = new ImageIcon(this.getClass().getResource("/ms.png")).getImage();
		car2.setIcon(new ImageIcon(carimg2));
		car2.setBounds(450, 314, 150, 70);
		contentPane.add(car2);
		
		JLabel car1 = new JLabel("");
		Image carimg1 = new ImageIcon(this.getClass().getResource("/hi20.png")).getImage();
		car1.setIcon(new ImageIcon(carimg1));
		car1.setBounds(119, 304, 150, 70);
		contentPane.add(car1);
		
		JButton loginlabel = new JButton("LOGIN");
		loginlabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_page login_page1 = new login_page();
				login_page1.setVisible(true);
				dispose();
			}
		});
		loginlabel.setBorder(null);
		loginlabel.setBackground(new Color(0, 0, 0));
		loginlabel.setForeground(new Color(255, 255, 255));
		loginlabel.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		loginlabel.setOpaque(false);
		loginlabel.setBounds(567, 26, 72, 26);
		contentPane.add(loginlabel);
		
		JLabel loginicon = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/whiteuser.png")).getImage();
		loginicon.setIcon(new ImageIcon(img1));
		//loginicon.setOpaque(true);
		loginicon.setBounds(547, 23, 22, 26);
		contentPane.add(loginicon);
		
		JButton homelabel = new JButton("HOME");
		homelabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainpage mainpage1 = new mainpage();
				mainpage1.setVisible(true);
				dispose();
			}
		});
		homelabel.setBorder(null);
		homelabel.setBackground(new Color(0, 0, 0));
		homelabel.setForeground(new Color(255, 255, 255));
		homelabel.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		homelabel.setOpaque(false);
		homelabel.setBounds(318, 26, 72, 26);
		contentPane.add(homelabel);
		
		JLabel homeicon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		homeicon.setIcon(new ImageIcon(img));
		//homeicon.setOpaque(true);
		homeicon.setBounds(303, 26, 28, 26);
		contentPane.add(homeicon);
		
		JLabel name = new JLabel("ZULO");
		name.setForeground(new Color(255, 255, 255));
		name.setFont(new Font("Times New Roman", Font.BOLD, 25));
		name.setBounds(71, 24, 72, 26);
		contentPane.add(name);
		
		JLabel mainicon = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/wheel1.png")).getImage();
		mainicon.setIcon(new ImageIcon(img2));
		//mainicon.setOpaque(true);
		mainicon.setBounds(33, 24, 28, 26);
		contentPane.add(mainicon);
		
		JLabel header = new JLabel("");
		header.setOpaque(true);
		header.setBackground(new Color(0, 0, 0,225));
		header.setBounds(0, 0, 1034, 70);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("Drive The Car Of Your Dreams...");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(41, 111, 344, 37);
		contentPane.add(lblNewLabel);
		
		JLabel search = new JLabel("Search Results :  ");
		search.setFont(new Font("Times New Roman", Font.BOLD, 15));
		search.setBounds(41, 159, 121, 19);
		contentPane.add(search);
		
		typesearch = new JLabel("");
		typesearch.setForeground(new Color(0, 64, 128));
		typesearch.setFont(new Font("Times New Roman", Font.BOLD, 17));
		typesearch.setBackground(new Color(255, 255, 255));
		typesearch.setBounds(185, 159, 136, 19);
		contentPane.add(typesearch);
		
		JLabel to = new JLabel("To :");
		to.setFont(new Font("Times New Roman", Font.BOLD, 15));
		to.setBounds(693, 159, 37, 19);
		contentPane.add(to);
		
		fromsearch = new JLabel("");
		fromsearch.setForeground(new Color(0, 64, 128));
		fromsearch.setFont(new Font("Times New Roman", Font.BOLD, 17));
		fromsearch.setBackground(new Color(255, 255, 255));
		fromsearch.setBounds(547, 159, 100, 19);
		contentPane.add(fromsearch);
		
		JLabel from = new JLabel(" From :");
		from.setFont(new Font("Times New Roman", Font.BOLD, 15));
		from.setBounds(475, 161, 72, 14);
		contentPane.add(from);
		
		tosearch = new JLabel("");
		tosearch.setForeground(new Color(0, 64, 128));
		tosearch.setFont(new Font("Times New Roman", Font.BOLD, 17));
		tosearch.setBackground(new Color(255, 255, 255));
		tosearch.setBounds(731, 159, 100, 19);
		contentPane.add(tosearch);
		
		dayssearch = new JLabel("1");
		dayssearch.setFont(new Font("Times New Roman", Font.BOLD, 17));
		dayssearch.setForeground(new Color(0, 64, 128));
		dayssearch.setBackground(new Color(255, 255, 255));
		dayssearch.setBounds(357, 159, 20, 17);
		contentPane.add(dayssearch);
		
		JLabel days = new JLabel("Days");
		days.setFont(new Font("Times New Roman", Font.BOLD, 15));
		days.setBounds(385, 161, 46, 14);
		contentPane.add(days);
		
		JLabel card6 = new JLabel("");
		card6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(0, 128, 128), null));
		card6.setBackground(new Color(51, 102, 102,50));
		card6.setOpaque(true);
		card6.setBounds(713, 466, 250, 170);
		contentPane.add(card6);
		
		JLabel card5 = new JLabel("");
		card5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(255, 140, 0), null));
		card5.setBackground(new Color(255, 102, 0,50));
		card5.setOpaque(true);
		card5.setBounds(397, 466, 250, 170);
		contentPane.add(card5);
		
		JLabel card4 = new JLabel("");
		card4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(128, 0, 128), null));
		card4.setBackground(new Color(102, 0, 51,50));
		card4.setOpaque(true);
		card4.setBounds(71, 466, 250, 170);
		contentPane.add(card4);
		
		JLabel card2 = new JLabel("");
		card2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(128, 128, 128), new Color(0, 0, 0)));
		card2.setBackground(new Color(119,99,109,50));
		card2.setOpaque(true);
		card2.setBounds(395, 264, 250, 170);
		contentPane.add(card2);
		
		JLabel card3 = new JLabel("");
		card3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(165, 42, 42), null));
		card3.setBackground(new Color(165, 42, 42,50));
		card3.setOpaque(true);
		card3.setBounds(713, 264, 250, 170);
		contentPane.add(card3);
		
		JLabel card1 = new JLabel("");
		card1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, new Color(154, 205, 50), null));
		card1.setBackground(new Color(204, 204, 51,50));
		card1.setOpaque(true);
		card1.setBounds(71, 264, 250, 170);
		contentPane.add(card1);
		
		JLabel lblNewLabel_1 = new JLabel("Popular cars");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(57, 217, 121, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel fireicon = new JLabel("");
		Image fireimg = new ImageIcon(this.getClass().getResource("/fireicon.png")).getImage();
		fireicon.setIcon(new ImageIcon(fireimg));
		fireicon.setBackground(new Color(255, 255, 255));
		fireicon.setBounds(19, 217, 28, 26);
		contentPane.add(fireicon);
		
		
	}
}
