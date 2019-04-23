package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Tema;

public interface TemaRepository extends JpaRepository<Tema, Integer>{

}
