package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCopy extends Commande {
	
	private static final String ID = "COPy";
	private static final String DESC = "Supprime l'historique des commande";
	
	protected CommandeCopy() {
		super(ID, DESC);
		// TODO Stub du constructeur g�n�r� automatiquement
	}


	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return true;
	}

}
