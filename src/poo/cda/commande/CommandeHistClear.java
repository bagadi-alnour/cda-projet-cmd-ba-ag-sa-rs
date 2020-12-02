package poo.cda.commande;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

final public class CommandeHistClear extends Commande {
	private static final String ID = "HISTCLEAR";
	private static final String DESC = "Supprime l'historique des commande";

	protected CommandeHistClear() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		try (BufferedWriter vBufferedWriter = new BufferedWriter(new FileWriter("Commande.txt"))) {
			vBufferedWriter.nullWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}