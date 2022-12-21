import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquideType() {
        Cup c = new Cup("Orange juice",88);
        assertEquals("Orange juice",c.getLiquideType());
    }

    @Test
    void getPercentage() {
        Cup c = new Cup("Orange juice",88);
        assertEquals(87,c.getLiquideType());
    }
}