package crud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Excluir extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;

	BancoDeDados banco = new BancoDeDados();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excluir frame = new Excluir();
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
	public Excluir() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRUD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(235, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("S");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir ex = new Excluir();
				ex.setVisible(false);
				
				Pesquisar pe = new Pesquisar();
				pe.setVisible(true);
				
				Inserir in = new Inserir();
				in.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 7, 48, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("I");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inserir s = new Inserir();
				s.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(61, 7, 48, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(111, 7, 48, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("U");
		btnNewButton_3.setBounds(162, 7, 48, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Excluir Um Registro");
		lblNewLabel_1.setBounds(61, 67, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID desejado:");
		lblNewLabel_2.setBounds(10, 101, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		txtId = new JTextField();
		txtId.setBounds(73, 98, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Processar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				banco.conectar();
				banco.deletarContatos(txtId.getText());		
				banco.listarTodosContatos();
			}
		});
		btnNewButton_4.setBounds(20, 126, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
