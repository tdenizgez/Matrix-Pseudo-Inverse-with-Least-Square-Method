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

public class HataKare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HataKare frame = new HataKare();
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
	public HataKare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTamam = new JButton("Tamam");
		btnTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SecimEkrani.hataKare.dispose();
			}
		});
		btnTamam.setBounds(79, 56, 97, 25);
		contentPane.add(btnTamam);
		
		JLabel lblHata = new JLabel("Kare Olmayan Bir Matris Giriniz.");
		lblHata.setBounds(32, 27, 192, 16);
		contentPane.add(lblHata);
	}

}
