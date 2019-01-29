package it.gestionetemperatura;

import it.gestionetemperatura.imp.HeatPump;

/**
 * Interfaccia del sistema evoluto - funzionalità di raffreddamento e riscaldamento
 * 
 * @see HeatPump
 * @author cam
 *
 */
public interface TemperatureSystem {
	
	/**
	 * comando freddo
	 */
	public void cool();
	
	/**
	 * comando caldo
	 */
	public void heat();
	
}
