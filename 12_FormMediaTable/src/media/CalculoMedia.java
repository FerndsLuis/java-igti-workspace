package media;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoMedia extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField nome;
	private JTextField nota1;
	private JTextField nota2;
	private JTable table;
	DefaultTableModel model;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMedia frame = new CalculoMedia();
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
	public CalculoMedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Aluno");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome_Aluno");
		lblNewLabel_1.setBounds(10, 39, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota1 Aluno");
		lblNewLabel_2.setBounds(10, 71, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota2_Aluno");
		lblNewLabel_3.setBounds(10, 102, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(90, 8, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		nome = new JTextField();
		nome.setBounds(90, 36, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		nota1 = new JTextField();
		nota1.setBounds(90, 68, 86, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(90, 99, 86, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 153, 414, 100);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		model = new DefaultTableModel();		
		//Criamos os campo que irão compor o cabeçalho
		Object[] column = {"ID Aluno","Nome","Nota 1","Nota 2", "Media", "Situação"};
		//Criar a linha do cabeçalho
		Object[] row = new Object[6];
		//Identificação
		model.setColumnIdentifiers(column);
		table.setModel(model);
				
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("") && nome.getText().equals("") && nota1.equals("") && nota2.equals("")) {
					JOptionPane.showMessageDialog(null, "Não pode ter campos vazios");
				} else {		
					row[0] = id.getText();
					row[1] = nome.getText();
					row[2] = nota1.getText();
					row[3] = nota2.getText();
					row[4] = media(nota1.getText(),nota2.getText());
					row[5] = situacao(nota1.getText(),nota2.getText());					
					model.addRow(row);
				}
				
				id.setText("");
				nome.setText("");
				nota1.setText("");
				nota2.setText("");	
			}
		});
		btnNewButton.setBounds(199, 65, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() >= 0 && table.getRowCount() > 0) {
					int contadoe = table.getSelectedRow();
					model.removeRow(contadoe);
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um item");
				}	
			}
		});
		btnNewButton_1.setBounds(199, 93, 89, 23);
		contentPane.add(btnNewButton_1);	
	}
	
	public String situacao(String x, String y) {
		int numero1 = Integer.parseInt(x);
		int numero2 = Integer.parseInt(y);
		int media = (numero1 + numero2)/2;
				
		if(media > 5) {
			return "aprovado";
		}else if(media == 5) {
			return "Recuperação";
		}else {
			return "Reprovado";
		}			
	}
	
	public String media(String x, String y) {
		int numero1 = Integer.parseInt(x);
		int numero2 = Integer.parseInt(y);
		int media = (numero1 + numero2)/2;
		
		return String.valueOf(media); 
	}

}
