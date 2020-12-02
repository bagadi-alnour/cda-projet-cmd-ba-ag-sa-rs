package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCat extends Commande {

	private static final String ID = "CAT";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";
	
	protected CommandeCat() {
		super(ID, DESC);
	}

	
	@Override
	public boolean executer(ArrayList<String> args) {
		return true;
	}

}
