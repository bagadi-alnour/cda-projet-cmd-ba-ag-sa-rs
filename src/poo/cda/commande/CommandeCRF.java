package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeCRF extends Commande {

	private static final String ID = "CRF";
	private static final String DESC = "Cr�er un fichier ";
	
	protected CommandeCRF() {
		super(ID, DESC);
	}
	
	@Override
	public boolean executer(ArrayList<String> args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return true;
	}

}
