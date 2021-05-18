import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//mostra mensagem com quebra de linha
		System.out.println("Ola, mundo!");
		System.out.println("Bom dia!");
		
		//imprime os valores ja declarado
		System.out.println(y);
		System.out.println(x);
		
		//mostra os valores ja declarado apenas com as casas decimais desejada
		System.out.printf("%.2f%n", x);
		
		//imprime o valor usando ponto e nao virgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//concatenar (juntar) varios elementos em um mesmo comando
		System.out.println("RESULTADO = " + x + " METROS");
		
		//concatenar (juntar) varios textos em um mesmo comando
		System.out.printf("RESULTADO = %.2f metros%n",x);
		
		//concatenar (juntar) varios textos em um mesmo comando
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
