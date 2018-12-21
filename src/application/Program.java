package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Prestacao;
import services.PaypalServicos;
import services.ServicosContrato;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Numero do contrato: ");
			int numero = sc.nextInt();
			System.out.print("Data: ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor do contrato: ");
			double valor = sc.nextDouble();

			Contrato contrato = new Contrato(numero, data, valor);

			System.out.print("Entre com o numero de parcelas:");
			int parcelas = sc.nextInt();

			ServicosContrato servicosContrato = new ServicosContrato(new PaypalServicos());
			servicosContrato.processoContrato(contrato, parcelas);

			System.out.println("Prestações:");
			System.out.println();
			for (Prestacao p : contrato.getPrestacao()) {
				System.out.println(p);
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
