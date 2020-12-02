package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeIsPrime extends Commande {
	private static final String ID = "ISPRIME";
	private static final String DESC = "Prend un entier en entrée et vérifie s'il est premier ou non";

	protected CommandeIsPrime() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		if (args != null && args.size() == 1) {
			try {
				int reste;
				int arguments = Integer.parseInt(args.get(0));
				boolean yes = true;
				for (int i = 2; i <= arguments / 2; i++) {
					reste = arguments % i;
					if (reste == 0) {
						yes = false;
						break;
					}
				}
				if (yes)
					System.out.println(arguments + " yes");
				else
					System.out.println(arguments + " no");
			} catch (NumberFormatException e) {
				System.out.println("La commande Prime accepte un seul argument de type Int");
				return true;
			}
		} else {
			System.out.println("La commande Prime accepte un seul argument de type Int");
		}
		return true;
	}
}