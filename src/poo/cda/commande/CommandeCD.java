package poo.cda.commande;

import java.io.File;
import java.util.ArrayList;

final public class CommandeCD extends Commande {
	private static final String ID = "CD";
	private static final String DESC = "Permet de se deplacer dans les repertoire";
	private static String chemin = "C:\\";

	public CommandeCD() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {

		if (args != null && args.size() == 1) {
			switch (args.get(0)) {
			case "..":
				String[] tableaux = CommandeCD.chemin.split("\\\\{1}");
				if (tableaux.length > 1) {
					CommandeCD.chemin = "";
					int i = 0;
					for (String string : tableaux) {
						if (i < tableaux.length - 1) {
							CommandeCD.chemin += string + "\\";
							i++;
						}
					}
				}
				break;
			case "/":
				CommandeCD.chemin = "C:\\";
				break;
			case "\\":
				CommandeCD.chemin = "C:\\";
				break;
			default:
				try {
					File file = new File(CommandeCD.chemin + args.get(0));
					if (file.exists()) {
						CommandeCD.chemin += file.getName() + "\\";
					}
				} catch (NullPointerException e) {
					System.out.println("Error occurred...");
				}
				break;
			}
		}
		return true;
	}

	public static String getChemin() {
		return chemin;
	}

	public static void setChemin(String chemin) {
		CommandeCD.chemin = chemin;
	}
}