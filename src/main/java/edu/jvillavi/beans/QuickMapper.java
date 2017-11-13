package edu.jvillavi.beans;

import java.util.Arrays;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class QuickMapper {
	public static void main(String[] args) {
		
		Mapper mapper = new DozerBeanMapper(Arrays.asList("MappingCliente.xml"));
		
		ClienteDTO clienteOrigen = new ClienteDTO();
		clienteOrigen.setIdentificacion("0923817043");
		clienteOrigen.setNombres("Jorge");
		clienteOrigen.setApellidos("Villavicencio");
		
		Cliente cliente = mapper.map(clienteOrigen,Cliente.class);
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNombres());
		System.out.println(cliente.getApellidos());
	}
}
