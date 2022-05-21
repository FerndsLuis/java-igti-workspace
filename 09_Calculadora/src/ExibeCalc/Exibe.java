package ExibeCalc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exibe extends JFrame {

	private JPanel contentPane;
	static String armazenaHistorico = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibe frame = new Exibe();
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
	public Exibe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hist\u00F3rico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(158, 11, 108, 40);
		contentPane.add(lblNewLabel);
		
		JTextPane txtResultado = new JTextPane();
		txtResultado.setBounds(75, 62, 287, 188);
		contentPane.add(txtResultado);	
		
		
		PegaArquivo();
		txtResultado.setText(armazenaHistorico);		
	}
	
	
	
	public void PegaArquivo() {
		try {
			String linha = "";
			String caminhoAr = "C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\09_Calculadora\\src\\ArmazenaCalc\\arquivo.txt";
			
			//abrir o arquivo
			File arquivo = new File(caminhoAr);
			
			if(arquivo.exists())
			{
				FileReader reader = new FileReader(arquivo);
				BufferedReader leitor = new BufferedReader(reader);
				
				while(true)
				{
					linha = leitor.readLine();
					if(linha != null)linha = linha.replace(".", ",");
					armazenaHistorico += linha + "\n";
					System.out.println(linha);
					
					//forçar a saída					
					if(linha == null) break;
				}
			}
			
		} catch (IOException e2) {
			// TODO: handle exception
			System.out.println("Erro: "+ e2.getMessage());
		}
	}
	
	
}
