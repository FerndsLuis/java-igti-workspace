package imagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormImagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormImagem frame = new FormImagem();
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
	public FormImagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de Gerenciamento de Bandeira");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 22, 390, 14);
		contentPane.add(lblNewLabel);
		
		// Criando uma variável do tipo array de países
		String[]  paises = {"brasil", "italia", "mexico", "alemanha"};
		
		//local para apresentação da bandeira
		JLabel bandeira = new JLabel("bandeira");
		bandeira.setHorizontalAlignment(SwingConstants.CENTER);
		bandeira.setBounds(147, 66, 277, 184);
		contentPane.add(bandeira);
		
		JList list = new JList(paises);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//criando uma variável para capturar 
				int index = list.getSelectedIndex();
				
				// recebe o nome do pais
				String pais = paises[index];
				
				//vinculado nome com a bandeira em imagem
				bandeira.setIcon(new ImageIcon(getClass().getResource("../img/"+pais+".png")));
			}
		});
		list.setBounds(25, 66, 112, 184);
		contentPane.add(list);
		
		
	}
}
