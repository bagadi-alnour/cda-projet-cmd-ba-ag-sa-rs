package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeHistClear extends Commande {

	private static final String ID = "HISTCLEAR";
	private static final String DESC = "Supprime l'historique des commande";
	
	protected CommandeHistClear() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		return true;
	}

}
