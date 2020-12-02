package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCRD extends Commande {
	
	private static final String ID = "HISTCLEAR";
	private static final String DESC = "Supprime l'historique des commande";
	
	protected CommandeCRD() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return true;
	}

}
