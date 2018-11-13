package gob.vuce.controlador;

import gob.vuce.modelo.Conejo;
import gob.vuce.modelo.Mamifero;
import gob.vuce.modelo.MiException;
import gob.vuce.modelo.Perro;
import gob.vuce.modelo.TipoMamifero;

public class MamiferoControlador {

	public void creoMamifero() {

		// factoria abstracta
		Mamifero m1 = new Perro(); // la clase abstracta inicializada con la extendida

		m1.setNombre("Sparkly");
		m1.setRaza("Boxer");
		// opcion A
//		if (m1 instanceof Perro) {
//			Perro itemPerro = (Perro) m1;
//			System.out.println(m1.getNombre());
//			System.out.println(m1.getRaza());
//			itemPerro.setEdad(10);
//		}

		// casteo
		((Perro) m1).setEdad(10);

		System.out.println(m1);
	}

	// factoria de metodos
	public Mamifero creoMamifero(TipoMamifero tmamifero) throws MiException {

		switch (tmamifero) {
		case PERRO:
			return new Perro();

		case CONEJO:
			return new Conejo(); // x ejemplo desde aqui vuelvo a quien lo llame

		default:
			System.out.println("no conozco el tipo");

			throw new MiException("No se creo aun el objeto caballo");
		}

	}

}
