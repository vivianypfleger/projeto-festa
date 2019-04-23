package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
