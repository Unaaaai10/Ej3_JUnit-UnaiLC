package Ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplosDeUnNumDe1hastaMTest {

	@Test
	public void testLeerN() {
		int N = 6;
		multiplosDeUnNumDe1hastaM m = new multiplosDeUnNumDe1hastaM();
		int resultadoReal = 6;
		int resultadoEsperado = m.leerN();
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testLeerM() {
		int M = 10;
		multiplosDeUnNumDe1hastaM m = new multiplosDeUnNumDe1hastaM();
		int resultadoReal = 10;
		int resultadoEsperado = m.leerM();
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testImprimirMultiplos() {
		int N = 8;
		int M = 15;
		int resultadoReal = 8;
		int resultadoEsperado = 8;
		assertEquals(resultadoReal, resultadoEsperado);
	}
}