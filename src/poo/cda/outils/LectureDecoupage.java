package poo.cda.outils;


public class LectureDecoupage {
	
	private String lecture;
	private String[] decoupe;

	public LectureDecoupage(String commande) {
		this.lecture = commande;
		SetDecoupe(commande);
	}
	
	private void SetDecoupe(String commande) {
		this.decoupe = commande.split("\\s+");		
	}

	public String[] getDecoupe() {
		return decoupe;
	}

	public void setDecoupe(String[] decoupe) {
		this.decoupe = decoupe;
	}
	

}
