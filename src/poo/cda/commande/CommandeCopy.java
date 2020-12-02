package poo.cda.commande;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

final public class CommandeCopy extends Commande {
	private static final String ID = "COPY";
	private static final String DESC = "Supprime l'historique des commande";

	protected CommandeCopy() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		File src = new File(args.get(0));
		File dest = new File("copieDuFichier.txt");
		InputStream is = null;
		OutputStream os = null;
		if (args != null && args.size() == 1) {
			try {
				is = new FileInputStream(src);
				os = new FileOutputStream(dest);
				byte[] buffer = new byte[1024];
				int len;
				while ((len = is.read(buffer)) > 0) {
					os.write(buffer, 0, len);
				}
				is.close();
				os.close();
				System.out.println("Le fichier vient d'etre copié avec succés ");
			} catch (IOException e) {
				System.out.println(
						"Lecture impossible du fichier, problème survenu lors de la lecture(Veuillez taper un fichier valide!!!");
			}
		} else {
			System.out.println("Le fichier a copier n'existe pas ou est introuvable");
		}
		return true;
	}
}