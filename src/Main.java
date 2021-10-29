//import java.util.Scanner;

//Estrutura repetitiva "Enquanto"
//import java.util.Scanner;

//public class Main {
	
//	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		int x, soma;
//		x = sc.nextInt();
//		soma = 0;
		
//		while (x != 0) {
//			soma = soma + x;
//			x = sc.nextInt();
//		}
		
//		System.out.println(soma);
//		sc.close();
//	}
//}
//_________________________________________________________________________________________________
//Estrutura repetitiva "para"
//import java.util.Scanner; 
//public class Main {
	
//	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		int N, soma, x, i;
//		N = sc.nextInt();
//		soma = 0;
		
//		for(i=0; i<N; i++) {
//			x = sc.nextInt();
//			soma = soma + x;
//		}
//		System.out.println(soma);
		
//		sc.close();
//	}
//}
//_____________
//Contagem regressiva
//import java.util.Scanner;
//public class Main{
	
//	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
//		int i;
		
//		for(i=4; i>0; i--) {
//			System.out.println("Valor de i = " + i);
//		}
			
//		sc.close();
//	}
//}
//__________________________________________________________________________________________________
//Estrutura repetitiva faca-enquanto (do-while)
import java.util.Locale;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n): ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}
}