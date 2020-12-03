package poo.cda.commande;

import java.io.File;
import java.util.ArrayList;

final public class CommandeFind extends Commande {

	private static final String ID = "FIND";
	private static final String DESC = "Trouver un fichier dans le repertoir et les sous repertoir";
	private String start;
	private String end;
	private String nomComplet = null;
	private int i = 0;

	public CommandeFind() {
		super(ID, DESC);

	}

	@Override
	public boolean executer(ArrayList<String> args) {
		if (args != null) {
			switch (args.size()) {
			case 1:
				this.nomComplet = args.get(0);
			case 2:
				if (args.get(0).equalsIgnoreCase("-starts")) {
					this.start = args.get(1);
				} else if (args.get(0).equalsIgnoreCase("-ends")) {
					this.end = args.get(1);
				} else {
					System.out.println("");
				}
				break;
			case 4:
				if (args.get(0).equalsIgnoreCase("-starts") && args.get(2).equalsIgnoreCase("-ends")) {
					this.start = args.get(1);
					this.end = args.get(3);
				} else {
					System.out.println("");
				}
				break;
			default:
				break;
			}
		}

		File homeDir = new File(System.getProperty("user.home"));
		naviger(homeDir);
		System.out.println(i + " fichier trouvé");
		this.end = null;
		this.start = null;
		this.i = 0;
		return true;
	}

	public void naviger(File homeDir) {

		for (File file : homeDir.listFiles()) {
			if (file.isDirectory() && !file.isHidden()) {
				if (file.list() != null && file.list().length != 0) {
					naviger(file);
				}
			} else {

				if (this.start != null && this.end != null) {
					if (file.getName().length() > this.start.length() && file.getName().length() > this.end.length()) {
						if (file.getName().substring(0, this.start.length()).equalsIgnoreCase(this.start)
								&& file.getName().substring(file.getName().length() - this.end.length())
										.equalsIgnoreCase(this.end)) {
							System.out.println(file.getName());
							this.i++;
						}
					}

				} else if (this.start != null) {
					if (file.getName().length() > this.start.length()) {
						if (file.getName().substring(0, this.start.length()).equalsIgnoreCase(this.start)) {
							System.out.println(file.getName());
							this.i++;
						}
					}

				} else if (this.end != null) {
					if (file.getName().length() > this.end.length()) {
						if (file.getName().substring(file.getName().length() - this.end.length())
								.equalsIgnoreCase(this.end)) {
							System.out.println(file.getName());
							this.i++;
						}
					}

				} else {

					if (file.getName().equalsIgnoreCase(nomComplet)) {
						System.out.println(file.getName());
						this.i++;
					}

				}
			}
		}

	}

}
