package it.gestionetemperatura;

/**
 * Termostato compatibile anche per sistemi di riscaldamento.
 * 
 * @see CoolingSystem
 * @see TemperatureSystem
 * 
 * @author cam
 *
 */
public class ThermostatCompatible {
	
	private CoolingSystem coolingSystem;
	
	public ThermostatCompatible(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
	}
	
	public void lowerTemperature() {
		System.out.println("ThermostatCompatible call lowerTemperature");
		coolingSystem.cool();
	}
	
	public void highterTemperature() {
		System.out.println("ThermostatCompatible call highterTemperature");
		if( coolingSystem instanceof TemperatureSystem) {
			TemperatureSystem temperatureSystem = (TemperatureSystem) coolingSystem;
			temperatureSystem.heat();
		} else {
			System.out.println("ERROR: IS NOT A HEAT PUMP!!!");
		}
		
	}
}
