package Rotinas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtProfissao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
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
	public CadastroUsuario() {
		setTitle("Controle de usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(70, 39, 53, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(70, 64, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(70, 89, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Profiss\u00E3o:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(49, 114, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNome = new JTextField();
		txtNome.setBounds(128, 37, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(126, 62, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(128, 87, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtProfissao = new JTextField();
		txtProfissao.setBounds(128, 112, 86, 20);
		contentPane.add(txtProfissao);
		txtProfissao.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
							
				String nome, email, idade, profissao;	
				ArrayList<Usuario> usuario = new ArrayList<Usuario>();
				
				nome = txtNome.getText();
				idade = txtIdade.getText();
				email = txtEmail.getText();
				profissao = txtProfissao.getText();
				
				if(nome.trim().equals("") || email.trim().equals("") || idade.trim().equals("") || profissao.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "Não pode conter campos vazios");
				} else if (!idade.matches(".*[0-9].*")) {
					JOptionPane.showMessageDialog(null, "Campo idade invalido");					
				} else {
					Usuario u = new Usuario(nome, email, idade, profissao);
					usuario.add(u);
				}
				
				
				try {					
					FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\08_Lab01\\src\\arquivo.txt", true);
					//BufferedWriter ler = new BufferedWriter(arquivo);
					PrintWriter gravaArquivo = new PrintWriter(arquivo);
					
					if(usuario.size() > 0) {
						for(int x = 0; x < usuario.size(); x++) {
							 gravaArquivo.println(usuario.get(x).getNome() + " - "
									+ usuario.get(x).getIdade()
									+ " - "+ usuario.get(x).getIdade()
									+ " - "+ usuario.get(x).getEmail()
									+ " - "+ usuario.get(x).getProfissao());
						}
					}
					
					arquivo.close();
				}catch (IOException ex) {
					// TODO: handle exception
					System.out.println("Erro: " + ex.getMessage());
				}
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(125, 153, 89, 23);
		contentPane.add(btnNewButton);
	}

}
