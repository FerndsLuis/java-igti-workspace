package br.com.fernandes.projeto_bd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernandes.projeto_bd.dao.ContaDAO;
import br.com.fernandes.projeto_bd.model.Conta;

@RestController
public class ContaController {
	
	@Autowired
	private ContaDAO dao;
	
	@GetMapping("/conta")
	
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		
		lista = (ArrayList<Conta>) (dao.findAll());
		return lista;
	}
}
