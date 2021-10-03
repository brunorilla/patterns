package adapterPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creo un BarcoAMotor
		
		BarcoPesquero bco_pesquero = new BarcoPesquero();
		
		// Creo un adapter de barco pesquero para barco a vela
		
		AdapterBarcoAMotor adapter = new AdapterBarcoAMotor(bco_pesquero);
		
		Capitan captain = new Capitan(adapter);
		
		captain.navegarAVela();
		
		Velero velero = new Velero();
		
		captain.setBarcoAVela(velero);
		
		captain.navegarAVela();
		
	}

}
