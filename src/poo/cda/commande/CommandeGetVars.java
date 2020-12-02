package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeGetVars extends Commande {
	private static final String ID = "GETVARS";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";

	protected CommandeGetVars() {
		super(ID, DESC);
	}
	
	
	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return false;
	}

}
