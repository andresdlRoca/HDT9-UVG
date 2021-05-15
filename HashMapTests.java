import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que se encarga de realizar pruebas unitarias a la implementacion de VectorHeap
 * @author Andres de la Roca 20332
 */
public class HashMapTests{
    HashMapImp hashmap = new HashMapImp();

    @Test
    public void TestAgregarYSacar() {
        hashmap.put("Monkey", "Mono");
        assertEquals("Mono", hashmap.get("Monkey"));
    }
}