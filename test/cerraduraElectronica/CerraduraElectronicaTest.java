package cerraduraElectronica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraElectronicaTest {

	@Test
	void test() {
		CerraduraElectronica cerradura = new CerraduraElectronica();
		assertTrue(cerradura.estaAbierta());
	}

}
