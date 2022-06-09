package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Livro;

public class BancoDeDados {

	public static Connection Conectar() {
		Connection connection = null;
		
		String servidor = "jdbc:mysql://localhost/ICARROS";
		
		String usuario = "root";
		String senha = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(servidor, usuario, senha);			
		} catch (Exception e) {
			System.err.print("Error ao conectar: " + e.getMessage());
		}	
		
		return connection;
	}	
	
	public static List<Livro> lista(){
		List<Livro> list = new ArrayList<Livro>();
		
		try {
			Connection con = Conectar();
			PreparedStatement ps = con.prepareStatement("select * from icarros.livros");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Livro livro =  new Livro();
				livro.setId(rs.getInt("id_livro"));
				livro.setNome(rs.getString("nome_livro"));
				livro.setAutor(rs.getString("autor_livro"));
				livro.setEditora(rs.getString("editora_livro"));
				livro.setData_lancamento(rs.getDate("data_lancamento"));
				list.add(livro);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro" + e);
		}
		return list;
	}
	
	public static List<Livro> buscaLivro(String busca){
		List<Livro> list = new ArrayList<Livro>();
		
		try {
			Connection con = Conectar();
			PreparedStatement ps = con.prepareStatement("select * from icarros.livros where nome_livro like '%"+ busca +"%' ");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Livro livro =  new Livro();
				livro.setId(rs.getInt("id_livro"));
				livro.setNome(rs.getString("nome_livro"));
				livro.setAutor(rs.getString("autor_livro"));
				livro.setEditora(rs.getString("editora_livro"));
				livro.setData_lancamento(rs.getDate("data_lancamento"));
				list.add(livro);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro" + e);
		}
		return list;
	}
	
	public static void inserir(Livro livro){
		try {
			Connection con = Conectar();
			
			String pattern = "yyyy/MM/dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(livro.getData_lancamento());
		    
			PreparedStatement ps = con.prepareStatement("insert into icarros.livros (nome_livro,autor_livro,editora_livro,data_lancamento)"
					+ "values('"+livro.getNome()+"','"+livro.getAutor()+"','"+ livro.getEditora()+"','"+date+"')");
			ps.execute();				
			//System.out.println(ps.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
}
