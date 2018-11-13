package gob.vuce.modelo;

import java.io.File;
import java.io.FileWriter;

public class MiException extends Exception {

	private String mensaje;

	public MiException(String mensaje) {
		this.mensaje = mensaje;
	}

	public void miPropiaExcepcion() {
		try {
			/*
			 * para guardar en archivos de texto se utiliza el objeto filewrite
			 */

			FileWriter fw = new FileWriter(new File("logerror.txt"), true);
			fw.append(this.mensaje);
			fw.flush(); // save
			fw.close(); // cerrar
		} catch (Exception e) {
			// no lo guardamos en ningun lado
			System.out.println("no se pudo crear el archivo");
			System.out.println(e.getMessage());
		}
	}

}
