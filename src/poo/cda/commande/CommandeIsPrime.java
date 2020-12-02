package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeIsPrime extends Commande{
	private static final String ID = "ISPRIME";
	private static final String DESC = "Prend deux param�tres en entr�e et affiche la premi�re intersection";
	

	protected  CommandeIsPrime() {
		super(ID, DESC);
	}
	
	@Override
	public boolean executer(ArrayList<String> args) {
		return true;
	}

}
