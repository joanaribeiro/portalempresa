package io.github.joanaribeiro.somapay.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @Column(name = "matricula")
    private int matricula;

    @Column(name = "nome")
    private String nome;

    @Column(name = "funcao")
    private String funcao;

    public Funcionario() {

    }

    @Override
    public String toString() {
        return String.format("Funcionario [matricula=%d, nome=%s, funcao=%s]", this.matricula, this.nome, this.funcao);
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
