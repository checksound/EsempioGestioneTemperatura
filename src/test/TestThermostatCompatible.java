package test;

import it.gestionetemperatura.ThermostatCompatible;
import it.gestionetemperatura.imp.AirConditioner;
import it.gestionetemperatura.imp.HeatPump;

public class TestThermostatCompatible {
	
	private static void testWithHeatPunp() {
		
		ThermostatCompatible term = new ThermostatCompatible(new HeatPump());
		
		term.lowerTemperature();
		
		term.highterTemperature();
	}
	
	private static void testWithAirConditioner() {
		
		ThermostatCompatible term = new ThermostatCompatible(new AirConditioner());
		
        term.lowerTemperature();
		
		term.highterTemperature();
	}
	
	public static void main(String[] args) {
				
		testWithAirConditioner();
		
		testWithHeatPunp();
	}

}
