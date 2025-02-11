//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void main (String []args) {

        int num1 = 4;
        int num2 = 1;
        int num3 = 2;

        if(num1 == num2 && num2 == num3) {
            System.out.println("Los tres numeros son iguales");
        }else if(num1 > num2 && num1> num3) {
            System.out.println("El numero mayor es: " + num1);
        }else if(num2 >num1 && num2> num3) {
            System.out.println("El numero mayor es: " + num2);
        }else if(num3 >num1 && num3>num2){
            System.out.println("El numero mayor es: " + num3);
        }

        }



    }


//CamelCase = sumarNumeros ();
//PascalCase = SumarNumeros;

//SnakeCase = sumar_numeros();
//KebabCase = sumar-numeros();