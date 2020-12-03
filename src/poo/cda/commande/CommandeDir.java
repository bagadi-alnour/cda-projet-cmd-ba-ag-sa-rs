package poo.cda.commande;
import java.io.File;
import java.util.ArrayList;
final public class CommandeDir extends Commande {
    private static final String ID = "DIR";
    private static final String DESC = "Affiche le contenu du reppertoir ";
    public CommandeDir() {
        super(ID, DESC);
    }
    @Override
    public boolean executer(ArrayList<String> args) {
        try {
            File currentDir = new File(CommandeCD.getChemin());
            for (File file : currentDir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println(" <DIR> : " + file.getName());
                } else if(file.isFile()) {
                    System.out.println("\t\t" + file.getName());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error occurred...");
        }
        return true;
    }
}