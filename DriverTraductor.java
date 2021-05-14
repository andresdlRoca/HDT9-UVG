import java.util.Scanner;
import java.io.IOException;

public class DriverTraductor {


  public static void main(String[] args) throws IOException {
    
    boolean run = true;
    Scanner scan = new Scanner(System.in);
    while(run) {
      System.out.println("\nSelecciona la implementacion del traductor\n");
      System.out.println("1. Splay BST");
      System.out.println("2. HashMap\n");
      int implementacion = scan.nextInt();
      
      if(implementacion == 1) {
        System.out.println("Se selecciono Splay BST");
        
      } else if (implementacion == 2) {
        System.out.println("Se selecciono HashMap");
        
      } else {
        System.out.println("No se selecciono una implementacion valida, se utilizara la implementacion de Splay BST.");
        implementacion = 1;
        
      }

      Traduccion traduccion = new Traduccion(implementacion);

      System.out.println("\n---Menu del traductor---\n");
      System.out.println("1. Traducir archivo de texto");
      System.out.println("2. Salir del programa");

      int menuchoice = scan.nextInt();

      if(menuchoice == 1) {
        traduccion.traductor();
      } else if (menuchoice == 2) {
        run = false;
      }

    }    

  }


}