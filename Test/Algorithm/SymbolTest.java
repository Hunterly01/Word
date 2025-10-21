package Algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SymbolTest {
    @Test
    public void SymbolTest() {
        Symbol S = new Symbol();
        String pie = "{([}";
        boolean result = Symbol.task(pie);
        boolean actual = true;
        assertEquals(result, actual);
    }

}
