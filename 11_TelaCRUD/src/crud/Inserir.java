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

public class Inserir extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	BancoDeDados banco = new BancoDeDados();
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtFuncao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir frame = new Inserir();
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
	public Inserir() {		
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
				Pesquisar p = new Pesquisar();
				p.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 7, 48, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("I");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir ex = new Excluir();
				ex.setVisible(false);
				
				Pesquisar pe = new Pesquisar();
				pe.setVisible(false);
				
				Inserir in = new Inserir();
				in.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(61, 7, 48, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Excluir ex = new Excluir();
				ex.setVisible(true);
				
				Pesquisar pe = new Pesquisar();
				pe.setVisible(false);
				
				Inserir in = new Inserir();
				in.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(111, 7, 48, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("U");
		btnNewButton_3.setBounds(162, 7, 48, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Inserir Registro");
		lblNewLabel_1.setBounds(61, 67, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(10, 101, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNome = new JTextField();
		txtNome.setBounds(54, 98, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Processar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				banco.conectar();
				banco.inserirContatos(txtNome.getText(), txtIdade.getText(), txtEmail.getText(), txtFuncao.getText());
				System.out.println("Ok");
				banco.listarTodosContatos();	
			}
		});
		btnNewButton_4.setBounds(10, 245, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("Idade");
		lblNewLabel_3.setBounds(10, 141, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail");
		lblNewLabel_4.setBounds(12, 180, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fun\u00E7\u00E3o");
		lblNewLabel_5.setBounds(10, 220, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(54, 138, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(54, 177, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtFuncao = new JTextField();
		txtFuncao.setBounds(54, 214, 86, 20);
		contentPane.add(txtFuncao);
		txtFuncao.setColumns(10);
	}
}
