package Form;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;

public class Relatorio extends JFrame {

	private JPanel contentPane;

	public ArrayList<String> dados = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio frame = new Relatorio();
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
	public Relatorio() {
		String nomeArquivo = "C:\\Users\\luish\\Documents\\Estudo\\java-igti-workspace\\13_Media_Tablea_Jlist_Arquivo\\src\\Form\\arquivo.txt";
		String linha = "";
		
		File arquivo = new File(nomeArquivo);
		
		//verificando se o arquivo existe
		if(arquivo.exists())
		{			
			try {
				//lendo
				FileReader reader = new FileReader(arquivo);				
				//Colocando na memória
				BufferedReader leitor = new BufferedReader(reader);
				
				while(true)
				{
					//forçar a saída					
					if(linha == null) break;
					
					linha = leitor.readLine();
					dados.add(linha);					
				}				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Erro: " + e.getMessage());
			}
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList(dados.toArray());
		list.setBounds(10, 64, 805, 352);
		contentPane.add(list);
				
		JLabel lblNewLabel = new JLabel("Relat\u00F3rio:");
		lblNewLabel.setBounds(10, 37, 59, 14);
		contentPane.add(lblNewLabel);
	}

}
