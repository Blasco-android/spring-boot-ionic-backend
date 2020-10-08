package com.blascoweb.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blascoweb.cursomc.domain.Endereco;

@Repository //Operações de acesso a Dados
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{	
	
	

}
