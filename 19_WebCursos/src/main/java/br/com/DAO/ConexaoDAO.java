package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.com.MODEL.Curso;

public class ConexaoDAO {
	
	//Criando método para conexão
	public Connection conexaoBD() throws ClassNotFoundException {
		Connection connection = null;
		
		String servidor = "jdbc:mysql://localhost/ICARROS";			
		String usuario = "root";
		String senha = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {	
			Class.forName(driver);			
			connection = DriverManager.getConnection(servidor, usuario, senha);
			System.out.println("Conexão feita.");			
		} catch (SQLException ex) {
			// TODO: handle exception
			System.out.println("Erro de conexão: "+ ex.getMessage());
		}
		
		return connection;
	}
	
	//Retornar a lista de cursos
	public List<Curso> listar(){
		List<Curso> cursos = new ArrayList<Curso>();
		
		try {
			Connection con = conexaoBD();
			PreparedStatement ps = con.prepareStatement("select * from icarros.curso");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Curso curso = new Curso();
				
				curso.setId(rs.getInt("id_curso"));
				curso.setNome(rs.getString("nome_curso"));
				curso.setData(rs.getDate("data_curso"));
				curso.setHora(rs.getTime("hora_curso"));
				curso.setDuracao(rs.getInt("duracao_curso"));
				curso.setResumo(rs.getString("resumo_curso"));
				
				cursos.add(curso);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro listar:" + e.getMessage());
		}
		
		return cursos;
	}
	
	public void inserir(Curso curso) {
		try {
			Connection con = conexaoBD();
			
			String pattern = "yyyy/MM/dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(curso.getData());
		    
			PreparedStatement ps = con.prepareStatement(
			"insert into icarros.curso (nome_curso,data_curso,hora_curso,duracao_curso,resumo_curso)"
					+ "values('"+curso.getNome()+"','"+date+"','"+ curso.getHora()+
					"','"+curso.getDuracao()+"','"+curso.getResumo()+"')");
			ps.execute();				
			System.out.println(ps.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	public void deletar(String id) {
		try {
			Connection con = conexaoBD();
			PreparedStatement ps = con.prepareStatement("delete from icarros.curso where id_curso = "+ id);
			ps.execute();
			System.out.println(ps.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao excluir:" + e.getMessage());
		}
	}
	
}
