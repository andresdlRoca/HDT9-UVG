import java.util.HashMap;


public class HashMapImp implements Diccionario{
  
  HashMap<String,String> diccionarioHash = new HashMap<String,String>();

  public void put(String key, String value) {
    diccionarioHash.put(key, value);
  }

  public String get(String key) {
    return diccionarioHash.get(key);
  }

  public boolean contains(String key) {
    return diccionarioHash.containsKey(key);
  }

}