package fr.esisar.calculatrice;

public class CalculatriceExecption extends Exception{
	private String message;
	
	public CalculatriceExecption(String message)
	{
		this.message = message;
	}
	
	public String toString()
	{
		return message;
		
	}
}
