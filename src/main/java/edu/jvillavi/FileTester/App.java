package edu.jvillavi.FileTester;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;

import edu.jvillavi.entidades.Cliente;
import edu.jvillavi.hibernate.HibernateUtil;

/**
 * Punto de entrada aplicacion
 * @author jvillavi
 *
 */
public class App {
	
	/**
	 * Muestra los archivos dentro del directorio indicado
	 * @param directorio Directorio de consulta
	 */
	public void mostrarArchivosDirectorio(String directorio) {
		try {
			
			StringUtils.capitalize("Alfa");
			
			File[]archivos = Utils.obtenerListaObjetos("/home/jvillavi");
			
			if(archivos!=null) {
				for(File archivo:archivos) {
					
					String tipo = (archivo.isDirectory())?"D":"F";
					System.out.println("["+tipo+"] - "+archivo.getName());
				}
				
				archivos = null;
			}
			
		} catch (Exception e) {
			System.out.println("No hay archivos que mostrar");
		}
	}
	
	/**
	 * Permite listar clientes de la DB
	 * @return La lista de clientes encontrados
	 * @throws Exception El error encontrado
	 */
	public List<Cliente> listarClientesDB()throws Exception{
		Session ses = HibernateUtil.getSessionFactory().openSession();
		
		List<Cliente> clientes = null;
		
		clientes = ses.createCriteria(Cliente.class).list();
		
		//ses.save(cliente);
		//ses.flush();
		
		ses.close();
		ses = null;
		
		return clientes;
	}
	
	/**
	 * Punto de entrada
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Archivos en directorio actual");
		
		App aplicacion = new App();
		aplicacion.mostrarArchivosDirectorio("/home/jvillavi");
		
		List<Cliente> clientes;
		try {
			clientes = aplicacion.listarClientesDB();
			for(Cliente cliente:clientes){
				System.out.println(cliente.getNombres() + " " +cliente.getApellidos());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		aplicacion = null;
	}
}
