package fr.esisar.operations;

import fr.esisar.calculatrice.CalculatriceExecption;

public interface Operation  {
	public String getNom();
	public double calculer(double operande1, double operande2) throws CalculatriceExecption;
	
}
