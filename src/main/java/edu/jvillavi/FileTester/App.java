package edu.jvillavi.FileTester;

import java.io.File;

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
	 * Punto de entrada
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Archivos en directorio actual");
		
		App aplicacion = new App();
		aplicacion.mostrarArchivosDirectorio("/home/jvillavi");
		
		aplicacion = null;
	}
}
