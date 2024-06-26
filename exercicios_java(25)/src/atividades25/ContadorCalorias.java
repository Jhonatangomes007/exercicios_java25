package atividades25;

	import java.util.Scanner;

	public class ContadorCalorias {
		public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);

	    	// Arrays com as calorias correspondentes
	    	int[] caloriasPratos = {180, 230, 250, 350};
	    	int[] caloriasSobremesas = {75, 110, 170, 200};
	    	int[] caloriasBebidas = {20, 70, 100, 65};

	    	// Exibindo menu e capturando a escolha do usuário para o prato
	    	System.out.println("Escolha o prato:");
	    	System.out.println("1 - Vegetariano (180 calorias)");
	    	System.out.println("2 - Peixe (230 calorias)");
	    	System.out.println("3 - Frango (250 calorias)");
	    	System.out.println("4 - Carne (350 calorias)");
	    	System.out.print("Digite o número da sua escolha: ");
	    	int escolhaPrato = scanner.nextInt();

	    	// Exibindo menu e capturando a escolha do usuário para a sobremesa
	    	System.out.println("Escolha a sobremesa:");
	    	System.out.println("1 - Abacaxi (75 calorias)");
	    	System.out.println("2 - Sorvete diet (110 calorias)");
	    	System.out.println("3 - Mousse diet (170 calorias)");
	    	System.out.println("4 - Mousse chocolate (200 calorias)");
	    	System.out.print("Digite o número da sua escolha: ");
	    	int escolhaSobremesa = scanner.nextInt();

	    	// Exibindo menu e capturando a escolha do usuário para a bebida
	    	System.out.println("Escolha a bebida:");
	    	System.out.println("1 - Chá (20 calorias)");
	    	System.out.println("2 - Suco de laranja (70 calorias)");
	    	System.out.println("3 - Suco de melão (100 calorias)");
	    	System.out.println("4 - Refrigerante diet (65 calorias)");
	    	System.out.print("Digite o número da sua escolha: ");
	    	int escolhaBebida = scanner.nextInt();

	    	// Calculando o total de calorias
	    	int totalCalorias = caloriasPratos[escolhaPrato - 1] +
	                        	caloriasSobremesas[escolhaSobremesa - 1] +
	                        	caloriasBebidas[escolhaBebida - 1];

	    	// Exibindo o resultado
	    	System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias + " calorias.");

	    	scanner.close();
		}
	}

