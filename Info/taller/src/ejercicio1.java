import java.util.Scanner;

public class ejercicio1 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el primer nombre: ");
      String nombre1 = scanner.next();
      System.out.println("Ingrese el segundo nombre: ");
      String nombre2 = scanner.next();
      System.out.println("Ingrese el tercer nombre: ");
      String nombre3 = scanner.next();
      System.out.println("Ingrese el cuarto nombre: ");
      String nombre4 = scanner.next();
      System.out.println("Ingrese el quinto nombre: ");
      String nombre5 = scanner.next();

      String[] nombres = {nombre1, nombre2, nombre3, nombre4, nombre5};
      System.out.println(  nombres[4] + nombres[3] + nombres[2] + nombres[1] + nombres[0]);


      scanner.close();
              }
          }




