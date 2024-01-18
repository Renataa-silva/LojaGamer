package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome é obrigatorio!")
	@Size(min = 2, max = 100, message = "O nome deve conter no mínimo 05 e no maximo 100 caracteres")
	private String nomedojogo;

	@NotBlank(message = "O tipo de jogo é obrigatorio!")
	@Size(min = 2, max = 100, message = "O tipo de jogo deve conter no mínimo 05 e no maximo 100 caracteres")
	private String tipodejogo;

	@NotBlank(message = "A classificação indicativa do jogo é obrigatorio!")
	@Size(min = 2, max = 100, message = "A classificação indicativa do jogo deve conter no mínimo 05 e no maximo 100 caracteres")
	private String classificacaoindicativa;

	@NotBlank(message = "A plataforma do jogo é obrigatorio!")
	@Size(min = 2, max = 100, message = "A plataforma do jogo deve conter no mínimo 05 e no maximo 100 caracteres")
	private String plataforma;

	@NotBlank(message = "A produtora do jogo é obrigatorio!")
	@Size(min = 2, max = 100, message = "A produtora do jogo deve conter no mínimo 05 e no maximo 100 caracteres")
	private String produtora;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomedojogo() {
		return nomedojogo;
	}

	public void setNomedojogo(String nomedojogo) {
		this.nomedojogo = nomedojogo;
	}

	public String getTipodejogo() {
		return tipodejogo;
	}

	public void setTipodejogo(String tipodejogo) {
		this.tipodejogo = tipodejogo;
	}

	public String getClassificacaoindicativa() {
		return classificacaoindicativa;
	}

	public void setClassificacaoindicativa(String classificacaoindicativa) {
		this.classificacaoindicativa = classificacaoindicativa;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
