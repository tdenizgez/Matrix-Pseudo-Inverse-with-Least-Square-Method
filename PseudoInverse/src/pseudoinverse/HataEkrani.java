package pseudoinverse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HataEkrani extends JFrame {

	private JPanel contentPane;
	public static HataEkrani frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new HataEkrani();
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
	public HataEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTamam = new JButton("Tamam");
		btnTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatrisGir.hata.dispose();
			}
		});
		btnTamam.setBounds(146, 114, 97, 25);
		contentPane.add(btnTamam);
		
		JLabel lblDeterminant = new JLabel("Determinant\u0131 S\u0131f\u0131r Olan Bir Matris Girdiniz Tekrar Giri\u015F Yap\u0131n\u0131z.");
		lblDeterminant.setBounds(9, 33, 372, 67);
		contentPane.add(lblDeterminant);
	}
}
