package it.corso.git;

public class Eccezione extends Exception  {
	public String getMessage() {
		return "Il divisore non pu� essere 0!";
	}
}
