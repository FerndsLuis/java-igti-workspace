package visitas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPersonas extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPersonas frame = new FrmPersonas();
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
	public FrmPersonas() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(42, 51, 72, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(85, 49, 108, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Processo para llimpar o campo
				textNome.setText("");
				textNome.requestFocus();
			}
		});
		btnNewButton.setBounds(85, 140, 108, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Logica para monitorar o presente
				if(textNome.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Campo vázio");
					textNome.requestFocus();
					return;
				}
				
			}
		});
		btnNewButton_1.setBounds(205, 140, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setBounds(203, 52, 14, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_2 = new JButton("Processar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//processar dados
				String nome = textNome.getText();
				JOptionPane.showMessageDialog(null, nome);
			}
		});
		btnNewButton_2.setBounds(153, 200, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
