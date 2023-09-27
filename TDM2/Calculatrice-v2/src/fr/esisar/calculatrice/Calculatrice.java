package fr.esisar.calculatrice;

import java.util.ArrayList;

import fr.esisar.operations.Ajouter;
import fr.esisar.operations.Diviser;
import fr.esisar.operations.Multiplier;
import fr.esisar.operations.Operation;
import fr.esisar.operations.Soustraire;

public class Calculatrice {
	
	Set<Operation> liste = new HashSet<>();// Car c'est {unique} dans le diagrame de classe
	
	public Calculatrice() {
		liste.add(new Ajouter());
		liste.add(new Multiplier());
		liste.add(new Diviser());
		liste.add(new Soustraire());
	}
	
	public Operation chercherOperation(String nom) throws CalculatriceExecption
	{
		
		for(Operation op: liste)
		{
			if(op.getNom().equals(nom))
			{
				return op;
			}
		}
		throw new CalculatriceExecption("OpérationInvalide");
	}
	
	public double calculer(String nom, double operande1, double operande2) throws CalculatriceExecption
	{
			Operation op = chercherOperation(nom);
			return op.calculer(operande1, operande2);
	}
	
}
