package pseudoinverse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class MatrisGir extends JFrame {

	private JPanel contentPane;
	public static HataEkrani hata;
	public JTextField [][]matrisDegerleri;
	private JTextField textField;
	public static Hata tmp33;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrisGir frame = new MatrisGir(0,0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MatrisGir(int satir,int sutun) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		matrisDegerleri = new  JTextField[satir][sutun];
		
		for (int i = 0; i < matrisDegerleri.length; i++) {
			for (int j = 0; j < matrisDegerleri[0].length; j++) {
				matrisDegerleri[i][j] = new JTextField();
				SecimEkrani.toplamSayisi++;
			}
			SecimEkrani.toplamSayisi++;
		}
		//setBounds(100, 100, 500, 400);
		for (int i = 0; i < matrisDegerleri.length; i++) {
			for (int j = 0; j < matrisDegerleri[0].length; j++) {
				matrisDegerleri[i][j].setBounds(10+(100+4)*j, 10+(60+4)*i, 70,22);
				SecimEkrani.toplamSayisi+=5;
				SecimEkrani.carpmaSayisi+=2;
				contentPane.add(matrisDegerleri[i][j]);
			}
			SecimEkrani.toplamSayisi++;
		}
		JButton btnDevam = new JButton("Devam");
		btnDevam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
					boolean flag = true;
					boolean bayrak =true;
				
					double [][] matris = new double[satir][sutun];
					
					for (int i = 0; i < matrisDegerleri.length; i++) {
						for (int j = 0; j < matrisDegerleri[0].length; j++) {
							if(Pattern.compile("[A-Za-z]").matcher(matrisDegerleri[i][j].getText()).find() || matrisDegerleri[i][j].getText().equals("")) {
			                    bayrak=false;
			                }
						}
					}
					
					if(bayrak == true) {
						for (int i = 0; i < matrisDegerleri.length; i++) {
							for (int j = 0; j < matrisDegerleri[0].length; j++) {
								
								matris[i][j] = Double.valueOf(matrisDegerleri[i][j].getText().toString());
								matris[i][j]*=10;
								matris[i][j]=Math.round(matris[i][j]);
								matris[i][j]/=10;
								SecimEkrani.toplamSayisi++;
								SecimEkrani.carpmaSayisi+=2;
							}
							SecimEkrani.toplamSayisi++;
						}
					
						if(matris.length<matris[0].length) 
							if(SecimEkrani.determinant(SecimEkrani.matrisCarpimi(matris,SecimEkrani.transpoze(matris)))==0) 
								flag = false;
						else if(matris.length<matris[0].length)
							if(SecimEkrani.determinant(SecimEkrani.matrisCarpimi(SecimEkrani.transpoze(matris),matris))==0) 
								flag=false;
						
						if(flag==true) {
							
							SecimEkrani.islemSayfasiFrame = new IslemSayfasi(matris);
							SecimEkrani.islemSayfasiFrame.setVisible(true);
							SecimEkrani.matrisGirFrame.dispose();
						}
						else {
							hata = new HataEkrani();
							hata.show();
						}
					
					
					}
					else {
						tmp33 = new Hata();
						tmp33.show();
					}

			}
		});
		btnDevam.setBounds(434, 315, 97, 25);
		contentPane.add(btnDevam);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SecimEkrani.matrisGirFrame.dispose();
				SecimEkrani.frame.setVisible(true);
			}
		});
		btnBack.setBounds(325, 315, 97, 25);
		contentPane.add(btnBack);
		
		
		
		
		
		
	}
}
