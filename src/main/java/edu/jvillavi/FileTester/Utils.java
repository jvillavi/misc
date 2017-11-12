package edu.jvillavi.FileTester;

import java.io.File;

public class Utils {
	
	/**
	 * Obtiene la lista de objetos dentro de un directorio
	 * @param directorio EL directorio a analizar
	 * @return La lista de objetos del directorio
	 * @throws Exception
	 */
	public static File[] obtenerListaObjetos(String directorio)throws Exception{
		
		File root = null;
		File[] objetos = null;
	
		try{
			root = new File(directorio);
			objetos = root.listFiles();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			root = null;
		}
		
		return objetos;
	}
	
}
