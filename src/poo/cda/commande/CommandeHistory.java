package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeHistory extends Commande {
	private static final String ID = "HISTORY";
	private static final String DESC = "Affiche la liste des dix derniere commande";
	

	protected CommandeHistory() {
		super(ID, DESC);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return true;
	}

}
