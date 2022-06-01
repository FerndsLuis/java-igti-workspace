package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Sistema extends JFrame {

	private JPanel contentPane;
	private JTextField data_lancamento;
	private JTextField duracao_filme;
	private JTextField nome_filme;
	private JTable table;

	DefaultTableModel model;
	ArrayList<String[]> dados = new ArrayList<String[]>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
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
	public Sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de loca\u00E7\u00E3o de filmes");
		lblNewLabel.setBounds(10, 11, 164, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do filme:");
		lblNewLabel_1.setBounds(10, 36, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Duracao do filme");
		lblNewLabel_2.setBounds(10, 61, 113, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genero do filme");
		lblNewLabel_3.setBounds(10, 86, 113, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de lan\u00E7amento");
		lblNewLabel_4.setBounds(10, 111, 113, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sinopse");
		lblNewLabel_5.setBounds(10, 136, 113, 14);
		contentPane.add(lblNewLabel_5);
		
		data_lancamento = new JTextField();
		data_lancamento.setBounds(127, 108, 170, 20);
		contentPane.add(data_lancamento);
		data_lancamento.setColumns(10);
		
		duracao_filme = new JTextField();
		duracao_filme.setBounds(127, 58, 170, 20);
		contentPane.add(duracao_filme);
		duracao_filme.setColumns(10);
		
		nome_filme = new JTextField();
		nome_filme.setBounds(127, 33, 170, 20);
		contentPane.add(nome_filme);
		nome_filme.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 321, 287, 66);
		contentPane.add(scrollPane);
		
		JLabel lbl_sinopse = new JLabel("New label");
		lbl_sinopse.setVerticalAlignment(SwingConstants.TOP);
		lbl_sinopse.setBounds(192, 431, 105, 91);
		contentPane.add(lbl_sinopse);
		
		JLabel lbl_imagem = new JLabel("imagem");
		lbl_imagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imagem.setBounds(10, 425, 164, 164);
		contentPane.add(lbl_imagem);
		
		JTextPane sinopse = new JTextPane();
		sinopse.setBounds(57, 136, 240, 89);
		contentPane.add(sinopse);
		
		
		//Criando váriavel do tipo array
		String[] generos = {"acao","terror","drama"};
		JComboBox comboBoxGenero = new JComboBox(generos);
		comboBoxGenero.setBounds(127, 82, 170, 22);
		contentPane.add(comboBoxGenero);
		
	
		
		
		
		
		//table
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contado = table.getSelectedRow();				
				nome_filme.setText(model.getValueAt(contado, 0).toString());
				duracao_filme.setText(model.getValueAt(contado, 1).toString());	
				comboBoxGenero.setSelectedItem(dados.get(contado)[2]);
				sinopse.setText(dados.get(contado)[4]);
				data_lancamento.setText(dados.get(contado)[3]);
								
				lbl_imagem.setIcon(new ImageIcon(getClass().getResource(("../img/"+dados.get(contado)[2]+".png"))));
				lbl_sinopse.setText(dados.get(contado)[4]);
			}
		});
		scrollPane.setViewportView(table);
		
		model = new DefaultTableModel();
		Object[] column = {"Nome","Duração"};
		Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		
		
	
		
		
		JButton btnNewButton_1 = new JButton("deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contado = table.getSelectedRow();
				model.removeRow(contado);
				dados.remove(contado);
			}
		});
		btnNewButton_1.setBounds(109, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome_filme.setText("");
				duracao_filme.setText("");
				comboBoxGenero.setSelectedIndex(0);
				data_lancamento.setText("");
				sinopse.setText("");
			}
		});
		btnNewButton_2.setBounds(208, 248, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Sess\u00E3o de filme");
		lblNewLabel_6.setBounds(10, 296, 113, 14);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("Imagen do encarte");
		lblNewLabel_7.setBounds(10, 408, 105, 14);
		contentPane.add(lblNewLabel_7);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("Sinopse");
		lblNewLabel_8.setBounds(192, 408, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		
		
		JButton btnNewButton = new JButton("inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				row[0] = nome_filme.getText();
				row[1] = duracao_filme.getText();
				model.addRow(row);	
				
				dados.add(
					new String[]{nome_filme.getText(),
						duracao_filme.getText(),
						generos[comboBoxGenero.getSelectedIndex()],
						data_lancamento.getText(),
						sinopse.getText()});
				
				nome_filme.setText("");
				duracao_filme.setText("");
				comboBoxGenero.setSelectedIndex(0);
				data_lancamento.setText("");
				sinopse.setText("");
			}
		});
		btnNewButton.setBounds(10, 248, 89, 23);
		contentPane.add(btnNewButton);
	}
}
