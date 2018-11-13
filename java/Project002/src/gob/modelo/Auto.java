package gob.modelo;

public class Auto {

	private String marca;
	private String modelo;
	
	public void tipoVehiculo(IMotor motor) {
		motor.combustion("Se inverten los roles y esto es lo q sale x la consola"); // 
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
