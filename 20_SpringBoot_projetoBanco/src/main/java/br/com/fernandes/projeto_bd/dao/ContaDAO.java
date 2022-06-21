package br.com.fernandes.projeto_bd.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fernandes.projeto_bd.model.Conta;

@Repository
public interface ContaDAO extends CrudRepository<Conta, Integer>{

}
