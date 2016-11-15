/*
*
* @author David León Galisteo
* Exámen primer parcial - Ejercicio 1
* 15 de Noviembre de 2016
*/
import java.util.Scanner;

public class Ex18DLG1 {
  public static void main(String[] args) {
    System.out.println("Bienvenido a la pastelería on-line.");
    System.out.println("Por favor escoja el tipo de tarta que desee.");
    System.out.print("manzana, fresa o chocolate: ");
    
    Scanner s = new Scanner(System.in);
    String sabor = s.nextLine();
    
    int precioBase = 0; //precio base de la tarta
    double precioNata = 0;
    double precioNombre = 0;
    String chocolate = " ";
    
    if (sabor.equals("chocolate")) {
      System.out.print("\n¿Qué tipo de chocolate quiere? (negro o blanco): ");
      chocolate = s.nextLine();
        if (chocolate.equals("negro")) {
          precioBase = 14;
        } else {
          precioBase = 15;
      }
    } 
      
      if (sabor.equals("manzana")) {
        precioBase = 18;
      } else if (sabor.equals("fresa")) {
        precioBase = 16;
      } 
    
  
    
    System.out.print("\n¿Quiere nata? (si o no): ");
    String nata = s.nextLine();
    if (nata.equals("si")) {
      precioNata = 2.50;
    }
    
    System.out.print("\n¿Quiere ponerle un nombre? (si o no): ");
    String nombre = s.nextLine();
    if (nombre.equals("si")) {
      precioNombre =2.75;
    }
    
    System.out.print("\nTarta de " + sabor + " " + chocolate + " " + precioBase);
    
    if (nata.equals("si")) {
      System.out.print("\nCon nata: " + precioNata);
    }
    if (nombre.equals("si")) {
      System.out.print("\nCon nombre: " + precioNombre);
    }
    
    double total = precioBase + precioNata + precioNombre;
    System.out.print("\nTotal: " + total);
    
    
  }
}
