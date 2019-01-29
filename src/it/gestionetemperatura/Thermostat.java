package it.gestionetemperatura;

/**
 * Termostato semplice.
 * 
 * @see CoolingSystem
 * 
 * @author cam
 *
 */
public class Thermostat {
	
	private CoolingSystem coolingSystem;
	
	public Thermostat(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
	}
	
	public void lowerTemperature() {
		System.out.println("Thermostat call lowerTemperature");
		coolingSystem.cool();
	}

}
