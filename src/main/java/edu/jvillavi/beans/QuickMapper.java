package edu.jvillavi.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class QuickMapper {
	public static void main(String[] args) {
		
		List<String> dozerConfigs = new ArrayList<String>();
		dozerConfigs.add("MappingCliente.xml");
		
		Mapper mapper = new DozerBeanMapper(dozerConfigs);
		
		ClienteDTO clienteOrigen = new ClienteDTO();
		clienteOrigen.setIdentificacion("0923817043");
		clienteOrigen.setNombres("Jorge");
		clienteOrigen.setApellidos("Villavicencio");
		
		Cliente cliente = mapper.map(clienteOrigen,Cliente.class);
		
		System.out.println(cliente.getId());
	}
}
