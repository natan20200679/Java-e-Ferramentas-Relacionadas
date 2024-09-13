import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {

    @Test
    public void testeSoma() {
        
        Calculadora c = new Calculadora(2, 3);
        
        assertEquals(5.0, c.soma(), 0.001);
    
    }

}
