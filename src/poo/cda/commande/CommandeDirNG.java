package poo.cda.commande;

import java.io.File;
import java.util.ArrayList;

final public class CommandeDirNG extends Commande {
	private static final String ID = "DIRNG";
	private static final String DESC = "Affiche tout le contenu du repertoir en cours";

	public CommandeDirNG() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		int dossier = 0;
		int fichier = 0;
		try {
			File currentDir = new File(CommandeCD.getChemin());
			for (File file : currentDir.listFiles()) {
				if (file.isDirectory()) {
					System.out.println(" <DIR> : " + file.getName());
					dossier++;
				} else if (file.isFile()) {
					System.out.println("\t\t" + file.getName());
					fichier++;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Error occurred...");
		}
		System.out.println(fichier + " fichiers");
		System.out.println(dossier + " dossiers");
		return true;
	}
}