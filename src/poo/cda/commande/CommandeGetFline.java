package poo.cda.commande;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

final public class CommandeGetFline extends Commande {
	private static final String ID = "GETFLINE";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";
	private int vDebut = 0;
	private int vFin = Integer.MAX_VALUE;
	private int nbrLine = 0;
	private int compteurLigneDebut =0;

	protected CommandeGetFline() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {

		switch (args.size()) {
		case 2:
			if (args.get(0).equalsIgnoreCase("-n")) {
			File file =  new File(args.get(1));
				compteLignes(file);
			}

		case 3:

			if (args.get(0).equalsIgnoreCase("-d")) {
				File file =  new File(args.get(1));
				compteLignesDebut(file, Integer.valueOf(args.get(2)));
			}
			if (args.get(0).equalsIgnoreCase("-f")) {

			}
			if (args.get(0).equalsIgnoreCase("-s")) {
			}
			break;

		default:
			System.out.println("Le fichier demand� n'existe pas ou est introuvable");
			// fonction getfline sans arguments
			break;
		}

		return true;
	}

	// affiche les lignes entre le d�but et la fin(par d�faut affiche toutes les
	// lignes----� changer)
	public void compteLignes(File pfile ) {
		File file = pfile;
		if (file.exists()) {

			FileReader fr = null;
			try {
				fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr);
			String str;
			try {
				while ((str = br.readLine()) != null) {
					nbrLine++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Nombre de lignes dans le fichier : " + file.getName() + " " + nbrLine);
	}
	public void compteLignesDebut(File pfile , int numeroLigneDebut) {
		File file = pfile;
		if (file.exists()) {

			FileReader fr = null;
			try {
				fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr);
			String str;
			try {
				while ((str = br.readLine()) != null) {
					nbrLine++;
				}
				if(numeroLigneDebut<nbrLine) {
					compteurLigneDebut = nbrLine - numeroLigneDebut;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Nombre de lignes restantes apr�s : "+ numeroLigneDebut+" " + file.getName() + " " + compteurLigneDebut);
	}
	
	public void afficheLine(int debut, int fin, ArrayList<String> args) {
		String line;
		int i = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(CommandeCD.getChemin() + args.get(0)))) {
			while ((line = in.readLine()) != null) {
				if (i > debut - 1 && i < fin + 1) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			System.out.println("Lecture impossible du fichier, probl�me survenu lors de la lecture");
		}
	}
}

//par d�faut 0
//et Integer-Max pour le max
//- ajouter la commande "fline" qui fait des traitement sur un fichier ligne par ligne :
//    format : fline nomFichier -option1 -option2 ...
//    fline est toujours suivi du nom d'un fichier, sinon erreur syntaxe
//    -n : affiche le nombre de lignes, ne peut pas �tre utilis�e en m�me temps qu'une autre option.
//    -d : permet de d�finir le numero de ligne � partir duquel le traitement va �tre fait (inclut).
//    -f : permet de d�finir le numero de ligne jusqu'auquel le traitement va �tre fait (inclut).
//    -s : permet de chercher un string dans une ligne, peut �tre utilis�e avec les options -d et -f
//    exemple : 
//    > cat fichier.txt
//    contenu l1
//    contenu l2
//    contenu l3
//    > fline fichier.txt
//    contenu l1
//    contenu l2
//    contenu l3
//    > fline fichier.txt -n
//    3 lignes
//    > fline fichier.txt -s l1
//    contenu l1
//    > fline fichier.txt -s l
//    contenu l1
//    contenu l2
//    contenu l3
//    > fline fichier.txt -s l -d 2
//    contenu l2
//    contenu l3
//    > fline fichier.txt -s l -f 2 -d 1
//    contenu l1
