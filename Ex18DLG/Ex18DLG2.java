/*
*
* @author David León Galisteo
* Exámen primer parcial - Ejercicio 2
* 15 de Noviembre de 2016
*/
import java.util.Scanner;

public class Ex18DLG2 {
  public static void main(String[] args) {
    System.out.println("Introduce tantos números como desee. Cuando quiera, introduzca");
    System.out.println("un número negativo para dejar de introducir números.");
    System.out.println("El programa le indicará cuántos números primos ha introducido.");
    System.out.println("_____________________________________________");
        
    Scanner n = new Scanner(System.in);
    int numero = 1;
    int primo = 0;
    boolean esPrimo = true;
    
    do {
     System.out.print("Introduzca un número: ");
     numero = Integer.parseInt(n.nextLine());
     esPrimo = true;
     
      for (int i = 2; i < numero; i++) {// comprueba si es primo
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      } //for
        
      if (esPrimo & numero >= 0) { //si el número es primo aumenta el contador
          primo++;
        }
        
                
    } while (numero >= 0);
  
  System.out.println("\nSe han introducido " + primo + " números primos");
  
}
}
