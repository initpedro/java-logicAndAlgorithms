package java_logicAndAlgorithms;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.357999;
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		// Altera a formatação para ponto (.) ao invés de vírgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		
		System.out.println("Resultado: " + x + " metros");
		System.out.printf("Resultado: %.2f metros%n", x);
		
		String a = "Fulano";
		int idade = 19;
		double renda = 1000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.", a, idade, renda);
	}

}
