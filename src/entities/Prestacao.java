package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date pData;
	private Double Valor;
	
	public Prestacao(Date pData, Double valor) {
		this.pData = pData;
		Valor = valor;
	}


	public Date getpData() {
		return pData;
	}

	public void setpData(Date pData) {
		this.pData = pData;
	}

	public Double getValor() {
		return Valor;
	}

	@Override
	public String toString() {
		return sdf.format(pData)+" - "+String.format("%.2f",Valor);
	}

}
