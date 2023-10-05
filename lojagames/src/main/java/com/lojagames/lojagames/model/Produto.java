package com.lojagames.lojagames.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_products")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo name é obrigatório")
	@Size(min = 2, max = 150, message = "O atributo name deve conter no mínimo 02 caracteres, e no máximo 150")
	private String name;
	
	@NotBlank(message = "O atributo description é obrigatório")
	@Size(min = 10, max = 2000, message = "O atributo description deve conter no mínimo 10 caracteres, e no máximo 2000")
	private String description;
	
	@NotBlank(message = "O atributo brand é obrigatório")
	@Size(min = 2, max = 150, message = "O atributo brand deve conter no mínimo 02 caracteres, e no máximo 150")
	private String brand;
	
	@Digits(integer = 5, fraction = 2)
	private BigDecimal price;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
	
	

}
