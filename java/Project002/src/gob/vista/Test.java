package gob.vista;

import gob.modelo.Auto;
import gob.modelo.IMotor;

public class Test {

	public static void main(String[] args) {

		// Generarte un evento de una interfaz

		Auto a1 = new Auto();

		// implementacion de una interfaz x medio de una clase anonima
		a1.tipoVehiculo(new IMotor() {

			@Override
			public void combustion(String tipoCombustible) {

				System.out.println(tipoCombustible);

			}

			@Override
			public void combustion() {
				// TODO Auto-generated method stub

			}

			@Override
			public void combustion(double volumenCombistible) {
				// TODO Auto-generated method stub
				System.out.println("soy una sobre-escritura desde la clase test");
			}
		});
	}

}
