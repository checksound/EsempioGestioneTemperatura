package it.gestionetemperatura.imp;

import it.gestionetemperatura.CoolingSystem;
import it.gestionetemperatura.TemperatureSystem;

/**
 * Implementazione di sistema di raffreddamento e riscaldamento.
 * 
 * @author cam
 *
 */
public class HeatPump extends CoolingSystem implements TemperatureSystem {

	@Override
	public void cool() {
		System.out.println("HeatPump cool!!!");

	}

	@Override
	public void heat() {
		System.out.println("HeatPump heat!!!");
		
	}
	
	

}
