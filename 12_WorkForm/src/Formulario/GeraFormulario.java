package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GeraFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField nome;
	private JTextField email;
	private JTextField idade;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeraFormulario frame = new GeraFormulario();
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
	public GeraFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id cliente");
		lblNewLabel.setBounds(10, 44, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 80, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail:");
		lblNewLabel_2.setBounds(10, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade:");
		lblNewLabel_3.setBounds(10, 152, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(77, 38, 132, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		nome = new JTextField();
		nome.setBounds(77, 74, 132, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		email = new JTextField();
		email.setBounds(77, 107, 132, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(77, 146, 132, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 38, 255, 226);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		
		//Criamos os campo que irão compor o cabeçalho
		Object[] column = {"ID","Nome","E-mail","Idade"};
		//Criar a linha do cabeçalho
		Object[] row = new Object[4];
		//Identificação
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(id.getText().equals("") && nome.getText().equals("") && 
						email.getText().equals("") && idade.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Não pode ter campos vazios");
				} else {
					row[0] = id.getText();
					row[1] = nome.getText();
					row[2] = email.getText();
					row[3] = idade.getText();				
					model.addRow(row);
				}				
				
				id.setText("");
				nome.setText("");
				email.setText("");
				idade.setText("");				
			}
		});
		btnNewButton.setBounds(10, 207, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.setBounds(109, 207, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Deletar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.requestFocus();
				
				if(table.getSelectedRow() >= 0 && table.getRowCount() > 0) {
					int contadoe = table.getSelectedRow();
					model.removeRow(contadoe);
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um item");
				}							
				
			}
		});
		btnNewButton_2.setBounds(10, 241, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Limpar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				nome.setText("");
				email.setText("");
				idade.setText("");
			}
		});
		btnNewButton_3.setBounds(109, 241, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
