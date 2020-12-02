package poo.cda.commande;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

final public class CommandeCat extends Commande {
	private static final String ID = "CAT";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";

	protected CommandeCat() {
		super(ID, DESC);
	}

	public void commandeCat() {
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		if (args != null && args.size() == 1) {
			String line;
			if (new File(CommandeCD.getChemin()+args.get(0)).exists()) {
				try (BufferedReader in = new BufferedReader(new FileReader(CommandeCD.getChemin()+args.get(0)))) {
					while ((line = in.readLine()) != null) {
						System.out.println(line);
					}
				} catch (IOException e) {
					System.out.println("Lecture impossible du fichier, problème survenu lors de la lecture");
				}
			} else {
				System.out.println("Le fichier demandé n'existe pas ou est introuvable");
			}
		}
		return true;
	}
}