package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCount extends Commande {
	private static final String ID = "COUNT";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";

	protected CommandeCount() {
		super(ID, DESC);
	}
	
	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}

}
