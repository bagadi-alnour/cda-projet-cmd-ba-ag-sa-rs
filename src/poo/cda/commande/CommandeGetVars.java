package poo.cda.commande;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

final public class CommandeGetVars extends Commande {
	private static final String ID = "GETVARS";
	private static final String DESC = "Affiche le contenue d'un fichier a la console";

	protected CommandeGetVars() {
		super(ID, DESC);
	}

	@Override
	public boolean executer(ArrayList<String> args) {
		
		switch() {
		case "-env" :
			
			break;
		case "-prop" :
			
			break;
		default :
			break;	
		
		}
			String res = System.getenv(args.get(0));
			System.out.println(res);

		return false;
	}
//    avec l'option -env : affiche les variables d'environnements (indice : System.getenv())
//    > getvars -env
//    LOGONSERVER             : \\DESKTOP-CG3Q2PR
//    JAVA_HOME                 : C:\Program Files\Java\jdk1.8.0_181
//    SESSIONNAME             : Console
//    ALLUSERSPROFILE         : C:\ProgramData
//    PROCESSOR_ARCHITECTURE     : AMD64

//    avec l'option -prop : affiche les propri�t�s de la jvm (indice : System.getProperties())
//    > getvars -prop
//    java.vm.name : Java HotSpot(TM) 64-Bit Server VM
//    file.encoding.pkg : sun.io
//    user.country : FR
//    sun.java.launcher : SUN_STANDARD
//    ...
//    si pas d'option -> �quivalent � getvars avec les deux options
//  
//- lancer votre programme avec l'argument -Dma.nouvelle.entree=c:\temp
//    java -Dma.nouvelle.entree=c:\temp -jar votre-projet.jar 
//- lancer la commande getvars -prop
//- v�rifier qu'une nouvelle entr�e est ajout�e dans la liste des propri�t�s de la jvm.
//  
//- modifier votre programme ligne de commande pour que le r�pertoire au lancement est �gale :
//    - � la valeur de la propri�t� cdi.default.folder si elle passer comme argument au lancement.

}
