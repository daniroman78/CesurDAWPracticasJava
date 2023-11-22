package prueba;

import java.util.Scanner;

public class NumOrdenados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = sc.nextInt();

        System.out.print("¿Desea ordenar los números de forma ascendente (A) o descendente (D)? ");
        String orden = sc.next();

        // Ordenamos los números
        if (orden.equals("A")) {
            if (numero1 > numero2) {
                int aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            }
            if (numero1 > numero3) {
                int aux = numero1;
                numero1 = numero3;
                numero3 = aux;
            }
            if (numero2 > numero3) {
                int aux = numero2;
                numero2 = numero3;
                numero3 = aux;
            }
        } else if (orden.equals("D")) {
            if (numero1 < numero2) {
                int aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            }
            if (numero1 < numero3) {
                int aux = numero1;
                numero1 = numero3;
                numero3 = aux;
            }
            if (numero2 < numero3) {
                int aux = numero2;
                numero2 = numero3;
                numero3 = aux;
            }
        } else {
            System.out.println("El orden introducido no es válido.");
            return;
        }

        // Mostramos los números ordenados
        System.out.println("Los números ordenados son:");
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
    }
}
