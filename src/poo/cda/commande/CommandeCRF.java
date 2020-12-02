package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCRF extends Commande {

	private static final String ID = "CRF";
	private static final String DESC = "Créer un fichier ";
	
	protected CommandeCRF() {
		super(ID, DESC);
	}
	
	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la méthode généré automatiquement
		return true;
	}

}
