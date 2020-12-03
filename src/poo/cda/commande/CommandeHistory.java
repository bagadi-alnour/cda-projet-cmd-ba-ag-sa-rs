package poo.cda.commande;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

final public class CommandeHistory extends Commande {
	private static final String ID = "HISTORY";
	private static final String DESC = "Affiche la liste des dix derniere commande sans la commande History";

	protected CommandeHistory() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Commande.txt"))) {
			String string = bufferedReader.readLine();
			int i = 0;
			while (string != null && i < 10) {
				System.out.println(string);
				i++;
				string = bufferedReader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Probleme survenue lors de l'execution de la commande");
		}
		return true;
	}
}