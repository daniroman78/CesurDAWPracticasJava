package prueba;
import java.util.Scanner;
public class PidaNumHastaPositivo {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int numero;
	        do {
	            System.out.print("Introduce un número positivo: ");
	            numero = sc.nextInt();
	        } while (numero < 0);

	        System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");
	        for (int i = numero + 1; i <= numero + 20; i++) {
	            System.out.println(i);
	        }
	    }
	}