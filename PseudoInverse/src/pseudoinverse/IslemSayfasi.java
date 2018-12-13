package pseudoinverse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class IslemSayfasi extends JFrame {

	
	private JPanel contentPane;
	public int k=0,l=0,satir=0,sutun=0,tmpi=0,tmpj=0,tersi=0,tersj=0,k1=0,l1=0,satir1=0,sutun1=0;
	public JLabel lblTopsayi;
	public JLabel lblCarpsayi;
	public int btnSayac=0,btnSayac1=0,btnSayac2=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IslemSayfasi frame = new IslemSayfasi(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	
	
	public IslemSayfasi(double[][] matris) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnToplamSayisi = new JButton("Toplam Sayisi");
		btnToplamSayisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTopsayi.setText(Integer.toString(SecimEkrani.toplamSayisi));
				lblCarpsayi.setText(Integer.toString(SecimEkrani.carpmaSayisi));
			}
		});
		btnToplamSayisi.setBounds(1594, 897, 148, 25);
		contentPane.add(btnToplamSayisi);
		
		JLabel lblToplamaIslemiSayisi = new JLabel("Toplama Islemi Sayisi:");
		lblToplamaIslemiSayisi.setBounds(1466, 808, 148, 16);
		contentPane.add(lblToplamaIslemiSayisi);
		
		lblTopsayi = new JLabel("");
		lblTopsayi.setBounds(1626, 808, 82, 16);
		contentPane.add(lblTopsayi);
		
		JLabel lblarpmaIslemiSayisi = new JLabel("\u00C7arpma Islemi Sayisi");
		lblarpmaIslemiSayisi.setBounds(1466, 837, 125, 16);
		contentPane.add(lblarpmaIslemiSayisi);
		
		lblCarpsayi = new JLabel("");
		lblCarpsayi.setBounds(1626, 837, 56, 16);
		contentPane.add(lblCarpsayi);
		
		JLabel lblMn = new JLabel("M>N");
		lblMn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMn.setBounds(1466, 636, 76, 44);
		contentPane.add(lblMn);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblA.setBounds(1466, 683, 35, 16);
		contentPane.add(lblA);
		
		JLabel label = new JLabel("+");
		label.setBounds(1476, 672, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("=");
		label_1.setBounds(1486, 683, 56, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("A");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(1507, 683, 35, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("(");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_3.setBounds(1496, 677, 56, 27);
		contentPane.add(label_3);
		
		JLabel lblT = new JLabel("T");
		lblT.setBounds(1516, 672, 56, 16);
		contentPane.add(lblT);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(1526, 686, 56, 16);
		contentPane.add(lblX);
		
		JLabel label_4 = new JLabel("A");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(1537, 683, 35, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(")");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_5.setBounds(1554, 677, 56, 27);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("A");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBounds(1579, 683, 35, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("X");
		label_7.setBounds(1564, 686, 56, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("T");
		label_8.setBounds(1591, 672, 56, 16);
		contentPane.add(label_8);
		
		JLabel lblM = new JLabel("M<N");
		lblM.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblM.setBounds(1466, 707, 76, 44);
		contentPane.add(lblM);
		
		JLabel label_9 = new JLabel("A");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_9.setBounds(1466, 757, 35, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("+");
		label_10.setBounds(1476, 746, 56, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("=");
		label_11.setBounds(1486, 760, 56, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("A");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_12.setBounds(1548, 755, 35, 16);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("(");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_13.setBounds(1537, 749, 56, 27);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("T");
		label_14.setBounds(1584, 744, 56, 16);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("X");
		label_15.setBounds(1567, 758, 56, 16);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("A");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_16.setBounds(1578, 755, 35, 16);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel(")");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_17.setBounds(1595, 749, 56, 27);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("A");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_18.setBounds(1507, 757, 35, 16);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("X");
		label_19.setBounds(1526, 760, 56, 16);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("T");
		label_20.setBounds(1519, 746, 56, 16);
		contentPane.add(label_20);
		
		double [][]transpoze = SecimEkrani.transpoze(matris);
		int x=0;
		int y=0;
	
		//#############################################################################
		if(matris.length>matris[0].length) {
			
			JLabel [][] matris1=new JLabel[matris.length][matris[0].length];
			JLabel [][] matrisTranspoze=new JLabel[transpoze.length][transpoze[0].length];
			JLabel [][] sonuc=new JLabel[matrisTranspoze.length][matris[0].length];

			for (int i = 0; i < matrisTranspoze.length; i++) {
				for (int j = 0; j < matrisTranspoze[0].length; j++) {
					matrisTranspoze[i][j] = new JLabel();
					matrisTranspoze[i][j].setBounds(x, y, 55, 55);
					matrisTranspoze[i][j].setText(Double.toString(transpoze[i][j]));
					contentPane.add(matrisTranspoze[i][j]);
					x = x+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x=0;
				y+=55;
				SecimEkrani.toplamSayisi+=2;
			}
			
			JLabel solCarpanLb=new JLabel("A Matrisinin Transpozu");
			solCarpanLb.setBounds(x,y,150,100);
			contentPane.add(solCarpanLb);
			
			x = matrisTranspoze[0].length*55+55;
			SecimEkrani.toplamSayisi++;
			SecimEkrani.carpmaSayisi++;
			y = 0;
			for (int i = 0; i < matris1.length; i++) {
				for (int j = 0; j < matris1[0].length; j++) {
					matris1[i][j] = new JLabel();
					matris1[i][j].setBounds(x, y, 55, 55);
					matris1[i][j].setText(Double.toString(matris[i][j]));
					contentPane.add(matris1[i][j]);
					x +=55;
					SecimEkrani.toplamSayisi+=2;
				}
				x = matrisTranspoze[0].length*55+55;
				y += 55;
				SecimEkrani.toplamSayisi+=3;
				SecimEkrani.carpmaSayisi+=1;
			}

			JLabel sagCarpanLb=new JLabel("A Matrisi");
			sagCarpanLb.setBounds(x,y,100,100);
			contentPane.add(sagCarpanLb);
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55;
			y = 0;
			SecimEkrani.carpmaSayisi+=2;
			SecimEkrani.toplamSayisi+=3;
			
			for (int i = 0; i < sonuc.length; i++) {
				for (int j = 0; j < sonuc[0].length; j++) {
					sonuc[i][j] = new JLabel();
					sonuc[i][j].setBounds(x, y, 55, 55);
					contentPane.add(sonuc[i][j]);
					x = x+60;
					SecimEkrani.toplamSayisi+=2;
				}
				x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55;
				y+=55;
				SecimEkrani.toplamSayisi+=5;
				SecimEkrani.carpmaSayisi+=2;
			}
			
			
			double [][] carpimSonucu = SecimEkrani.matrisCarpimi(transpoze, matris);
			
			
			JButton btnNewButton = new JButton("Devam");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					for (int i = 0; i < matrisTranspoze.length; i++) {//Sol Matrisin icindekileri yesil yapÄ±yor her seferinde	
						for (int j = 0; j < matrisTranspoze[0].length; j++) {
							matrisTranspoze[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < matris1.length; i++) {// Sag matrisin icindekileri yesil yapÄ±yor her seferinde
						for (int j = 0; j < matris1[0].length; j++) {
							matris1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					if(k>=matrisTranspoze.length) {
						k=0;
						l++;
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < matrisTranspoze[0].length; i++) {
						matrisTranspoze[l][i].setForeground(Color.BLACK);
						matris1[i][k].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					if(sutun == sonuc[0].length) {
						sutun=0;
						satir++;
						SecimEkrani.toplamSayisi++;
					}
					sonuc[satir][sutun].setForeground(Color.BLUE);
					sonuc[satir][sutun].setText(Double.toString( carpimSonucu[satir][sutun]));
					
					sutun++;
					k++;	
					
					btnSayac++;

					SecimEkrani.toplamSayisi+=3;
					if(btnSayac == sonuc.length*sonuc[0].length) {
						btnNewButton.setEnabled(false);
						SecimEkrani.carpmaSayisi++;
					}
				}
			});
			btnNewButton.setBounds(x,y+70,80,20);
			contentPane.add(btnNewButton);
			
//############################## içteki çarpým bitti ################################################
			
			JLabel [][] sonuc1=new JLabel[matrisTranspoze.length][matris[0].length];
			JLabel [][] tersMatris=new JLabel[sonuc1[0].length][sonuc1.length];
			double [][] tersSonuc = SecimEkrani.invMatris(carpimSonucu);
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi+=4;
			SecimEkrani.carpmaSayisi+=3;
			
			for (int i = 0; i < sonuc1.length; i++) {
				for (int j = 0; j < sonuc[0].length; j++) {
					sonuc1[i][j] = new JLabel();
					sonuc1[i][j].setBounds(x, y, 55, 55);
					sonuc1[i][j].setText(Double.toString(carpimSonucu[i][j]));
					contentPane.add(sonuc1[i][j]);
					x += 55;
					SecimEkrani.toplamSayisi+=2;
				}
				x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55;
				y+=55;
				SecimEkrani.toplamSayisi+=7;
				SecimEkrani.carpmaSayisi+=3;
			}

			JLabel lblAtxA = new JLabel("At x A");
			lblAtxA.setBounds(x+50, y, 142, 34);
			contentPane.add(lblAtxA);
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi+=6;
			SecimEkrani.carpmaSayisi+=3;
			
			JLabel lblDeterminant = new JLabel("* 1/"+SecimEkrani.determinant(carpimSonucu));
			lblDeterminant.setBounds(x-10, y+120, 142, 34);
			contentPane.add(lblDeterminant);
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55+75;
			y=0;
			
			SecimEkrani.toplamSayisi+=7;
			SecimEkrani.carpmaSayisi+=3;
			
			for (int i = 0; i < tersMatris.length; i++) {
				for (int j = 0; j < tersMatris[0].length; j++) {
					tersMatris[i][j] = new JLabel();
					tersMatris[i][j].setBounds(x, y, 55, 55);
					contentPane.add(tersMatris[i][j]);
					x+=55;
					SecimEkrani.toplamSayisi+=2;
				}
				x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55+75;
				y+=55;
				SecimEkrani.toplamSayisi+=9;
				SecimEkrani.carpmaSayisi+=3;
			}
			
			JLabel lblTers = new JLabel("(At x A)^-1");
			lblTers.setBounds(x+50, y, 142, 34);
			contentPane.add(lblTers);
			SecimEkrani.toplamSayisi++;
			
			JButton btnNewButton1 = new JButton("Devam");
			btnNewButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					for (int i = 0; i <carpimSonucu.length; i++) {
						for (int j = 0; j < carpimSonucu[0].length; j++) {
							sonuc1[i][j].setForeground(Color.BLACK);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					if(tmpj== tersMatris.length) {
						tmpj=0;
						tmpi++;
						SecimEkrani.toplamSayisi++;
					}
					
					for (int j = 0; j < tersMatris.length; j++) {
						sonuc1[tmpi][j].setForeground(Color.RED);
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < tersMatris.length; i++) {
						sonuc1[i][tmpj].setForeground(Color.RED);
						SecimEkrani.toplamSayisi++;
					}
					tmpj++;
					SecimEkrani.toplamSayisi++;
					
					if(tersj==tersMatris.length) {
						tersj=0;
						tersi++;
						SecimEkrani.toplamSayisi++;
					}
					tersMatris[tersi][tersj].setForeground(Color.BLUE);
					tersMatris[tersi][tersj].setText(Double.toString(tersSonuc[tersi][tersj]));
					tersj++;
					SecimEkrani.toplamSayisi++;
					
					btnSayac1++;
					SecimEkrani.toplamSayisi++;
					if(btnSayac1 == tersMatris.length*tersMatris[0].length) {
						btnNewButton1.setEnabled(false);
						SecimEkrani.carpmaSayisi++;
					}

				}
			});
			btnNewButton1.setBounds(x,y+70,80,20);
			contentPane.add(btnNewButton1);
			
//############################### TERSÝNÝ ALMA BÝTTÝ ##########################################
			
			JLabel [][] matrisTranspoze1=new JLabel[transpoze.length][transpoze[0].length];
			JLabel [][] tersMatris1=new JLabel[sonuc1[0].length][sonuc1.length];
			
			double [][] pinv = SecimEkrani.matrisCarpimi(tersSonuc, transpoze);
			for (int i = 0; i < pinv.length; i++) {
				for (int j = 0; j < pinv[0].length; j++) {
					pinv[i][j]*=100000;
					pinv[i][j]=Math.round(pinv[i][j]);
					pinv[i][j]/=100000;
					SecimEkrani.toplamSayisi++;
					SecimEkrani.carpmaSayisi+=2;
				}
				SecimEkrani.toplamSayisi++;
			}
			JLabel [][] sonuc2 = new JLabel[pinv.length][pinv[0].length];
			
			int x1 = 0;
			int y1 = y+400;
			SecimEkrani.toplamSayisi++;
			for (int i = 0; i < tersMatris1.length; i++) {
				for (int j = 0; j < tersMatris1[0].length; j++) {
					tersMatris1[i][j] = new JLabel();
					tersMatris1[i][j].setBounds(x1, y1, 55, 55);
					tersMatris1[i][j].setText(Double.toString(tersSonuc[i][j]));
					contentPane.add(tersMatris1[i][j]);
					x1+=55;
					SecimEkrani.toplamSayisi+=2;
				}
				x1 = 0;
				y1+=55;
				SecimEkrani.toplamSayisi+=2;
			}
			
			JLabel lblTers1 = new JLabel("(At x A)^-1");
			lblTers1.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblTers1);
			SecimEkrani.toplamSayisi++;
			
			x1 =  tersMatris1[0].length*55 + 55;
			y1 = y+400;
			SecimEkrani.toplamSayisi+=2;
			SecimEkrani.carpmaSayisi++;
			
			for (int i = 0; i < matrisTranspoze1.length; i++) {
				for (int j = 0; j < matrisTranspoze1[0].length; j++) {
					matrisTranspoze1[i][j] = new JLabel();
					matrisTranspoze1[i][j].setBounds(x1, y1, 55, 55);
					matrisTranspoze1[i][j].setText(Double.toString(transpoze[i][j]));
					contentPane.add(matrisTranspoze1[i][j]);
					x1+=55;
					SecimEkrani.toplamSayisi+=2;
					
				}
				x1 = tersMatris1[0].length*55 + 55;
				y1+=55;
				SecimEkrani.toplamSayisi+=3;
				SecimEkrani.carpmaSayisi++;
			}
			
			JLabel lblTranspoz = new JLabel("A'nýn transpozu");
			lblTranspoz.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblTranspoz);
			
			SecimEkrani.toplamSayisi++;
			
			x1 = tersMatris1[0].length*55 + 55 + matrisTranspoze1[0].length*55 +55;
			y1 =y+400;
			SecimEkrani.toplamSayisi+=4;
			SecimEkrani.carpmaSayisi+=2;
			
			for (int i = 0; i < sonuc2.length; i++) {
				for (int j = 0; j < sonuc2[0].length; j++) {
					sonuc2[i][j] = new JLabel();
					sonuc2[i][j].setBounds(x1, y1, 55, 55);
					contentPane.add(sonuc2[i][j]);
					x1 = x1+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x1 = tersMatris1[0].length*55 + 55 + matrisTranspoze1[0].length*55 +55;
				y1 = y1+55;
				SecimEkrani.toplamSayisi+=5;
				SecimEkrani.carpmaSayisi+=2;
			}
			
			JLabel lblPinv = new JLabel("PINV");
			lblPinv.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblPinv);
			SecimEkrani.toplamSayisi+=2;
			
			JButton btnNewButton2 = new JButton("Devam");
			btnNewButton2.addActionListener(new ActionListener() {
		        
				public void actionPerformed(ActionEvent arg0) {
					
					
					for (int i = 0; i < tersMatris1.length; i++) {//Sol Matrisin icindekileri yesil yapÄ±yor her seferinde	
						for (int j = 0; j < tersMatris1[0].length; j++) {
							tersMatris1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < matrisTranspoze1.length; i++) {// Sag matrisin icindekileri yesil yapÄ±yor her seferinde
						for (int j = 0; j < matrisTranspoze1[0].length; j++) {
							matrisTranspoze1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < tersMatris1[0].length; i++) {
						tersMatris1[k1][i].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < matrisTranspoze1.length; i++) {
						matrisTranspoze1[i][l1].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					
					l1++;
					SecimEkrani.toplamSayisi++;
					
					if(l1 == matrisTranspoze1[0].length) {
						l1 = 0;
						k1++;
						SecimEkrani.toplamSayisi++;
					}
					
					

					sonuc2[satir1][sutun1].setText(Double.toString(pinv[satir1][sutun1]));
					sonuc2[satir1][sutun1].setForeground(Color.BLUE);
					
					sutun1++;
					SecimEkrani.toplamSayisi++;
					if(sutun1 == sonuc2[0].length) {
						satir1++;
						sutun1=0;
						SecimEkrani.toplamSayisi++;
					}
					
					btnSayac2++;
					SecimEkrani.toplamSayisi++;
					if(btnSayac2 == sonuc2.length*sonuc2[0].length) {
						btnNewButton2.setEnabled(false);
						SecimEkrani.carpmaSayisi++;
					}
					

					
									
				}
			});
			btnNewButton2.setBounds(x1,y1+50,80,20);
			contentPane.add(btnNewButton2);
			
			
			
			
		}//Satir>Sutun
		
		
		
		
		if(matris[0].length>matris.length) {
			
			JLabel [][] matris1=new JLabel[matris.length][matris[0].length];
			JLabel [][] matrisTranspoze=new JLabel[transpoze.length][transpoze[0].length];
			JLabel [][] sonuc=new JLabel[matris.length][matrisTranspoze[0].length];
			
			for (int i = 0; i < matris1.length; i++) {
				for (int j = 0; j < matris1[0].length; j++) {
					matris1[i][j] = new JLabel();
					matris1[i][j].setBounds(x, y, 55, 55);
					matris1[i][j].setText(Double.toString(matris[i][j]));
					contentPane.add(matris1[i][j]);
					SecimEkrani.toplamSayisi+=2;
					x = x+55;
				}
				x=0;
				y=y+55;
				SecimEkrani.toplamSayisi+=2;
			}
			
			JLabel solCarpanLb=new JLabel("A Matrisi");
			solCarpanLb.setBounds(x,y,150,100);
			contentPane.add(solCarpanLb);
			
			x = matris1[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi++;
			SecimEkrani.carpmaSayisi++;
			
			for (int i = 0; i < matrisTranspoze.length; i++) {
				for (int j = 0; j < matrisTranspoze[0].length; j++) {
					matrisTranspoze[i][j] = new JLabel();
					matrisTranspoze[i][j].setBounds(x, y, 55, 55);
					matrisTranspoze[i][j].setText(Double.toString(transpoze[i][j]));
					contentPane.add(matrisTranspoze[i][j]);
					x = x+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x=matris1[0].length*55+55;
				y=y+55;
				SecimEkrani.toplamSayisi+=3;
				SecimEkrani.carpmaSayisi++;
			}
			
			
			
			JLabel sagCarpanLb=new JLabel("A Matrisin Transpozu");
			sagCarpanLb.setBounds(x,y,150,100);
			contentPane.add(sagCarpanLb);
			
			x = matris1[0].length*55+55 + matrisTranspoze[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi+=2;
			SecimEkrani.carpmaSayisi+=2;
			
			for (int i = 0; i < sonuc.length; i++) {
				for (int j = 0; j < sonuc[0].length; j++) {
					sonuc[i][j] = new JLabel();
					sonuc[i][j].setBounds(x, y, 55, 55);
					contentPane.add(sonuc[i][j]);
					x = x+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x=matris1[0].length*55+55 + matrisTranspoze[0].length*55+55;
				y=y+55;
				SecimEkrani.toplamSayisi+=5;
				SecimEkrani.carpmaSayisi+=2;
			}
			JLabel lblsonuc=new JLabel("AxAt");
			lblsonuc.setBounds(x,y,150,100);
			contentPane.add(lblsonuc);
			
			
			
			double [][]carpimSonucu = SecimEkrani.matrisCarpimi(matris, transpoze);
			
			JButton btnNewButton = new JButton("Devam");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					for (int i = 0; i < matris1.length; i++) {// Sag matrisin icindekileri yesil yapÄ±yor her seferinde
						for (int j = 0; j < matris1[0].length; j++) {
							matris1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < matrisTranspoze.length; i++) {//Sol Matrisin icindekileri yesil yapÄ±yor her seferinde	
						for (int j = 0; j < matrisTranspoze[0].length; j++) {
							matrisTranspoze[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					
					if(k>=matris1.length) {
						k=0;
						l++;
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < matris1[0].length; i++) {
						matris1[l][i].setForeground(Color.BLACK);
						matrisTranspoze[i][k].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					if(sutun == sonuc[0].length) {
						sutun=0;
						satir++;
						SecimEkrani.toplamSayisi++;
					}
					sonuc[satir][sutun].setForeground(Color.BLUE);
					sonuc[satir][sutun].setText(Double.toString( carpimSonucu[satir][sutun]));
					
					sutun++;
					k++;	
					
					
					btnSayac++;
					SecimEkrani.toplamSayisi+=3;
					if(btnSayac == sonuc.length*sonuc[0].length) {
						btnNewButton.setEnabled(false);
					}
					
				}
			});
			btnNewButton.setBounds(x,y+70,80,20);
			contentPane.add(btnNewButton);
			SecimEkrani.toplamSayisi++;
			
			
//#######################################Ic Carpim Bitti###################################################
			
			JLabel [][] sonuc1=new JLabel[matris.length][matrisTranspoze[0].length];
			JLabel [][] tersMatris=new JLabel[sonuc1[0].length][sonuc1.length];
			double [][] tersSonuc = SecimEkrani.invMatris(carpimSonucu);
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi+=5;
			SecimEkrani.carpmaSayisi+=3;
			
			for (int i = 0; i < sonuc1.length; i++) {
				for (int j = 0; j < sonuc[0].length; j++) {
					sonuc1[i][j] = new JLabel();
					sonuc1[i][j].setBounds(x, y, 55, 55);
					sonuc1[i][j].setText(Double.toString(carpimSonucu[i][j]));
					contentPane.add(sonuc1[i][j]);
					x += 55;
					SecimEkrani.toplamSayisi+=2;
				}
				x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55;
				y+=55;
				SecimEkrani.toplamSayisi+=7;
				SecimEkrani.carpmaSayisi+=3;
			}

			JLabel lblAtxA = new JLabel("A x At");
			lblAtxA.setBounds(x+50, y, 142, 34);
			contentPane.add(lblAtxA);
			SecimEkrani.toplamSayisi++;
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55;
			y=0;
			SecimEkrani.toplamSayisi+=7;
			SecimEkrani.carpmaSayisi+=4;
			
			JLabel lblDeterminant = new JLabel("* 1/"+SecimEkrani.determinant(carpimSonucu));
			lblDeterminant.setBounds(x-10, y+70, 142, 34);
			contentPane.add(lblDeterminant);
			
			x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55+75;
			y=0;
			SecimEkrani.toplamSayisi+=8;
			SecimEkrani.carpmaSayisi+=4;
			
			for (int i = 0; i < tersMatris.length; i++) {
				for (int j = 0; j < tersMatris[0].length; j++) {
					tersMatris[i][j] = new JLabel();
					tersMatris[i][j].setBounds(x, y, 55, 55);
					contentPane.add(tersMatris[i][j]);
					x+=55;
					SecimEkrani.toplamSayisi++;
				}
				x = matrisTranspoze[0].length*55+55+matris1[0].length*55+55 + carpimSonucu[0].length*55+55 +sonuc[0].length*55+55+75;
				y+=55;
				SecimEkrani.toplamSayisi+=10;
				SecimEkrani.carpmaSayisi+=4;
			}
			
			JLabel lblTers = new JLabel("(A x At)^-1");
			lblTers.setBounds(x+50, y, 142, 34);
			contentPane.add(lblTers);
			
			JButton btnNewButton1 = new JButton("Devam");
			btnNewButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					for (int i = 0; i <carpimSonucu.length; i++) {
						for (int j = 0; j < carpimSonucu[0].length; j++) {
							sonuc1[i][j].setForeground(Color.BLACK);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					if(tmpj== tersMatris.length) {
						tmpj=0;
						tmpi++;
						SecimEkrani.toplamSayisi++;
					}
					
					for (int j = 0; j < tersMatris.length; j++) {
						sonuc1[tmpi][j].setForeground(Color.RED);
						SecimEkrani.toplamSayisi++;
					}
					for (int i = 0; i < tersMatris.length; i++) {
						sonuc1[i][tmpj].setForeground(Color.RED);
						SecimEkrani.toplamSayisi++;
					}
					tmpj++;
					SecimEkrani.toplamSayisi++;
					if(tersj==tersMatris.length) {
						tersj=0;
						tersi++;
						SecimEkrani.toplamSayisi++;
					}
					tersMatris[tersi][tersj].setForeground(Color.BLUE);
					tersMatris[tersi][tersj].setText(Double.toString(tersSonuc[tersi][tersj]));
					tersj++;
					SecimEkrani.toplamSayisi++;
					
					btnSayac1++;
						SecimEkrani.toplamSayisi++;
					if(btnSayac1 == tersMatris.length*tersMatris[0].length) {
						btnNewButton1.setEnabled(false);
						SecimEkrani.carpmaSayisi++;
					}
					
				}
			});
			btnNewButton1.setBounds(x,y+70,80,20);
			contentPane.add(btnNewButton1);
			SecimEkrani.toplamSayisi++;
			
			//############################## Ters Alma Bitti #############################################
			
			
			JLabel [][] matrisTranspoze1=new JLabel[transpoze.length][transpoze[0].length];
			JLabel [][] tersMatris1=new JLabel[sonuc1[0].length][sonuc1.length];
			
			double [][] pinv = SecimEkrani.matrisCarpimi( transpoze,tersSonuc);
			for (int i = 0; i < pinv.length; i++) {
				for (int j = 0; j < pinv[0].length; j++) {
					pinv[i][j]*=100000;
					pinv[i][j]=Math.round(pinv[i][j]);
					pinv[i][j]/=100000;
					SecimEkrani.carpmaSayisi+=2;
					SecimEkrani.toplamSayisi++;
				}
				SecimEkrani.toplamSayisi++;
			}
			JLabel [][] sonuc2 = new JLabel[pinv.length][pinv[0].length];
			
			int x1 = 0;
			int y1 = y+400;
			SecimEkrani.toplamSayisi++;
			for (int i = 0; i < matrisTranspoze1.length; i++) {
				for (int j = 0; j < matrisTranspoze1[0].length; j++) {
					matrisTranspoze1[i][j] = new JLabel();
					matrisTranspoze1[i][j].setBounds(x1, y1, 55, 55);
					matrisTranspoze1[i][j].setText(Double.toString(transpoze[i][j]));
					contentPane.add(matrisTranspoze1[i][j]);
					x1 = x1+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x1 =0;
				y1 = y1 +55;
				SecimEkrani.toplamSayisi+=2;
			}
			
			JLabel lblTranspoz = new JLabel("A'nýn transpozu");
			lblTranspoz.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblTranspoz);
			SecimEkrani.toplamSayisi++;
			
			x1 = matrisTranspoze1[0].length*55+55;
			y1 = y+400;
			SecimEkrani.toplamSayisi+=2;
			SecimEkrani.carpmaSayisi++;
			
			for (int i = 0; i < tersMatris1.length; i++) {
				for (int j = 0; j < tersMatris1[0].length; j++) {
					tersMatris1[i][j] = new JLabel();
					tersMatris1[i][j].setBounds(x1, y1, 55, 55);
					tersMatris1[i][j].setText(Double.toString(tersSonuc[i][j]));
					contentPane.add(tersMatris1[i][j]);
					x1 = x1+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x1 =matrisTranspoze1[0].length*55+55;
				y1 = y1 +55;
				SecimEkrani.toplamSayisi+=3;
				SecimEkrani.carpmaSayisi++;
			}
			
			JLabel lblTers1 = new JLabel("(At x A)^-1");
			lblTers1.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblTers1);
			SecimEkrani.toplamSayisi++;
			
			x1 = matrisTranspoze1[0].length*55+55 + tersSonuc[0].length*55+55;
			y1 = y+400;
			SecimEkrani.toplamSayisi+=4;
			SecimEkrani.carpmaSayisi+=2;
			
			for (int i = 0; i < sonuc2.length; i++) {
				for (int j = 0; j < sonuc2[0].length; j++) {
					sonuc2[i][j] = new JLabel();
					sonuc2[i][j].setBounds(x1, y1, 55, 55);
					contentPane.add(sonuc2[i][j]);
					x1 = x1+55;
					SecimEkrani.toplamSayisi+=2;
				}
				x1 = matrisTranspoze1[0].length*55+55 + tersSonuc[0].length*55+55;
				y1=y1+55;
				SecimEkrani.toplamSayisi+=5;
				SecimEkrani.carpmaSayisi+=2;
			}
			
			JLabel lblPinv = new JLabel("PINV");
			lblPinv.setBounds(x1+50, y1, 142, 34);
			contentPane.add(lblPinv);
			SecimEkrani.toplamSayisi++;
			
			
			
			
			JButton btnNewButton2 = new JButton("Devam");
			btnNewButton2.addActionListener(new ActionListener() {
		        
				public void actionPerformed(ActionEvent arg0) {
					
					for (int i = 0; i < matrisTranspoze1.length; i++) {// Sol matrisin icindekileri yesil yapÄ±yor her seferinde
						for (int j = 0; j < matrisTranspoze1[0].length; j++) {
							matrisTranspoze1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < tersMatris1.length; i++) {//Sag Matrisin icindekileri yesil yapÄ±yor her seferinde	
						for (int j = 0; j < tersMatris1[0].length; j++) {
							tersMatris1[i][j].setForeground(Color.RED);
							SecimEkrani.toplamSayisi++;
						}
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < tersMatris1.length; i++) {
						tersMatris1[i][l1].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					
					for (int i = 0; i < matrisTranspoze1[0].length; i++) {
						matrisTranspoze1[k1][i].setForeground(Color.BLACK);
						SecimEkrani.toplamSayisi++;
					}
					
					
					
					l1++;
					SecimEkrani.toplamSayisi++;
					if(l1 == tersMatris1[0].length) {
						l1 = 0;
						k1++;
						SecimEkrani.toplamSayisi++;
					}
					
					

					sonuc2[satir1][sutun1].setText(Double.toString(pinv[satir1][sutun1]));
					sonuc2[satir1][sutun1].setForeground(Color.BLUE);
					
					sutun1++;
					SecimEkrani.toplamSayisi++;
					if(sutun1 == sonuc2[0].length) {
						satir1++;
						sutun1=0;
						SecimEkrani.toplamSayisi++;
					}
					
					btnSayac2++;
					SecimEkrani.toplamSayisi++;
					if(btnSayac2 == sonuc2.length*sonuc2[0].length) {
						btnNewButton2.setEnabled(false);
						SecimEkrani.carpmaSayisi++;
					}
									
				}
			});
			btnNewButton2.setBounds(x1,y1+50,80,20);
			contentPane.add(btnNewButton2);
			SecimEkrani.toplamSayisi++;
			
			
			
			x1 = matrisTranspoze1[0].length*55+55 + tersSonuc[0].length*55+55 +sonuc2[0].length*55+55;
			y1 = y+200;
			
			
			
		}//Satir<Sutun
		
		
		
		
		
	}//constructor
}
