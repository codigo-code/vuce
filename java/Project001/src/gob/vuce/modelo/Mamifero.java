package gob.vuce.modelo;

/***
 * 
 * @author dante.panella
 * @description esta clase es de prueba de mamiferos ble!
 */
public abstract class Mamifero {

	// Getter Setter
	// atributos
	// visibiliad - tipo - nombre de la variable
	private String nombre;
	private String raza;

	// metodos

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) { // <--- es inmutable
		// nombre ="pepe"; // <--- error no se puede sobre-escribir!
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(final String raza) {
		/*
		 * aca no se puede cambiar el valor de raza
		 */
		this.raza = raza;
	}

	// al menos un metodo abstracto
	// aca vienen N comidas
	public abstract void comer(String... comida);

	// metodos no abstractos
	public boolean moverse(boolean vivo) {

		return vivo;
	}

	public Mamifero(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

		
}
