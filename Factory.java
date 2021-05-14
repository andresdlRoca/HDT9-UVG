public class Factory{
  public Diccionario getImplementacion(Integer entry){
    if(entry.equals(1))
    return new SplayBST();
    else
    return new HashMapImp();
  }
}