import java.awt.EventQueue;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;


public class Deneme2 {

	private JFrame frame;
	
	Image arkadaþlýk = new ImageIcon(this.getClass().getResource("/arkadaþlýk.gif")).getImage();
	Image balýk = new ImageIcon(this.getClass().getResource("/balýk.gif")).getImage();
	Image dans = new ImageIcon(this.getClass().getResource("/dans.gif")).getImage();
	Image futbol = new ImageIcon(this.getClass().getResource("/football.gif")).getImage();
	Image kahve = new ImageIcon(this.getClass().getResource("/kahve.gif")).getImage();
	Image kayak = new ImageIcon(this.getClass().getResource("/kayak.gif")).getImage();
	Image kitap = new ImageIcon(this.getClass().getResource("/kitap oku.gif")).getImage();
	Image lp = new ImageIcon(this.getClass().getResource("/lp.gif")).getImage();
	Image mangal = new ImageIcon(this.getClass().getResource("/mangal.gif")).getImage();
	Image masa_tenisi = new ImageIcon(this.getClass().getResource("/masa tenisi.gif")).getImage();
	Image pc = new ImageIcon(this.getClass().getResource("/pc.gif")).getImage();
	Image satranc = new ImageIcon(this.getClass().getResource("/satranç.gif")).getImage();
	Image sinema = new ImageIcon(this.getClass().getResource("/sinema.gif")).getImage();
	Image sarki = new ImageIcon(this.getClass().getResource("/þarký dinleme.gif")).getImage();
	Image tv = new ImageIcon(this.getClass().getResource("/TV.gif")).getImage();
	Image ucurtma = new ImageIcon(this.getClass().getResource("/uçurtma.gif")).getImage();
	Image voleybol = new ImageIcon(this.getClass().getResource("/voleybol.gif")).getImage();
	Image yemek = new ImageIcon(this.getClass().getResource("/yemek.gif")).getImage();
	Image yuruyus = new ImageIcon(this.getClass().getResource("/yürüyüþ.gif")).getImage();
	Image yuzme = new ImageIcon(this.getClass().getResource("/yüzme.gif")).getImage();
	/**
	 * Launch the application.
	 */
	public static void New_page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme2 window = new Deneme2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Deneme2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Öneri");
		frame.setBounds(100, 100, 746, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel rslt1 = new JLabel("");
		rslt1.setIcon(new ImageIcon(kayak));
		rslt1.setHorizontalAlignment(SwingConstants.CENTER);
		rslt1.setBounds(10, 10, 400, 568);
		frame.getContentPane().add(rslt1);
		
		JLabel uyg_dsc = new JLabel("");
		uyg_dsc.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		uyg_dsc.setHorizontalAlignment(SwingConstants.CENTER);
		uyg_dsc.setBounds(432, 10, 290, 568);
		frame.getContentPane().add(uyg_dsc);
		
		if(Deneme.pt <=50 && Deneme.pt >= 0) {
			Random rnd = new Random();
			int i = rnd.nextInt(4);
			if(i==0) {
			rslt1.setIcon(new ImageIcon(kitap));
			uyg_dsc.setText("Kitap okuma sana iyi gelebilir.");
			}
			if(i==1) {
			rslt1.setIcon(new ImageIcon(yuruyus));
			uyg_dsc.setText("Yuruyus yapmak sana iyi gelebilir.");
			}
			if(i==2) {
			rslt1.setIcon(new ImageIcon(ucurtma));
			uyg_dsc.setText("Disari cikip ucurtma ucurabilirsin.");
			}
			if(i==3) {
			rslt1.setIcon(new ImageIcon(balýk));
			uyg_dsc.setText(" Balik tutalim. Rasgele.");
			}
			if(i==4) {
			rslt1.setIcon(new ImageIcon(kayak));
			uyg_dsc.setText("Hava uygunsa kayak yapma zamani.");
			}
		}else if(Deneme.pt <=100 && Deneme.pt >= 51) {
			Random rnd = new Random();
			int i = rnd.nextInt(4);
			if(i==0) {
			rslt1.setIcon(new ImageIcon(mangal));
			uyg_dsc.setText("Hava uygunsa mangala gidelim.");
			}
			if(i==1) {
			rslt1.setIcon(new ImageIcon(arkadaþlýk));
			uyg_dsc.setText("Arkadaslarinla disari cikmak güzel bir fikir.");
			}
			if(i==2) {
			rslt1.setIcon(new ImageIcon(futbol));
			uyg_dsc.setText("Hadi futbol oynayalim.");
			}
			if(i==3) {
			rslt1.setIcon(new ImageIcon(voleybol));
			uyg_dsc.setText("Voleybol oynamaya ne dersin?");
			}
			if(i==4) {
			rslt1.setIcon(new ImageIcon(lp));
			uyg_dsc.setText("Hava uygunsa lunaparka giderek tadini cikaralim.");
			}
		}else if(Deneme.pt <=150 && Deneme.pt >=101) {
			Random rnd = new Random();
			int i = rnd.nextInt(4);
			if(i==0) {
			rslt1.setIcon(new ImageIcon(sarki));
			uyg_dsc.setText("Moduna gore guzel sarkilar dinleyelim.");
			}
			if(i==1) {
			rslt1.setIcon(new ImageIcon(kahve));
			uyg_dsc.setText("Bir kahve al ve tadini cikar.");
			}
			if(i==2) {
			rslt1.setIcon(new ImageIcon(yemek));
			uyg_dsc.setText("Yemek yapip biraz kafa dagitalim.");
			}
			if(i==3) {
			rslt1.setIcon(new ImageIcon(tv));
			uyg_dsc.setText("Televizyon izleyelim, zaman gecmis olur.");
			}
			if(i==4) {
			rslt1.setIcon(new ImageIcon(pc));
			uyg_dsc.setText("Hadi biraz bilgisayarda takilalim.");
			}
		}else if(Deneme.pt <=200 && Deneme.pt >= 151) {
			Random rnd = new Random();
			int i = rnd.nextInt(4);
			if(i==0) {
			rslt1.setIcon(new ImageIcon(sinema));
			uyg_dsc.setText("Yeni cikan filmlere baktin mi?");
			}
			if(i==1) {
			rslt1.setIcon(new ImageIcon(dans));
				uyg_dsc.setText("Dans ederek enerjimizi atalim.");
			}
			if(i==2) {
			rslt1.setIcon(new ImageIcon(ucurtma));
			uyg_dsc.setText("Hava guzel ise ucurtma ucuralim.");
			}
			if(i==3) {
			rslt1.setIcon(new ImageIcon(yuruyus));
			uyg_dsc.setText("Biraz yuruyus yapip planlarini gozden gecir.");
			}
			if(i==4) {
			rslt1.setIcon(new ImageIcon(kitap));
			uyg_dsc.setText("Sakince kitap okumaya ne dersin ?");
			}
		} 
	}
}
