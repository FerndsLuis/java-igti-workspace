package Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcessaCalculadora extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcessaCalculadora frame = new ProcessaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public String Calculo(String n1, String n2, String operacao) {
		int num1,num2;
		int resultado = 0;
		
		if(n1 == "" || n2 == "")
		{
			JOptionPane.showMessageDialog(null, "Não pode conter campos vazios");
		}		
		else if ( (n1.matches(".*[0-9].*")) && (n2.matches(".*[0-9].*")) ) 
		{	
			num1 = Integer.parseInt(n1);
			num2 = Integer.parseInt(n2);
			
			switch(operacao) {
			case "soma":
				resultado = num1 + num2;
				break;
			case "subtracao":
				resultado = num1 - num2;
				break;
			case "multiplicacao":
				resultado = num1 * num2;
				break;
			case "divisao":
				resultado = num1 / num2;
				break;
			}			
			return Integer.toString(resultado);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Não pode conter letras");
			return Integer.toString(0);	
		}
		return Integer.toString(0);		
	}

	/**
	 * Create the frame.
	 */
	public ProcessaCalculadora() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro valor");
		lblNewLabel.setBounds(14, 18, 65, 14);
		contentPane.add(lblNewLabel);
		
		JTextPane txtValor1 = new JTextPane();
		txtValor1.setBounds(119, 12, 47, 20);
		contentPane.add(txtValor1);
		
		JTextPane txtValor2 = new JTextPane();
		txtValor2.setBounds(119, 37, 47, 20);
		contentPane.add(txtValor2);
		
		JLabel lblSegundoValor_1 = new JLabel("Segundo valor");
		lblSegundoValor_1.setBounds(10, 43, 69, 14);
		contentPane.add(lblSegundoValor_1);
		
		JTextPane txtResultado = new JTextPane();
		txtResultado.setBounds(200, 37, 47, 20);
		contentPane.add(txtResultado);			
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				txtResultado.setText(Calculo(txtValor1.getText(), txtValor2.getText(), "soma"));
			}
		});
		btnNewButton.setBounds(30, 75, 49, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				txtResultado.setText(Calculo(txtValor1.getText(), txtValor2.getText(), "subtracao"));			}
		});
		btnNewButton_1.setBounds(89, 75, 37, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(Calculo(txtValor1.getText(), txtValor2.getText(), "multiplicacao"));	
			}
		});
		btnNewButton_2.setBounds(136, 75, 47, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(Calculo(txtValor1.getText(), txtValor2.getText(), "divisao"));//		
			}
		});
		btnNewButton_3.setBounds(193, 75, 37, 23);
		contentPane.add(btnNewButton_3);
	}
}
