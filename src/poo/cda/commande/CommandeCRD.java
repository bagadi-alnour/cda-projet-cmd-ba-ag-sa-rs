package poo.cda.commande;
import java.io.File;
import java.util.ArrayList;
final public class CommandeCRD extends Commande {
    private static final String ID = "CRD";
    private static final String DESC = "Créer un dossier dans le répertoir en cours";
    protected CommandeCRD() {
        super(ID, DESC);
    }
    @Override
    public boolean executer(ArrayList<String> args) {
        if (args != null && args.size() == 1) {
            String currentDir = System.getProperty("user.dir");
            File file = new File(currentDir, args.get(0));
            boolean mkdir = file.mkdir();
            File cd = new File(System.getProperty("user.dir"));
            for (File f : cd.listFiles()) {
                if (f.getName().contains(args.get(0))) {
                    System.out.println("le dossier est déjà existé");
                }
            }
            if (mkdir) {
                System.out.println("Le répertoire a été créé avec succès");
            }
        }
        return true;
    }
}