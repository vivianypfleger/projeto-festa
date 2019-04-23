package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.repositories.ClienteRepository;
import br.senai.sc.repositories.FestaRepository;
import br.senai.sc.repositories.TemaRepository;

@SpringBootApplication
public class ProjetoFestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFestaApplication.class, args);
	}

	@Autowired
	private ClienteRepository Repocliente;
	
	@Autowired
	private FestaRepository Repofesta;
	
	@Autowired
	private TemaRepository Repotema;
	
	
	
	
	
}
