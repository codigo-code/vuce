package gob.vuce.modelo;

public class Perro extends Mamifero {

	private int edad;

	@Override
	public void comer(String... comida) {

		for (int i = 0; i < comida.length; i++) {
			System.out.println(comida[i]);
		}

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, String raza, int edad) {
		super(nombre, raza); // inicializando las variables de la clase abstracta
		this.edad = edad; // inicializamos el atributo de la clase Perro
	}

	@Override
	public String toString() {
		// super invoca a la clase que extiende en la clase q estamos parados
		return "Perro [edad=" + edad + "Mamifero: nombre: " + super.getNombre() + ", raza=" + super.getRaza() + "]";
	}

}
