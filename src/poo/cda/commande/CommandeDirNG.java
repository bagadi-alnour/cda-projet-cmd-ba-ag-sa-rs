package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeDirNG extends Commande {
	
	private static final String ID = "DIRNG";
	private static final String DESC = "Affiche tout le contenu du repertoir en cours";
	

	public  CommandeDirNG() {
		super(ID, DESC);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return true;
	}

}
