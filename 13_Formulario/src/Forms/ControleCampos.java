package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControleCampos extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField id;
	private JTextField pais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleCampos frame = new ControleCampos();
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
	public ControleCampos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Criando váriavel do tipo array
		String[] paises = {"Brasil","Italia","Peru"};		
				
		JList list = new JList(paises);
		list.setBounds(338, 27, 59, 89);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox(paises);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pais.setText(paises[comboBox.getSelectedIndex()]);
				//pais.setText(comboBox.get);
			}
		});
		
		
		comboBox.setBounds(410, 27, 88, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		nome = new JTextField();
		nome.setBounds(59, 57, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		id = new JTextField();
		id.setBounds(59, 25, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				nome.setText("");
				pais.setText("");
			}
		});
		btnNewButton.setBounds(10, 149, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Paises");
		lblNewLabel_2.setBounds(10, 86, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		pais = new JTextField();
		pais.setBounds(59, 85, 86, 20);
		contentPane.add(pais);
		pais.setColumns(10);
	}
}
