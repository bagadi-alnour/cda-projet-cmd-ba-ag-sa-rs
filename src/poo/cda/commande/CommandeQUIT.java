package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeQUIT extends Commande {
	
	private static final String ID = "QUIT";
	private static final String DESC = "Quitter le programme";
	

	protected CommandeQUIT() {
		super(ID, DESC);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return false;
	}

}
