package clase_vehiculo;

public class Coche extends Vehiculo {
	
	private int plazas;
	
	Coche (){
	super();		
	}

	Coche (String marca, String modelo, int autonomia, int plazas, Rueda [] ruedas){
	
		super(marca, modelo, autonomia,ruedas);
		
//		setMarca(marca);
//		setModelo(modelo);
//		setAutonomia(autonomia);
		
		this.plazas = plazas;
		
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	public String toString () {
		
		return super.toString() + " Plazas: " + plazas;
	}
	
}
