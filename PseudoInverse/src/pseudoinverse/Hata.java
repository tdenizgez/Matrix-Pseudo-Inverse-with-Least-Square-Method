package pseudoinverse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hata extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hata frame = new Hata();
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
	public Hata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlanBoBraklamaz = new JLabel("Alan Bo\u015F B\u0131rak\u0131lamaz");
		lblAlanBoBraklamaz.setBounds(151, 54, 129, 34);
		contentPane.add(lblAlanBoBraklamaz);
		
		JLabel lblSadeceSayGirii = new JLabel("Sadece Say\u0131 Giri\u015Fi Yap\u0131n\u0131z");
		lblSadeceSayGirii.setBounds(138, 89, 155, 34);
		contentPane.add(lblSadeceSayGirii);
		
		JButton btnTamam = new JButton("Tamam");
		btnTamam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatrisGir.tmp33.dispose();
			}
		});
		btnTamam.setBounds(166, 135, 97, 25);
		contentPane.add(btnTamam);
	}
}
