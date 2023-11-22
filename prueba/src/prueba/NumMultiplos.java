package prueba;

public class NumMultiplos {

		public static void main(String[] args) {
		        int contador = 0;

		        for (int i = 1; i <= 100; i++) {
		            if (i % 2 == 0 || i % 3 == 0) {
		                System.out.println(i);
		                contador++;
		            }
		        }

		        System.out.println("Hay un total de " + contador + " números múltiplos de 2 o de 3 entre 1 y 100.");
		    }
		
	}

