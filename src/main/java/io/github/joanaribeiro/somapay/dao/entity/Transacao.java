package io.github.joanaribeiro.somapay.dao.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;    
    
    @Column(name = "data_operacao")
    private String data_operacao;

    @Column(name = "tipo_operacao")
    private String tipo_operacao;

    @Column(name = "montante")
    private BigDecimal montante;

    public Transacao() {

    }

    @Override
    public String toString() {
        return String.format("Transacao [id=%d, data_operacao=%s, tipo_operacao=%s, montante=%f]", this.id, this.data_operacao, this.tipo_operacao, this.montante);
    }    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData_operacao() {
		return data_operacao;
	}

	public void setData_operacao(String data_operacao) {
		this.data_operacao = data_operacao;
	}

	public String getTipo_operacao() {
		return tipo_operacao;
	}

	public void setTipo_operacao(String tipo_operacao) {
		this.tipo_operacao = tipo_operacao;
	}

	public BigDecimal getMontante() {
		return montante;
	}

	public void setMontante(BigDecimal montante) {
		montante.setScale(2);
		this.montante = montante;
	}
}