/*
*
* @author David León Galisteo
* Exámen primer parcial - Ejercicio 3
* 15 de Noviembre de 2016
*/
import java.util.Scanner;

public class Ex18DLG3 {
  public static void main(String[] args) {
    System.out.println("Vamos a \"dislocar\" un número introducido por teclado");
    System.out.println("de tal forma que a los números pares le sumaremos 1");
    System.out.println("y a los impares le restaremos 1.");
    System.out.println("____________________________________________");
    System.out.print("\nPor favor, introduzca el número: ");
    
    Scanner n = new Scanner(System.in);
    long numeroIntroducido = Long.parseLong(n.nextLine()); //el usuario introduce el número
    long numero = numeroIntroducido; //guardamos el valor original del número introducido
    int contador = 0; //usaremos ésta variable para conocer la longitud del número introducido
    long volteado = 0;
    
    while (numeroIntroducido > 0) {
      volteado = volteado * 10 + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
      contador++;
    }
    
    System.out.print("\nDislocando el " + numero + " sale el: ");
    
    long cuenta = 0; //usaremos la variable para realizar las operaciones pertinentes al número volteado
    for (int i = 1; i <= contador; i++) {
      cuenta = volteado % 10;
      
      if (cuenta % 2 == 0) {
        cuenta++;
        System.out.print(cuenta);
      } else {
        cuenta--;
        System.out.print(cuenta);
      }
      volteado /= 10;
      
    }//for
  }
}      
