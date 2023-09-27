package fr.esisar.operations;

import fr.esisar.calculatrice.CalculatriceExecption;

public class Diviser implements Operation {

	@Override
	public String getNom() {
		
		return "/";
	}

	@Override
	public double calculer(double operande1, double operande2) throws CalculatriceExecption {
		if(operande2==0)
		{
			throw new CalculatriceExecption("OpérationInvalide");
			
		}
		return (double) operande1/operande2;
	}

}
