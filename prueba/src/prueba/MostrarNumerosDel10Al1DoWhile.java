package prueba;

public class MostrarNumerosDel10Al1DoWhile {

    public static void main(String[] args) {
        int numero = 10;

        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);
    }
}