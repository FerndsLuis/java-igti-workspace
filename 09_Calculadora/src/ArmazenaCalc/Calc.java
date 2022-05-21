package ArmazenaCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ExibeCalc.Exibe;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	
	//criando variáveis dentro da calculadora
	Double valor1, valor2;
	String sinal;	
	ArrayList<String> historico = new ArrayList<String>();
			

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Padr\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(30, 36, 243, 29);
		contentPane.add(lblNewLabel);
		
		txtResultado = new JTextField();
		txtResultado.setText("0");
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResultado.setBounds(30, 79, 253, 51);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		txtResultado.setEnabled(false);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("7");
				} else {					
					txtResultado.setText(txtResultado.getText() + "7");
				}
			}
		});
		btnNewButton.setBounds(30, 154, 55, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("8");
				} else {					
					txtResultado.setText(txtResultado.getText() + "8");
				}
			}
		});
		btnNewButton_1.setBounds(96, 154, 55, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("9");
				} else {					
					txtResultado.setText(txtResultado.getText() + "9");
				}
			}
		});
		btnNewButton_2.setBounds(161, 154, 55, 36);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("4");
				} else {					
					txtResultado.setText(txtResultado.getText() + "4");
				}
				
			}
		});
		btnNewButton_3.setBounds(30, 201, 55, 36);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("5");
				} else {					
					txtResultado.setText(txtResultado.getText() + "5");
				}
			}
		});
		btnNewButton_4.setBounds(96, 201, 55, 36);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("6");
				} else {					
					txtResultado.setText(txtResultado.getText() + "6");
				}
			}
		});
		btnNewButton_5.setBounds(161, 201, 55, 36);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("1");
				} else {					
					txtResultado.setText(txtResultado.getText() + "1");
				}
			}
		});
		btnNewButton_6.setBounds(30, 248, 55, 36);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("2");
				} else {					
					txtResultado.setText(txtResultado.getText() + "2");
				}
			}
		});
		btnNewButton_7.setBounds(96, 248, 55, 36);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("3");
				} else {					
					txtResultado.setText(txtResultado.getText() + "3");
				}
			}
		});
		btnNewButton_8.setBounds(161, 248, 55, 36);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) {
					txtResultado.setText("0");
				} else {					
					txtResultado.setText(txtResultado.getText() + "0");
				}
			}
		});
		btnNewButton_9.setBounds(30, 295, 121, 37);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(",");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valida = txtResultado.getText();	
				
				if(valida.contains(",")) {
					return;
				}else if(valida.contains("0") && valida.length() == 0) {
					txtResultado.setText("0,");					
				} else if (valida.matches(".*[0-9].*")) {
					txtResultado.setText(txtResultado.getText() + ",");	
				}
				
			}
		});
		btnNewButton_10.setBounds(161, 295, 55, 37);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("CE");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("0");
			}
		});
		btnNewButton_11.setBounds(226, 154, 55, 36);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("C");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("0");
				valor1 = 0.0;
				valor2 = 0.0;
			}
		});
		btnNewButton_12.setBounds(226, 201, 55, 36);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.getText().equals("0")) return;
					
				String acumula = "";
				
				valor2 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));	
						
				//verificar a ação
				if(sinal == "soma") {
					txtResultado.setText(String.valueOf(valor1 + valor2).replace(".", ",") );
					acumula += String.valueOf(valor1)+ " + " + String.valueOf(valor2) + " = " + txtResultado.getText() + "\n";
				} else if (sinal == "subtracao") {
					txtResultado.setText(String.valueOf(valor1 - valor2).replace(".", ",") );
					acumula += String.valueOf(valor1)+ " - " + String.valueOf(valor2) + " = " + txtResultado.getText() + "\n";
				} else if (sinal == "multiplicacao") {
					txtResultado.setText(String.valueOf(valor1 * valor2).replace(".", ",") );
					acumula += String.valueOf(valor1)+ " * " + String.valueOf(valor2) + " = " + txtResultado.getText() + "\n";
				} else if (sinal == "divisao") {
					txtResultado.setText( String.valueOf(valor1 / valor2).replace(".", ",") );
					acumula += String.valueOf(valor1)+ " / " + String.valueOf(valor2) + " = " + txtResultado.getText() + "\n";
				} else if (sinal == "porcentagem") {
					txtResultado.setText( String.valueOf(valor1 * (valor2/100)).replace(".", ",") );
					acumula += String.valueOf(valor1)+ " % " + String.valueOf(valor2) + " = " + txtResultado.getText() + "\n";
				}
				
				//txtResultado.setText(txtResultado.getText().replace(",", "."));
				
				//acumula no array
				historico.add(acumula);
				
				//resolve o BUG
				valor1 = 0.0;
				valor2 = 0.0;
				
				//Grava no arquivo
				try {
					FileWriter arquivo = new FileWriter("C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\09_Calculadora\\src\\ArmazenaCalc\\arquivo.txt", true);
					PrintWriter gravaArquivo = new PrintWriter(arquivo);
					
					if(historico.size() > 0) {
						for(int x = 0; x < historico.size(); x++) {
							gravaArquivo.print(historico.get(x));
						}
					}
					
					arquivo.close();					
				} catch (IOException e2) {
					// TODO: handle exception
					System.out.println("Erro: "+ e2.getMessage());
				}	
			}
		});
		btnNewButton_13.setBounds(226, 248, 121, 84);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));				
				txtResultado.setText("0");
				sinal = "soma";				
			}
		});
		btnNewButton_14.setBounds(357, 155, 55, 36);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));	
				txtResultado.setText("0");
				sinal = "subtracao";	
			}
		});
		btnNewButton_15.setBounds(357, 202, 55, 36);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("/");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));	
				txtResultado.setText("0");
				sinal = "divisao";
			}
		});
		btnNewButton_16.setBounds(357, 296, 55, 36);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("*");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));	
				txtResultado.setText("0");
				sinal = "multiplicacao";
			}
		});
		btnNewButton_17.setBounds(357, 249, 55, 36);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Hist\u00F3rico");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exibe exb = new Exibe();
				exb.PegaArquivo();
				exb.setVisible(true);
			}
		});
		btnNewButton_18.setBounds(293, 79, 119, 53);
		contentPane.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("<");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rs =	txtResultado.getText();
				if(rs.length() > 0)
				txtResultado.setText(rs.substring(0, rs.length() - 1));
				
			}
		});
		btnNewButton_19.setBounds(292, 154, 55, 36);
		contentPane.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("%");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(String.valueOf(txtResultado.getText()).replace(",", "."));	
				txtResultado.setText("0");
				sinal = "porcentagem";
				
			}
		});
		btnNewButton_20.setBounds(291, 201, 55, 36);
		contentPane.add(btnNewButton_20);
	}
}
