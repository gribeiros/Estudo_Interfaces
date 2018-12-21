package services;

public class PaypalServicos implements PagamentosOnline {

	private static final double PORCENTAGEM = 0.02;
	private static final double PARCELAS_VALOR = 0.01;

	@Override
	public double pagamentos(double valor) {

		return valor * PORCENTAGEM;
	}

	@Override
	public double parcelas(double valor, int mes) {

		return valor * PARCELAS_VALOR* mes;
	}

}
