package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer Numero;
	private Date contatoDate;
	private Double contratoValor;
	
	private List<Prestacao> prestacoes = new ArrayList<>();

	public Contrato() {}
	
	public Contrato(Integer numero, Date contatoDate, Double contratoValor) {
		Numero = numero;
		this.contatoDate = contatoDate;
		this.contratoValor = contratoValor;
	}


	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public Date getContatoDate() {
		return contatoDate;
	}

	public void setContatoDate(Date contatoDate) {
		this.contatoDate = contatoDate;
	}

	public Double getContratoValor() {
		return contratoValor;
	}


	public List<Prestacao> getPrestacao() {
		return prestacoes;
	}

	public void addPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}

}

