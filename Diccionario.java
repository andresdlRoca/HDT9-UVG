public interface Diccionario {

  String get(String key);

  void put(String key, String value);

  boolean contains(String key);

}