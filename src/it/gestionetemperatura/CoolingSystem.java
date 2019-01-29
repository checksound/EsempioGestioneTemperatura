package it.gestionetemperatura;

import it.gestionetemperatura.imp.AirConditioner;
import it.gestionetemperatura.imp.HeatPump;

/**
 * Classe astratta - interfaccia sistema di raffreddamento
 * 
 * @see AirConditioner
 * @see HeatPump
 * @author cam
 *
 */
public abstract class CoolingSystem {
	
	/**
	 * comando caldo
	 */
	public abstract void cool();
	
}
