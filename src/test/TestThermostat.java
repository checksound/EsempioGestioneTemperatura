package test;

import it.gestionetemperatura.Thermostat;
import it.gestionetemperatura.imp.AirConditioner;
import it.gestionetemperatura.imp.HeatPump;

/**
 * Classe test per termostato prima versione
 * 
 * @see Thermostat
 * @author cam
 *
 */
public class TestThermostat {
	
	private static void testWithAirConditioner() {
		
		System.out.println("\n\n--> testWithAirConditioner");
		
		Thermostat termostat = new Thermostat(new AirConditioner());
		
		termostat.lowerTemperature();
	}
	
	private static void testWithHeatPump() {
		
		System.out.println("\n\n--> testWithHeatPump");
		
		Thermostat termostat = new Thermostat(new HeatPump());
		
		termostat.lowerTemperature();
	}
	
	public static void main(String[] args) {
		
		testWithAirConditioner();
		
		testWithHeatPump();

	}

}
