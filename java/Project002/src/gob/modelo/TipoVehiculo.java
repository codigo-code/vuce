package gob.modelo;

public abstract class TipoVehiculo implements IMotor {

	@Override
	public void combustion() {
		System.out.println("la combustion es X");
	}
	
	
}
