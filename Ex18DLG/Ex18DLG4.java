/*
*
* @author David León Galisteo
* Exámen primer parcial - Ejercicio 4
* 15 de Noviembre de 2016
*/
import java.util.Scanner;

public class Ex18DLG4 {
  public static void main(String[] args) {
    System.out.println("Vamos a dibujar una pirámide maya a través de una altura");
    System.out.println("introducida por teclado.");
    System.out.println("_____________________________________________");
    System.out.print("\nPor favor, introduzca la altura (entero mayor o igual a 3): ");
    
    Scanner n = new Scanner(System.in);
    int alturaIntroducida = Integer.parseInt(n.nextLine());
    
    
    int asteriscos = 2;
    int lineaAsteriscos = 6;
    int espacios = 4;
    int espaciosExternos = alturaIntroducida - 1;
    int altura = 1;
    
    System.out.println();
    
    //////////////////////7 pirámide maya
    for (int i = 1; i <= alturaIntroducida; i++) {
      
      for (int e = 1; e <= espaciosExternos; e++) { //inserta espacios
        System.out.print(" ");
      }
      
      for (int j = 1; j <= lineaAsteriscos; j++) { //pinta la línea completa de asteríscos
        System.out.print("*");
      }
      
      System.out.println();
      espaciosExternos--;
      altura++;
      i++;
      
      if (altura <= alturaIntroducida) {
        ////////////////// pinta la linea con huecos    
        for (int y = 1; y <= espaciosExternos; y++) {
          System.out.print(" ");
        }
        
        for (int z = 1; z <= asteriscos; z++) {
          System.out.print("*");
        }
        
        for (int x = 1; x <= espacios; x++) {
          System.out.print(" ");
        }
        
        for (int w = 1; w <= asteriscos; w++) {
          System.out.print("*");
        }
      } 
      
      altura++;
      System.out.println();
      asteriscos += 2;
      lineaAsteriscos += 4;
      espaciosExternos--;
      }
                
  }
}
      
