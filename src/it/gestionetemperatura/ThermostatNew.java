package it.gestionetemperatura;

public class ThermostatNew {
	
	private TemperatureSystem temperatureSystem;
	
	public ThermostatNew(TemperatureSystem temperatureSystem) {
		this.temperatureSystem = temperatureSystem;
	}
	
	public void lowerTemperature() {
		System.out.println("ThermostatNew call lowerTemperature");
		temperatureSystem.cool();
	}
	
	public void highterTemperature() {
		System.out.println("ThermostatNew call lowerTemperature");
		temperatureSystem.heat();
	}
}
