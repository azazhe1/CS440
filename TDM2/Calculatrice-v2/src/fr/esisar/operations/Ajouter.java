package fr.esisar.operations;

public class Ajouter implements Operation{

	@Override
	public String getNom() {
		
		return "+";
	}

	@Override
	public double calculer(double operande1, double operande2) {
		// TODO Auto-generated method stub
		return operande1+operande2;
	}
}
