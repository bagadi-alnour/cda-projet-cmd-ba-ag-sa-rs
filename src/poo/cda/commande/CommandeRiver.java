package poo.cda.commande;

import java.util.ArrayList;

final public class CommandeRiver extends Commande {

	private static final String ID = "RIVER";
	private static final String DESC = "Prend deux paramètres en entrée et affiche la première intersection";

	public CommandeRiver() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		if (args != null && args.size() == 2) {
			try {
				action(Integer.parseInt(args.get(0)), Integer.parseInt(args.get(1)));
			} catch (NumberFormatException e) {
				System.out.println("La commande \" river\" doit obligatoirement prendre deux argument de type entier");
			}

		} else {
			System.out.println("La commande \" river\" doit obligatoirement prendre deux argument de type entier");
		}
		return true;
	}

	public static void action(long r1, long r2) {
		String affiche = "Le river de "+r1+" et de "+r2+" est egale à ";
		while (r1 != r2) {
			if (r1 < r2) {
				r1 = digitalRiver(r1);
			} else {
				r2 = digitalRiver(r2);
			}
		}

		System.out.println(affiche+r1);
	}

	public static long digitalRiver(long r) {
		int sum = 0;
		long C = r;
		while (C > 0) {
			sum += C % 10;
			C = C / 10;
		}
		r += sum;
		return r;
	}

}
