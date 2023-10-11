package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity /*anotação que implica que essa classe será um Model*/
@Table(name = "tb_postagens")

public class Postagem {
	
	@Id /*PRIMARY KEY(id)*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*auto informated*/
	private Long id; /*atributo/campo da tabela*/
	
	@NotBlank(message = "O atributo título é obrigatório") /*não pode ser vazio; mais restritiva que a not null*/
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 caracteres, e no máximo 100")/*delimita o campo*/
	private String titulo; /*atributo/campo da tabela*/
	
	@NotBlank(message = "O atributo texto é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 caracteres, e no máximo 1000")
	private String texto; /*atributo/campo da tabela*/
	
	@UpdateTimestamp /*registra a data/hora*/
	private LocalDateTime data; /*atributo/campo da tabela*/
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
