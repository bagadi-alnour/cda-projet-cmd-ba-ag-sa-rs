package poo.cda.commande;

import java.util.List;
public class Help extends Commande {
    public static final String  DESC = "";

    protected <T> Help(int pId, String pDescription, List<T> args) {
        super(pId, pDescription, args);
    }


    @Override
    public boolean executer() {
        System.out.println(
                        "cd             : Modifie le répartoire ou affiche le répartoire actif" +
                        "help           : Affiche des infromation sur les commandes." +
                        "exit           : Quitte l'intrepéteur de commandes." +
                        "hist           : Affiche l'historique des commandes." +
                        "dirng          : Affiche la liste des fichiers et des sous-prépertoires d'un répertoire." +
                        "histclear      : Vide l'historique des commandes." +
                        "fin            : Quitte l'intrepéteur de commandes." +
                        "quit           : Quitte l'intrepéteur de commandes." +
                        "dir            : Affiche la liste des fichiers et des sous-prépertoires d'un répertoire" +
                        "pwd            : Affiche chemin du répertoire en cours");
        return false;
    }


}
