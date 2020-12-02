package poo.cda.outils;

import java.util.ArrayList;

public class CommandeTraduction {
	
	private String cmd;
	private ArrayList<String> args = new ArrayList<>();
	
	public CommandeTraduction(LectureDecoupage commande) {
		this.cmd = commande.getDecoupe()[0];
		for(int i=0;i<(commande.getDecoupe().length)-1; i++) {
		   this.args.add(commande.getDecoupe()[i+1]);
		}
	}
	public ArrayList<String> getArgs() {
		return args;
	}
	public String getCmd() {
		return cmd;
	}	
	
	

}
