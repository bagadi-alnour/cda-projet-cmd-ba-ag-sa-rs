package poo.cda.commande;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public final class Dir extends Commande {

    protected <T> Dir(int pId, String pDescription, List<T> args) {
        super(pId, pDescription, args);
    }

    @Override
    public boolean executer() {

        File homeDir = new File(System.getProperty("user.home"));
        System.out.println(System.getProperty("homeDrive"));

        for (File file : homeDir.listFiles()) {
            if (file.isDirectory()) {

                try {
                    Arrays.stream(file.listFiles()).forEach(x -> System.out.println("\t\t\t\t" + x));
                } catch (NullPointerException e) {
                    System.out.println("null");
                }
            }
        }

        return false;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }


}
