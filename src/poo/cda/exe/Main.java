package poo.cda.exe;

import java.util.Scanner;

import poo.cda.outils.VerificationCommande;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			VerificationCommande initialisation = new VerificationCommande();
			while (VerificationCommande.scanner(in)) {
			}
		}
	}

}
