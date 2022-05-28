package Form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculoMedia extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField falta;
	private JTextField nota1;
	private JTextField nota2;	
	private JTable table_1;
	DefaultTableModel model;
	
	ArrayList<String[]> dados = new ArrayList<String[]>();
	
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
		setBounds(100, 100, 497, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 26, 55, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Disciplina:");
		lblNewLabel_1.setBounds(10, 63, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Faltas:");
		lblNewLabel_2.setBounds(10, 108, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota1:");
		lblNewLabel_3.setBounds(10, 152, 55, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nota2:");
		lblNewLabel_4.setBounds(10, 194, 55, 14);
		contentPane.add(lblNewLabel_4);
		
		//Criando váriavel do tipo array
		String[] disciplinas = {"ADM","SIS","DIR"};
		JComboBox comboBoxDisciplina = new JComboBox(disciplinas);
		comboBoxDisciplina.setBounds(85, 56, 161, 22);
		contentPane.add(comboBoxDisciplina);
		
		nome = new JTextField();
		nome.setBounds(85, 20, 161, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		falta = new JTextField();
		falta.setBounds(85, 102, 161, 20);
		contentPane.add(falta);
		falta.setColumns(10);
		
		nota1 = new JTextField();
		nota1.setBounds(85, 146, 161, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(85, 188, 161, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 325, 461, 160);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int contado = table_1.getSelectedRow();
				
				nome.setText( model.getValueAt(contado, 0).toString() );
				comboBoxDisciplina.setSelectedItem(model.getValueAt(contado, 1));
				falta.setText( model.getValueAt(contado, 2).toString() );
				nota1.setText( model.getValueAt(contado, 3).toString() );
				nota2.setText( model.getValueAt(contado, 4).toString() );
				
			}
		});
		scrollPane.setViewportView(table_1);


			
				
		
		model = new DefaultTableModel();		
		//Criamos os campo que irão compor o cabeçalho
		Object[] column = {"Nome","Disciplina","Faltas","Nota1","Nota2"};
		//Criar a linha do cabeçalho
		Object[] row = new Object[5];
		//Identificação
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		
		
		
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nome.getText().equals("") 
					&& comboBoxDisciplina.getSelectedIndex() >= 0
					&& falta.getText().equals("") 
					&& nota1.getText().equals("") 
					&& nota2.getText().equals("")) {					
					JOptionPane.showMessageDialog(null, "Não pode ter campos vazios");	
				} else {
					row[0] = nome.getText();
					row[1] = disciplinas[comboBoxDisciplina.getSelectedIndex()];
					row[2] = falta.getText();
					row[3] = nota1.getText();
					row[4] = nota2.getText();
					model.addRow(row);
				
					dados.add(
						new String[]{nome.getText(),
						disciplinas[comboBoxDisciplina.getSelectedIndex()],
						falta.getText(),
						nota1.getText(),
						nota2.getText()});
					
					gravarArquivo(dados);
					
					nome.setText("");
					comboBoxDisciplina.setSelectedIndex(0);
					falta.setText("");
					nota1.setText("");
					nota2.setText("");
					
				}
			}
		});
		btnNewButton.setBounds(10, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_1.getSelectedRow() >= 0 && table_1.getRowCount() > 0) {
					int contado = table_1.getSelectedRow();						
					System.out.println(model.getValueAt(contado, 1));
					
					row[0] = nome.getText();
					row[1] = disciplinas[comboBoxDisciplina.getSelectedIndex()];
					row[2] = falta.getText();
					row[3] = nota1.getText();
					row[4] = nota2.getText();
					
					model.setValueAt(nome.getText(), contado, 0);
					model.setValueAt(disciplinas[comboBoxDisciplina.getSelectedIndex()], contado, 1);
					model.setValueAt(falta.getText(), contado, 2);
					model.setValueAt(nota1.getText(), contado, 3);
					model.setValueAt(nota2.getText(), contado, 4);
					
					dados.set(contado, new String[]{nome.getText(),
						disciplinas[comboBoxDisciplina.getSelectedIndex()],
						falta.getText(),
						nota1.getText(),
						nota2.getText()});
					
					gravarArquivo(dados);
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um item");
				}
			}
		});
		btnNewButton_1.setBounds(109, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_1.getSelectedRow() >= 0 && table_1.getRowCount() > 0) {
					int contado = table_1.getSelectedRow();
					model.removeRow(contado);
					dados.remove(contado);
					gravarArquivo(dados);
				} else {
					JOptionPane.showMessageDialog(null, "Selecione um item");
				}
			}
		});
		btnNewButton_2.setBounds(208, 238, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Listagem de Alunos");
		lblNewLabel_5.setBounds(10, 293, 98, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("Relat\u00F3rio");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorio r = new Relatorio();
				
				
				
				r.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(120, 291, 89, 23);
		contentPane.add(btnNewButton_3);
	}
	
	public void gravarArquivo(ArrayList<String[]> dados) {		
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\13_Media_Tablea_Jlist_Arquivo\\src\\Form\\arquivo.txt");
			PrintWriter gravandoArquivo = new PrintWriter(arquivo);
			
			for(int x = 0; x < dados.size(); x++) {				
				gravandoArquivo.append("Nome:" + dados.get(x)[0]
						+" | Disciplina:"+  dados.get(x)[1]
						+" | Falta:"+  dados.get(x)[2]
						+" | Nota1:"+  dados.get(x)[3]
						+" | Nota2:"+  dados.get(x)[4] + "\n"
								);
			}
			
			
			arquivo.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
}
