package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeGetFline extends Commande {
	private static final String ID = "GETFLINE";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";

	protected CommandeGetFline() {
		super(ID, DESC);
	}
	
	
	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return false;
	}

}
