package poo.cda.commande;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import poo.cda.outils.VerificationCommande;

final public  class CommandeHelp extends Commande {

	public static final String ID = "HELP";
	public static final String DESC = "Affiche la description de chaque commande";
	
	public CommandeHelp() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		VerificationCommande list = new VerificationCommande();
		HashMap<String, Commande>  commande = VerificationCommande.getCOMMANDE();
		
		Set<Entry<String, Commande>> s = commande.entrySet();
		for (Iterator<Entry<String, Commande>> iterator = s.iterator(); iterator.hasNext();) {				
		Commande commandeAfficher = iterator.next().getValue();	
		System.out.println(commandeAfficher.getId() +"    "  +commandeAfficher.getDescription() );
		  
		}
		return true;
	}

	
}
