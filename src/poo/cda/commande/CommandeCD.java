package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCD extends Commande {
	
	private static final String ID = "CD";
	private static final String DESC = "Permet de se deplacer dans les repertoir";

	public CommandeCD() {
		super(ID, DESC);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return true;
	}

}
