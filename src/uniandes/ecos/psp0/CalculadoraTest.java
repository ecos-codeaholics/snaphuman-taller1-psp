package uniandes.ecos.psp0;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by snaphuman on 2/2/16.
 */
public class CalculadoraTest {

    private final static double precision = 0.01;

    @Test
    public void calcularDesviacion() {

        double lista[] = new double[4];

        lista[0] = 300;
        lista[1] = 45.6;
        lista[2] = 32;
        lista[3] = 21;

        double result = Calculadora.calcularDesviacion(lista);
        assertEquals(133.94, result, precision);
    }

    @Test
    public void calcularMediaAritmetica() {

        double lista[] = new double[4];

        lista[0] = 300;
        lista[1] = 45.6;
        lista[2] = 32;
        lista[3] = 21;

        double result = Calculadora.calcularMediaAritmetica(lista);
        assertEquals(99.65, result, precision);
    }

    @Test
    public void verificarLista() {

        double lista[] = new double[2];

        boolean valido = Calculadora.verificarLista(lista);

        assertEquals(true, valido);
    }

}
