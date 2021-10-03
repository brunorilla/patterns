package adapterPattern;

public class AdapterBarcoAMotor implements BarcoAVela {
	private BarcoAMotor barcoAMotor;
	
	public AdapterBarcoAMotor(BarcoAMotor boat) {
		this.barcoAMotor = boat;
	}
	
	@Override
	public void navegarAVela() {
		// TODO Auto-generated method stub
		barcoAMotor.navegar();
	}

}
