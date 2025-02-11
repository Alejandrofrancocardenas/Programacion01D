import java.util.HashMap;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la lista de numeros: ");
        String input = scanner.nextLine();


        int[] numeros = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numeros[i] = Character.getNumericValue(input.charAt(0));
        }
            HashMap<Integer, Integer> frecuencia = new HashMap<>();
            for (int num : numeros) {
                frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            }
            int numeromasRepetido = numeros[0];
            int maxfrecuencia = 0;

            for (int num : frecuencia.keySet()) {
                if (frecuencia.get(num) > maxfrecuencia) {
                    maxfrecuencia = frecuencia.get(num);
                    numeromasRepetido = num;

                }
            }
            System.out.println("El numero mas repetido es:" + numeromasRepetido);
            

        }
    }


