import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la lista de numeros: ");
        String input = scanner.nextLine();

        int[] numeros = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numeros[i] = Character.getNumericValue(input.charAt(i));


        }
        Arrays.sort(numeros);

        System.out.println("Los numeros ingresados en forma ascendete serian: ");
        for(int num: numeros){
            System.out.println(num + " ");
        }
        scanner.close();
    }

}