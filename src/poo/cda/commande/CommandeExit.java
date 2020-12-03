package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeExit extends Commande{
	private static final String ID = "EXIT";
	private static final String DESC = "Prend deux param�tres en entr�e et affiche la premi�re intersection";
	
	protected CommandeExit() {
		super(ID, DESC);
	}
	
	@Override
	public boolean executer(ArrayList<String> args) {
		return false;
	}

}
