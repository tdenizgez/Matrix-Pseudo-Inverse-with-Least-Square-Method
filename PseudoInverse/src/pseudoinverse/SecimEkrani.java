package pseudoinverse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class SecimEkrani extends JFrame {

	private JPanel contentPane;
	public static MatrisGir matrisGirFrame;
	public static SecimEkrani  frame;
	public static IslemSayfasi islemSayfasiFrame;
	public static HataKare hataKare;
	
	public static int toplamSayisi=0;
	public static int carpmaSayisi=0;
	
	private int satir;
	private int sutun;
	protected double matris[][];
	
	public double[][] getMatris() {
		return this.matris;
	}
	public void setMatris(int i,int j,double deger) {
		this.matris[i][j]=deger;
	}
	
	public int getSatir() {
		return this.satir;
	}
	public void setSatir(int satir) {
		this.satir=satir;
	}
	public int getSutun() {
		return this.sutun;
	}
	public void setSutun(int sutun) {
		this.sutun=sutun;
	}
	public static double[][] matrisCarpimi(double [][]matris,double matris2[][]){
			
			double [][] carpim = new double[matris.length][matris2[0].length];
			double sonuc;
			for (int i = 0; i < matris.length; i++) {
				for (int k = 0; k < matris2[0].length; k++) {
					sonuc = 0;
					for (int j = 0; j < matris2.length; j++) {
						
						sonuc += matris[i][j]*matris2[j][k];
						SecimEkrani.carpmaSayisi+=1;
						SecimEkrani.toplamSayisi+=2;
						
					}
					SecimEkrani.toplamSayisi++;
					carpim[i][k] = sonuc;
				}
				SecimEkrani.toplamSayisi++;
			}
			
			
			return carpim;
		}
	
	public static double [][] transpoze(double [][]matris) {
		
		double [][]transpoze = new double[matris[0].length][matris.length];
		
		for (int i = 0; i < transpoze.length; i++) {
			for (int j = 0; j < transpoze[0].length; j++) {
				transpoze[i][j] = matris[j][i];
			}
		}
		return transpoze;
	}
	
	public static double determinant(double [][]matris) {
		
		double sonuc=0;
		if(matris.length == 1) {
			sonuc = matris[0][0];
			return sonuc;
		}
		else if(matris.length == 2) {
			sonuc = matris[0][0]*matris[1][1] - matris[0][1]*matris[1][0];
			SecimEkrani.carpmaSayisi+=2;
			SecimEkrani.toplamSayisi+=1;
			return sonuc;
		}

			for (int i = 0; i < matris[0].length; i++) {
				double [][]tmp = new double[matris.length-1][matris[0].length-1];
				
				for (int j = 1; j < matris.length; j++) {
					for (int k = 0; k < matris[0].length; k++) {
						if(k<i) {
							tmp[j-1][k]=matris[j][k];
						}
						else if(k>i) {
							tmp[j-1][k-1]=matris[j][k];
						}
						SecimEkrani.toplamSayisi++;
					}
					SecimEkrani.toplamSayisi++;
				}
				sonuc += matris[0][i] * Math.pow(-1, i) * determinant(tmp);
				SecimEkrani.carpmaSayisi+=2;
				SecimEkrani.toplamSayisi+=2;
			}
			return sonuc;
	}

	public static double[][] invMatris(double [][]matris) {
		
		if(matris.length==1) {
			double [][]m = new double[1][1];
			m[0][0] = 1/SecimEkrani.determinant(matris);
			m[0][0]*=10000;
			m[0][0] = Math.round(m[0][0]);
			m[0][0]/=10000;
			SecimEkrani.carpmaSayisi+=3;
			return m;
		}
		
		else {
		double [][]matristmp = new double[matris.length-1][matris.length-1];
		double [][]ekMatris = new double[matris.length][matris.length];
		int iTmp=0;
		int jTmp=0;
		for (int k = 0; k < matris.length; k++) {
			for (int l = 0; l < matris.length; l++) {
				for (int i = 0; i < matris.length; i++) {
					for (int j = 0; j < matris.length; j++) {
						if(i!=k && j!=l) {
							matristmp[iTmp][jTmp] = matris[i][j];
							jTmp++;
							SecimEkrani.toplamSayisi++;
							if(jTmp==matristmp.length) {
								jTmp=0;
								iTmp++;
								SecimEkrani.toplamSayisi++;
							}
						}
						SecimEkrani.toplamSayisi++;
					}
					SecimEkrani.toplamSayisi++;
				}
				ekMatris[k][l] = SecimEkrani.determinant(matristmp)*Math.pow(-1,k+l);
				SecimEkrani.carpmaSayisi+=1;
				iTmp=0;
				SecimEkrani.toplamSayisi++;
			}
			SecimEkrani.toplamSayisi++;
		}
		
		
		ekMatris = SecimEkrani.transpoze(ekMatris);
		
		double det = determinant(matris);
		
		for (int i = 0; i < ekMatris.length; i++) {
			for (int j = 0; j < ekMatris.length; j++) {
				ekMatris[i][j] /=det;
				SecimEkrani.carpmaSayisi+=1;
				SecimEkrani.toplamSayisi++;
			}
			SecimEkrani.toplamSayisi++;
		}
		return ekMatris;
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new SecimEkrani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	  
	public SecimEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSatir = new JLabel("Satir Sayisini Seciniz:");
		lblSatir.setBounds(22, 13, 142, 34);
		contentPane.add(lblSatir);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(157, 19, 90, 22);
		contentPane.add(comboBox);
		
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		
		
		JLabel lblSutun = new JLabel("Sutun Sayisini Seciniz:");
		lblSutun.setBounds(22, 60, 142, 28);
		contentPane.add(lblSutun);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(157, 63, 90, 22);
		contentPane.add(comboBox_1);
		
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		
		JLabel lblYntem = new JLabel("Olu\u015Fturulma Y\u00F6ntemini");
		lblYntem.setBounds(22, 101, 131, 42);
		contentPane.add(lblYntem);
		
		JLabel lblSeiniz = new JLabel("Se\u00E7iniz");
		lblSeiniz.setBounds(63, 136, 56, 16);
		contentPane.add(lblSeiniz);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(157, 111, 90, 22);
		contentPane.add(comboBox_2);
		
		comboBox_2.addItem("Otomatik");
		comboBox_2.addItem("Manuel");
		
		JButton btnDevam = new JButton("Devam");
		btnDevam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex() == comboBox_1.getSelectedIndex()) {
					hataKare = new HataKare();
					hataKare.show(); 
				}
				else {
					if(comboBox_2.getSelectedIndex()==0) {
						
						double det = 0;
						//OTOMATÝK OLUSTURMA
						
						while(det == 0) {
							Random r = new Random();
							Random r1 = new Random();
							
							int satir =r.nextInt(5);
							int sutun=r1.nextInt(5);
							while(satir==sutun || satir<=0 || sutun<=0 || satir>5 || sutun>5) {
								 satir =r.nextInt(5);
								 sutun=r1.nextInt(5);
							}
							
							matris = new double[satir][sutun];
						
						for (int i = 0; i < matris.length; i++) {
							for (int j = 0; j < matris[0].length; j++) {
								
								double deger = Math.random()*10;
								deger=deger*10;
								deger = Math.floor(deger);
								deger = deger/10;
								matris[i][j] = deger;
//								setMatris(i, j,deger);
								SecimEkrani.toplamSayisi++;
							}
							SecimEkrani.toplamSayisi++;
						}
						
						if(matris.length<matris[0].length) 
							det = determinant(matrisCarpimi(matris,transpoze(matris)));
						else if(matris.length>matris[0].length)
							det = determinant(matrisCarpimi(transpoze(matris),matris));

						}
						
						islemSayfasiFrame = new IslemSayfasi(matris);
						islemSayfasiFrame.setVisible(true);
						frame.setVisible(false);
					}
					else {

						setSatir(comboBox.getSelectedIndex()+1);
						setSutun(comboBox_1.getSelectedIndex()+1);
						SecimEkrani.toplamSayisi+=3;
						matrisGirFrame = new MatrisGir(getSatir(),getSutun());
						matrisGirFrame.setVisible(true);
						frame.setVisible(false);
					}
				}
				
			}
		});
		btnDevam.setBounds(99, 174, 97, 25);
		contentPane.add(btnDevam);
	}
}
