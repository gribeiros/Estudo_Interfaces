package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Prestacao;

public class ServicosContrato {

	private PagamentosOnline pagamentosOnline;

	public ServicosContrato(PagamentosOnline pagamentosOnline) {
		this.pagamentosOnline = pagamentosOnline;
	}

	public void processoContrato(Contrato contrato, int mes) {
		double valorBasico = contrato.getContratoValor() / mes;
		for (int a = 1; a <= mes; a++) {
			Date data = addMes(contrato.getContatoDate(), a);
			double contratoAtualizado = valorBasico + pagamentosOnline.parcelas(valorBasico, a);
			double valorTotal = contratoAtualizado + pagamentosOnline.pagamentos(contratoAtualizado);
			contrato.addPrestacao(new Prestacao(data,valorTotal));
		}
	}

	private Date addMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
