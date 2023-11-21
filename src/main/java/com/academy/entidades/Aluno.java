package com.academy.entidades;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa {
	
	@Column(name = "senha", nullable = false)
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Aluno [senha=" + senha + ", getSenha()=" + getSenha() + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getSexo()=" + getSexo() + ", getTelefone()=" + getTelefone() + ", getEmail()="
				+ getEmail() + ", getDataNascimento()=" + getDataNascimento() + ", getId()=" + getId() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
}
