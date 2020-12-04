import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Deneme {

	private JFrame frmSuggestion;

	
	Image ct1_btn = new ImageIcon(this.getClass().getResource("/button1.png")).getImage();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme window = new Deneme();
					window.frmSuggestion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public int btn_clckd = 0;
	public static int pt = 0;
	/**
	 * Create the application.
	 */
	public Deneme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuggestion = new JFrame();
		frmSuggestion.setTitle("Suggestion");
		frmSuggestion.setBounds(100, 100, 700, 475);
		frmSuggestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSuggestion.getContentPane().setLayout(null);
		
		JLabel bslk = new JLabel("Soru");
		bslk.setFont(new Font("Microsoft Tai Le", Font.BOLD, 14));
		bslk.setBounds(10, 10, 59, 24);
		frmSuggestion.getContentPane().add(bslk);
		
		Question quest = new Question();
		
		JLabel qstn = new JLabel(quest.snd_qstn(btn_clckd));
		qstn.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		qstn.setBounds(20, 44, 543, 34);
		frmSuggestion.getContentPane().add(qstn);
				
		JRadioButton ans_a = new JRadioButton(quest.snd_ans_a(btn_clckd));
		ans_a.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		ans_a.setBounds(20, 92, 119, 33);
		frmSuggestion.getContentPane().add(ans_a);
		
		JRadioButton ans_b = new JRadioButton(quest.snd_ans_b(btn_clckd));
		ans_b.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		ans_b.setBounds(20, 136, 119, 34);
		frmSuggestion.getContentPane().add(ans_b);
		
		JRadioButton ans_c = new JRadioButton(quest.snd_ans_c(btn_clckd));
		ans_c.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		ans_c.setBounds(20, 192, 119, 33);
		frmSuggestion.getContentPane().add(ans_c);
		
		JRadioButton ans_d = new JRadioButton(quest.snd_ans_d(btn_clckd));
		ans_d.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		ans_d.setBounds(20, 244, 119, 33);
		frmSuggestion.getContentPane().add(ans_d);
		
		
		
		JLabel GecButon = new JLabel("");
		GecButon.setOpaque(true);
		GecButon.setIcon(new ImageIcon(ct1_btn));
		GecButon.setBounds(276, 307, 105, 39);
		frmSuggestion.getContentPane().add(GecButon);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(ans_d);
		bg.add(ans_c);
		bg.add(ans_b);
		bg.add(ans_a);
	   
		GecButon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 if(ans_a.isSelected()) {
					pt+=10;
				}else if(ans_b.isSelected()) {
					pt+=20;
				}else if(ans_c.isSelected()) {
					pt+=30;
				}else if(ans_d.isSelected()) {
					pt+=40;
				}else {
					pt+=0;
					System.out.println("Cevaplanmadi");
				}
				 System.out.println(""+pt);
				btn_clckd++;
				if(btn_clckd == 5) {
					Deneme2 nw = new Deneme2();
					nw.New_page();
					return;
					
				}
				bg.clearSelection();
				qstn.setText(quest.snd_qstn(btn_clckd));
				ans_a.setText(quest.snd_ans_a(btn_clckd));
				ans_b.setText(quest.snd_ans_b(btn_clckd));
				ans_c.setText(quest.snd_ans_c(btn_clckd));
				ans_d.setText(quest.snd_ans_d(btn_clckd));
			}
		});
	}
}
