package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeDir extends Commande {
	
	private static final String ID = "DIR";
	private static final String DESC = "Affiche le contenu du reppertoir ";

	public  CommandeDir() {
		super(ID, DESC);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return true;
	}

}
