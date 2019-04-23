package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Festa;

public interface FestaRepository extends JpaRepository<Festa, Integer> {

}
