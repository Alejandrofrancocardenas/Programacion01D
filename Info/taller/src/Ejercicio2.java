import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int primero = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int segundo = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        int tercero = Integer.parseInt(scanner.nextLine());

        if (primero == segundo && segundo == tercero) {
            System.out.println("Los tres numeros son iguales." + primero);
        scanner.close();
        return;
        }

        int[] numeros = {primero, segundo, tercero};

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j] + 1) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("El mayor es: " + numeros[2]);


        scanner.close();
    }
}