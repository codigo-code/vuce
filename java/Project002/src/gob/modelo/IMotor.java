package gob.modelo;

public interface IMotor {

	
	// sobre-carga de metodos
	//JAVA 5
	public abstract void combustion();
	

	//JAVA 7
	public void combustion(String tipoCombustible);
	
	
	
	//JAVA 8
	public default void combustion(double volumenCombistible) {
		//hacer el metodo X
		System.out.println("si alcanza X entonces "+ volumenCombistible);
	}
	
	
}
