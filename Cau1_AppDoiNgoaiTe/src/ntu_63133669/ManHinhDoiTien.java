package ntu_63133669;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhDoiTien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldVND;
	private JTextField textFieldUSD;
	private JTextField textFieldRUB;
	private JTextField textFieldEURO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhDoiTien frame = new ManHinhDoiTien();
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
	public ManHinhDoiTien() {
		setTitle("Cau1_AppDoiNgoaiTe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VND >");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(47, 41, 45, 13);
		contentPane.add(lblNewLabel);
		
		textFieldVND = new JTextField();
		textFieldVND.setBounds(115, 40, 183, 19);
		contentPane.add(textFieldVND);
		textFieldVND.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("$ USD >");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(37, 78, 55, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P RUB >");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(37, 113, 55, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EURO >");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(37, 147, 55, 13);
		contentPane.add(lblNewLabel_3);
		
		textFieldUSD = new JTextField();
		textFieldUSD.setEditable(false);
		textFieldUSD.setBounds(115, 77, 183, 19);
		contentPane.add(textFieldUSD);
		textFieldUSD.setColumns(10);
		
		textFieldRUB = new JTextField();
		textFieldRUB.setEditable(false);
		textFieldRUB.setBounds(115, 112, 183, 19);
		contentPane.add(textFieldRUB);
		textFieldRUB.setColumns(10);
		
		textFieldEURO = new JTextField();
		textFieldEURO.setEditable(false);
		textFieldEURO.setBounds(115, 146, 183, 19);
		contentPane.add(textFieldEURO);
		textFieldEURO.setColumns(10);
		
		JButton btnButtonChange = new JButton("Change");
		btnButtonChange.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButtonChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoiTien();
			}
		});
		btnButtonChange.setBounds(66, 209, 111, 21);
		contentPane.add(btnButtonChange);
		
		JButton btnButtonClear = new JButton("Clear");
		btnButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldVND.setText("");
				textFieldUSD.setText("");
				textFieldRUB.setText("");
				textFieldEURO.setText("");
			}
		});
		btnButtonClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnButtonClear.setBounds(187, 209, 111, 21);
		contentPane.add(btnButtonClear);
	}
	
	void DoiTien() {
		double vnd = Double.parseDouble(textFieldVND.getText());
		
		double usd = vnd / 24770;
		double rub = vnd / 268.41;
		double euro = vnd / 26906.41;
		
		textFieldUSD.setText(String.format("%.2f", usd));
        textFieldRUB.setText(String.format("%.2f", rub));
        textFieldEURO.setText(String.format("%.2f", euro));
		
	}
}
