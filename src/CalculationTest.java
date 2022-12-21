import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void findMax() {
      //  assertEquals(5,Calculation.findMax(new int[]{3,4,5}));
        assertEquals(-3,Calculation.findMax(new int[]{-3,-4,-5}));
    }


}