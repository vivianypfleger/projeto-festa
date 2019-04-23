package br.senai.sc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Festa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date data;
	private String endereco_festa;
	private Date hora_inicio;
	private Date hora_fim;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="tema_id")
	private Tema tema;
	
	
	public Festa() {
		
	}


	public Festa(Integer id, Date data, String endereco_festa, Date hora_inicio, Date hora_fim) {
		this.id = id;
		this.data = data;
		this.endereco_festa = endereco_festa;
		this.hora_inicio = hora_inicio;
		this.hora_fim = hora_fim;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getEndereco_festa() {
		return endereco_festa;
	}


	public void setEndereco_festa(String endereco_festa) {
		this.endereco_festa = endereco_festa;
	}


	public Date getHora_inicio() {
		return hora_inicio;
	}


	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}


	public Date getHora_fim() {
		return hora_fim;
	}


	public void setHora_fim(Date hora_fim) {
		this.hora_fim = hora_fim;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festa other = (Festa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	

	
	
	
	
	
	
}
