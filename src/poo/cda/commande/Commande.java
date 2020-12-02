package poo.cda.commande;

import java.util.ArrayList;

public abstract class Commande {
	
	protected final String id;
	protected final String description;
	
	protected <T> Commande(String Id, String Description) {
		this.id = Id;
		this.description = Description;
	}
	
	public abstract boolean executer(ArrayList<String> args);
	
	public String getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
}
