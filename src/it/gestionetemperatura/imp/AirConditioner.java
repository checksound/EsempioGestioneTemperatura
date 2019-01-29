package it.gestionetemperatura.imp;

import it.gestionetemperatura.CoolingSystem;

/**
 * Implemantezione di sistema di raffreddamento.
 * 
 * @author cam
 *
 */
public class AirConditioner extends CoolingSystem {

	@Override
	public void cool() {
		System.out.println("AirConditioner cool!!!");

	}

}
