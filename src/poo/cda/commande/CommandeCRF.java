package poo.cda.commande;

import java.io.File;
import java.util.ArrayList;

final public class CommandeCRF extends Commande {
	private static final String ID = "CRF";
	private static final String DESC = "Créer un fichier ";

	protected CommandeCRF() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		if (args != null && args.size() == 1) {
			File f = new File(args.get(0));
			try {
				if (f.createNewFile()) {
					System.out.println("Le fichier " + args.get(0) + " vient d'etre créé avec succés");
				} else {
					System.out.println("Le fichier existe déja, veuillez refaire la demande avec un autre nom");
				}
			} catch (Exception e) {
				System.out.println("Nom de fichier invalide!!!");
			}
		} else {
			System.out.println("Veuillez saisir un nom de fichier valide");
		}
		return true;
	}
}