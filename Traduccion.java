import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList;
import java.util.List;

public class Traduccion {

  Diccionario diccionario;

  public Traduccion(int implementacion) throws IOException {
    
    Factory factory = new Factory();
    
    if(implementacion == 1) {//Splay BST
      diccionario = factory.getImplementacion(1);
    } else {//HashMap
      diccionario = factory.getImplementacion(2);
    }

    BufferedReader abc = new BufferedReader(new FileReader("palabras.txt"));
    List<String> lines = new ArrayList<String>();
    String line = "";
    while((line = abc.readLine()) != null) {
      lines.add(line);
    }
    abc.close();

    String[] data = lines.toArray(new String[]{});
    for (int i = 0; i < data.length; i++) {
        String[] arr = data[i].split(",");
        diccionario.put(arr[0],arr[1]);
    }

    System.out.println("Recorrido Diccionario: ");
    for (int i = 0; i < data.length; i++) {
      String[] arr = data[i].split(",");
      System.out.println(diccionario.get(arr[0]));
    }

  }

  public void traductor() throws IOException {
    BufferedReader abc = new BufferedReader(new FileReader("texto.txt"));
    List<String> lines = new ArrayList<String>();
    String line = "";
    while((line = abc.readLine()) != null) {

        lines.add(line);

    }
    abc.close();

    String[] data = lines.toArray(new String[]{});

    String oracion = data[0];
    String oraciontraducida = "";
    String[] oracionpartida = oracion.split(" ");
    for (int i = 0; i < oracionpartida.length; i++){
        if(diccionario.contains(oracionpartida[i])) {
            String[] arraypalabras = diccionario.get(oracionpartida[i]).split(",");
            oracionpartida[i] = " "+arraypalabras[0]+" ";
        } else {
            String palabra = " *"+oracionpartida[i]+"* ";
            oracionpartida[i] = palabra;
        }
        oraciontraducida = oraciontraducida.concat(oracionpartida[i]);
    }
    System.out.println("Traduccion: " + oraciontraducida);
  }

}