package edu.jvillavi.beans;

import java.util.Arrays;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class QuickMapper {
	
	/**
	 * Convierte el DTOCliente en Cliente
	 * @param clienteOrigen El cliente origen
	 * @return El cliente homologado
	 */
	public Cliente bindCliente(ClienteDTO clienteOrigen) {
		Mapper mapper = new DozerBeanMapper(Arrays.asList("MappingCliente.xml"));
		Cliente cliente = mapper.map(clienteOrigen,Cliente.class);
		
		return cliente;
	}
	
	
	public static void main(String[] args) {
		
		ClienteDTO clienteOrigen = new ClienteDTO();
		clienteOrigen.setIdentificacion("0923817043");
		clienteOrigen.setNombres("Jorge");
		clienteOrigen.setApellidos("Villavicencio");
		
		QuickMapper mapeador = new QuickMapper();
		
		Cliente cliente = mapeador.bindCliente(clienteOrigen);
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNombres());
		System.out.println(cliente.getApellidos());
	}
}
