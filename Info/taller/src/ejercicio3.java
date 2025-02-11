import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del que quieres saber sus tablas: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <=10; i++) {
             int resultado = numero * i;
             System.out.println(resultado);
        }

    }
}
