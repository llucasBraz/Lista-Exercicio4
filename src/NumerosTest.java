package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {

    @Test
    public void testMaximo() {
        Numeros numeros = new Numeros(10, 20, 30);
        assertEquals(30, numeros.maximo());
    }

    @Test
    public void testMinimo() {
        Numeros numeros = new Numeros(10, 20, 30);
        assertEquals(10, numeros.minimo());
    }
}
