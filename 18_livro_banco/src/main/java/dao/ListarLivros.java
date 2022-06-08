package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class ListarLivros extends BancoDeDados{
	
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
				list.add(livro);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro" + e);
		}
		return list;
	}

}
