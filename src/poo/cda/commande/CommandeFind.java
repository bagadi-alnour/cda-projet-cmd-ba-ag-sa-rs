package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeFind extends Commande {

	private static final String ID = "FIND";
	private static final String DESC = "Trouver un fichier dans le repertoir et les sous repertoir";
	
	public  CommandeFind() {
		super(ID, DESC);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return true;
	}

}
