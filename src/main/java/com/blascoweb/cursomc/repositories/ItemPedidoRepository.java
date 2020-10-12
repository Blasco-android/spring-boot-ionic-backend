package com.blascoweb.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blascoweb.cursomc.domain.ItemPedido;

@Repository //Operações de acesso a Dados
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{		

}
