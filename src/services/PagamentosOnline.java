package services;

public interface PagamentosOnline {

	double pagamentos(double valor);

	double parcelas(double valor, int mes);

}
