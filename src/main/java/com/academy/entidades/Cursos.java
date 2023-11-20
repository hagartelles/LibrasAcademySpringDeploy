package com.academy.entidades;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Cursos extends Entidade {
	
	@Column(name = "nome_curso", nullable = false)
	private String nomeCurso;
	
	@Column(name = "descricao", nullable = false, columnDefinition = "TEXT")
	private String descricao;
	
	@Column(name = "carga_horaria", nullable = false)
	private int carga_horaria;
	
	@Column(name = "num_aulas", nullable = false)
	private int num_aulas;
	
	@Column(name = "ano_lancamento", nullable = false)
	private String anoLancamento;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_id_fk")
    private Professor professor;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "curso_aluno",
        joinColumns = @JoinColumn(name = "curso_id_fk"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id_fk")
        )
	private Set<Aluno> estudantes = new HashSet<>();

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public int getNum_aulas() {
		return num_aulas;
	}

	public void setNum_aulas(int num_aulas) {
		this.num_aulas = num_aulas;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Set<Aluno> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Set<Aluno> estudantes) {
		this.estudantes = estudantes;
	}

	
	
}
