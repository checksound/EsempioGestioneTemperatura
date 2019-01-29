package it.gestionetemperatura;

/**
 * Termostato sia per riscaldamento che raffreddamento.
 * 
 * @see TemperatureSystem
 * @author cam
 *
 */
public class ThermostatEvolution {
	
	private TemperatureSystem temperatureSystem;
	
	public ThermostatEvolution(TemperatureSystem temperatureSystem) {
		this.temperatureSystem = temperatureSystem;
	}
	
	public void lowerTemperature() {
		System.out.println("ThermostatEvolution call lowerTemperature");
		temperatureSystem.cool();
	}
	
	public void highterTemperature() {
		System.out.println("ThermostatEvolution call lowerTemperature");
		temperatureSystem.heat();
	}
}
