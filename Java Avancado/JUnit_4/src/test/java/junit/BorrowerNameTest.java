package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import beginSecure.BorrowerName;
import static org.junit.jupiter.api.Assertions.*;

class BorrowerNameTest {

    private BorrowerName borrowerName;

    @BeforeEach
    void setUp() {
        
        borrowerName = new BorrowerName();
    
    }

    @Test
    void getFullName() {
    
        borrowerName.setFirstName("lisa");
        borrowerName.setLastName("simpson");
    
        assertEquals("LISA SIMPSON",borrowerName.getFullName());
    
    }

    @Test
    void getFirstName() {
    
        borrowerName.setFirstName("bart");
    
        assertEquals("bart",borrowerName.getFirstName());
    
    }

    @Test
    void getLastName() {
    
        borrowerName.setLastName("simpson");
    
        assertEquals("simpson",borrowerName.getLastName());
    
    }

}