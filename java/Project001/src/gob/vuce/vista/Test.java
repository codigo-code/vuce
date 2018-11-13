package gob.vuce.vista;

import gob.vuce.controlador.MamiferoControlador;
import gob.vuce.modelo.Mamifero;
import gob.vuce.modelo.MiException;
import gob.vuce.modelo.Perro;
import gob.vuce.modelo.TipoMamifero;

// ctrl + shift + o

/*
 * para generar los getter y setter
 * 
 * alt +shift + s    ... r
 * 
 * para los contructores + constructores de la super clase
 * alt +  shift + s ... c
 */

public class Test {

	public static void main(String[] args) {

		MamiferoControlador mc = new MamiferoControlador();

		mc.creoMamifero();

		Mamifero m1;
		try {
			m1 = mc.creoMamifero(TipoMamifero.CABALLO);
			try {
				m1.setNombre("Bobby");
				m1.setRaza("salchicha");
				((Perro) m1).setEdad(2);
				System.out.println(m1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				// hay un solo caso donde no llega aqui... ni
				// database.close() <--- pooom!!! puede sere q no termine la ejecucion

			}
		} catch (MiException e1) {
			e1.miPropiaExcepcion();
		}

		System.out.println("fin del programa");

	}

}
