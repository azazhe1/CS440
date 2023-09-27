package fr.esisar.operations;

public class Soustraire implements Operation {

	@Override
	public String getNom() {
		
		return "-";
	}

	@Override
	public double calculer(double operande1, double operande2) {
		return operande1-operande2;
	}

}
