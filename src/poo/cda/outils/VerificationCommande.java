package poo.cda.outils;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import poo.cda.commande.Commande;
import poo.cda.commande.CommandeCD;
import poo.cda.commande.LesCommandes;


public class VerificationCommande {
	private static CommandeTraduction verif;
	private static HashMap<String, Commande> COMMANDE = new HashMap<>();
	public VerificationCommande() {
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.HELP);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.RIVER);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.IS_PRIME);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.HISTORY);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.HISTORY_CLEAR);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.QUITER);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.EXIT);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.DIR);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.DIR_NOUVELLE_GENERATION);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.CD);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.FIND);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.CAT);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.COPY);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.CRF);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.CRD);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.NOW);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.COUNT);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.GET_VARS);
		ajouterCommande(VerificationCommande.COMMANDE, LesCommandes.GET_FLINE);
		CommandeCD.setChemin( System.getProperty("user.dir"));
		try (BufferedWriter vBufferedWriter = new BufferedWriter(new FileWriter("Emplacement.txt", false))) {
				vBufferedWriter.write(System.getProperty("user.dir"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean scanner(Scanner in) {
		System.out.println(">  " + CommandeCD.getChemin());
		System.out.print(">  ");
		VerificationCommande.verif = new CommandeTraduction(new LectureDecoupage(in.nextLine().toUpperCase()));
		if (COMMANDE.containsKey(VerificationCommande.verif.getCmd())) {
			try (BufferedWriter vBufferedWriter = new BufferedWriter(new FileWriter("Commande.txt", true))) {
				if (!VerificationCommande.verif.getCmd().equals("HISTORY")) {
					vBufferedWriter.write(VerificationCommande.verif.getCmd() + "\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return COMMANDE.get(VerificationCommande.verif.getCmd()).executer(VerificationCommande.verif.getArgs());
		} else {
			System.out.println(VerificationCommande.verif.getCmd()
					+ " n'est pas reconnu en tant que commande interne ou externe, un programme exécutable ou un fichier de this.COMMANDE.");
			return true;
		}
	}
	
	private void ajouterCommande(HashMap<String, Commande> COMMANDE, Commande commande) {
		COMMANDE.put(commande.getId(), commande);
	}
	
	public static HashMap<String, Commande> getCOMMANDE() {
		return COMMANDE;
	}
	
	
}