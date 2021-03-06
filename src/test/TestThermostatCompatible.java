package test;

import it.gestionetemperatura.ThermostatCompatible;
import it.gestionetemperatura.imp.AirConditioner;
import it.gestionetemperatura.imp.HeatPump;

/**
 * Classe test versione termostato compatibile - con funzioanlità anche di riscaldamento
 * 
 *  @see ThermostatCompatible
 */
public class TestThermostatCompatible {
	
	private static void testWithAirConditioner() {
		System.out.println("\n\n--> testWithAirConditioner");
		
		ThermostatCompatible term = new ThermostatCompatible(new AirConditioner());
		
        term.lowerTemperature();
		
		term.highterTemperature();
	}
	
	private static void testWithHeatPunp() {
		System.out.println("\n\n--> testWithHeatPunp");
		
		ThermostatCompatible term = new ThermostatCompatible(new HeatPump());
		
		term.lowerTemperature();
		
		term.highterTemperature();
	}
		
	public static void main(String[] args) {
				
		testWithAirConditioner();
		
		testWithHeatPunp();
	}

}
