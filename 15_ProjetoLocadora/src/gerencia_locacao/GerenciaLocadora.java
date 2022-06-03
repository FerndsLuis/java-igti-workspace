package gerencia_locacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Filme;
import Model.Genero;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GerenciaLocadora extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

	DefaultTableModel model;
	BancoDeDados banco = new BancoDeDados();
	
	private JTextField txtDataLancamento;
	private JTextField txtDuracao;
	private JTextField txtNome;
	private JTextField txtImagem;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciaLocadora frame = new GerenciaLocadora();
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
	public GerenciaLocadora() {
		BancoDeDados banco = new BancoDeDados();
		banco.conectar();
		banco.listarFilmes();
		banco.listarGenero();
		
		
		setTitle("Sistema de locadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_imagem = new JLabel("");
		lbl_imagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imagem.setBounds(525, 276, 235, 97);
		contentPane.add(lbl_imagem);
		
		JLabel lbl_sinopse = new JLabel("");
		lbl_sinopse.setVerticalAlignment(SwingConstants.TOP);
		lbl_sinopse.setBounds(525, 423, 235, 84);
		contentPane.add(lbl_sinopse);
		
		JTextPane txtSinopse = new JTextPane();
		txtSinopse.setBounds(10, 272, 280, 144);
		contentPane.add(txtSinopse);
		
		//String[] generosCombobox = banco.generos.toArray(new Genero().getGenero());		
		JComboBox comboBox_genero = new JComboBox();
		comboBox_genero.setBounds(134, 137, 156, 22);	
		for (Genero item : banco.generos) {
			comboBox_genero.addItem(item.getGenero());
		}
		contentPane.add(comboBox_genero);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(382, 78, 476, 136);
		contentPane.add(scrollPane);
				
		model = new DefaultTableModel();
		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contado = tabela.getSelectedRow();				
				lbl_sinopse.setText(banco.filmes.get(contado).getSinopse_filme());
				lbl_imagem.setIcon(new ImageIcon(getClass().getResource(("../img/"+banco.filmes.get(contado).getImagem_filme()))));	
				
				txtNome.setText(model.getValueAt(contado, 1).toString());
				txtDuracao.setText(model.getValueAt(contado, 2).toString());
			    comboBox_genero.setSelectedItem(banco.filmes.get(contado).getGenero_filme());				
				txtDataLancamento.setText(model.getValueAt(contado, 4).toString());				
				txtImagem.setText(banco.filmes.get(contado).getImagem_filme());
				txtSinopse.setText(model.getValueAt(contado, 5).toString());
				
				//System.out.println(banco.filmes.get(contado).getGenero_filme());
			}
		});
		scrollPane.setViewportView(tabela);
		
		Object[] column = {
		"id", "nome_filme","duracao_filme","genero_filme", 
		"data_lanc_filme", "sinopse"};
		Object[] row = new Object[6];		
		tabela.setModel(model);
		model.setColumnIdentifiers(column);
		
		JLabel lblNewLabel = new JLabel("Sistema de loca\u00E7\u00E3o de filmes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(139, 11, 246, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome filme:");
		lblNewLabel_1.setBounds(10, 78, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dura\u00E7\u00E3o Filme:");
		lblNewLabel_2.setBounds(10, 109, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genero Filme:");
		lblNewLabel_3.setBounds(10, 144, 114, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data lan\u00E7amento:");
		lblNewLabel_4.setBounds(10, 181, 114, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sinopse:");
		lblNewLabel_5.setBounds(10, 247, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		txtDataLancamento = new JTextField();
		txtDataLancamento.setBounds(134, 175, 156, 20);
		contentPane.add(txtDataLancamento);
		txtDataLancamento.setColumns(10);
		
		txtDuracao = new JTextField();
		txtDuracao.setBounds(134, 103, 156, 20);
		contentPane.add(txtDuracao);
		txtDuracao.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(134, 72, 156, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Imagem:");
		lblNewLabel_6.setBounds(10, 218, 114, 14);
		contentPane.add(lblNewLabel_6);
		
		txtImagem = new JTextField();
		txtImagem.setBounds(134, 212, 156, 20);
		contentPane.add(txtImagem);
		txtImagem.setColumns(10);
		
	
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BancoDeDados bd = new BancoDeDados();
				bd.conectar();
				Filme f = new Filme();
				
				f.setNome_filme(txtNome.getText());
				f.setDuracao_filme(txtDuracao.getText());
				f.setGenero_filme((String) comboBox_genero.getSelectedItem());
				f.setData_lancamento_filme(txtDataLancamento.getText());
				f.setSinopse_filme(txtSinopse.getText());
				f.setImagem_filme(txtImagem.getText());
				
				bd.inserirFilme(f);
				bd.listarFilmes();
				
				 if (model.getRowCount() > 0) {
				     for (int i = model.getRowCount() - 1; i > -1; i--) {
				         model.removeRow(i);
				     }
				 }
				 
				for(int x = 0; x < bd.filmes.size(); x++) {
					row[0] = bd.filmes.get(x).getId_filme();
					row[1] = bd.filmes.get(x).getNome_filme();
					row[2] = bd.filmes.get(x).getDuracao_filme();
					row[3] = bd.filmes.get(x).getGenero_filme();
					row[4] = bd.filmes.get(x).getData_lancamento_filme();					
					row[5] = bd.filmes.get(x).getSinopse_filme();
					model.addRow(row);					
				}
				model.fireTableDataChanged();
			}
		});
		btnNewButton.setBounds(10, 427, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contado = tabela.getSelectedRow();		
				
				banco.deletarFilme((int) model.getValueAt(contado, 0));				
				
				model.removeRow(contado);
			}
		});
		btnNewButton_1.setBounds(115, 427, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtDuracao.setText("");
				comboBox_genero.setSelectedIndex(0);
				txtDataLancamento.setText("");
				txtSinopse.setText("");
				txtImagem.setText("");
			}
		});
		btnNewButton_2.setBounds(10, 458, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Modificar");
		btnNewButton_3.setBounds(115, 458, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Imagem do encarte");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(587, 251, 117, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Sinopse");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(625, 385, 58, 14);
		contentPane.add(lblNewLabel_8);
	
			
		for(int x = 0; x < banco.filmes.size(); x++) {
			row[0] = banco.filmes.get(x).getId_filme();
			row[1] = banco.filmes.get(x).getNome_filme();
			row[2] = banco.filmes.get(x).getDuracao_filme();
			row[3] = banco.filmes.get(x).getGenero_filme();
			row[4] = banco.filmes.get(x).getData_lancamento_filme();			
			row[5] = banco.filmes.get(x).getSinopse_filme();
			model.addRow(row);
		}
	}
		
}
