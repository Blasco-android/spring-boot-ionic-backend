package com.blascoweb.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.blascoweb.cursomc.domain.Cliente;

@Repository //Operações de acesso a Dados
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{	
	
	@Transactional(readOnly = true)
	Cliente findByEmail(String email);

}
