package br.senai.sc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Tema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String item;
	private String cor_toalha;
	private Double valor;
	
	
	@OneToMany(mappedBy="tema")
	private Festa festa;
	
	@OneToMany(mappedBy="cliente")
	private Cliente cliente;
	
	
	
	public Tema() {
		
	}


	public Tema(Integer id, String item, String cor_toalha, Double valor) {
		this.id = id;
		this.item = item;
		this.cor_toalha = cor_toalha;
		this.valor = valor;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getCor_toalha() {
		return cor_toalha;
	}


	public void setCor_toalha(String cor_toalha) {
		this.cor_toalha = cor_toalha;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
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
		Tema other = (Tema) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
