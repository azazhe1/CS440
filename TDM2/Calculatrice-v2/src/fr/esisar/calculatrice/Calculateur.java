package fr.esisar.calculatrice;

public class Calculateur {
	public static void main(String[] args)
	{
		Calculatrice calculatrice = new Calculatrice();
		try {
			System.out.println(calculatrice.calculer("+",1, 3));
			System.out.println(calculatrice.calculer("-",1, 3));
			System.out.println(calculatrice.calculer("/",1, 3));
			System.out.println(calculatrice.calculer("*",1, 3));
			System.out.println(calculatrice.calculer("0",1, 3));
		} catch (CalculatriceExecption e) {
			e.printStackTrace();
		}
	}
}
