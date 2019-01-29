package test;

import it.gestionetemperatura.ThermostatEvolution;
import it.gestionetemperatura.imp.AirConditioner;
import it.gestionetemperatura.imp.HeatPump;

/**
 * Classe di test versione termostato evoluta con funzionalità raffreddamento e riscaldamento.
 * 
 * @see ThermostatEvolution
 * @author cam
 *
 */
public class TestThermostatEvolution {

	private static void testWithAirConditioner() {
		System.out.println("\n\n--> testWithAirConditioner");
		
		// ThermostatNew term = new ThermostatNew(new AirConditioner()); // ERRORE COMPILAZIONE
		
        // term.lowerTemperature();
		
		// term.highterTemperature();
	}
	
	private static void testWithHeatPunp() {
		System.out.println("\n\n--> testWithHeatPunp");
		
		ThermostatEvolution term = new ThermostatEvolution(new HeatPump());
		
		term.lowerTemperature();
		
		term.highterTemperature();
	}
		
	public static void main(String[] args) {
				
		testWithAirConditioner();
		
		testWithHeatPunp();
	}

}
