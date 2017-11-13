package edu.jvillavi.FileTester;

import edu.jvillavi.beans.Cliente;
import edu.jvillavi.beans.ClienteDTO;
import edu.jvillavi.beans.QuickMapper;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Pruebas Unitarias de FileTester
 */
public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Test de metodos regulares
	 */
	public void testListarArchivos() {
		assertTrue(true);
	}
	
	/**
	 * Tests de dozer
	 */
	public void testEjecutarMapper() {
		ClienteDTO clienteOrigen = new ClienteDTO();
		clienteOrigen.setIdentificacion("0923817043");
		clienteOrigen.setNombres("Jorge");
		clienteOrigen.setApellidos("Villavicencio");
		
		QuickMapper mapeador = new QuickMapper();
		
		Cliente cliente = mapeador.bindCliente(clienteOrigen);
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNombres());
		System.out.println(cliente.getApellidos());
		
		assertEquals("0923817043",cliente.getId());
		assertEquals("Jorge",cliente.getNombres());
		assertEquals("Villavicencio",cliente.getApellidos());
	}
}
