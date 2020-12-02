package poo.cda.commande;

import java.util.ArrayList;

final public  class CommandeHelp extends Commande {

	public static final String ID = "HELP";
	public static final String DESC = "Affiche la description de chaque commande";
	
	public CommandeHelp() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		return true;
	}

	
}
