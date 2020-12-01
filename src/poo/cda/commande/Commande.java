package poo.cda.commande;

import java.util.List;

abstract class Commande {
    protected final int id;
    protected final String description;
    protected List args;
    protected <T> Commande(int pId, String pDescription,List<T> args) {
        this.id = pId;
        this.description = pDescription;
        this.args = args;
    }
    public abstract boolean executer();
    public int getId() {
        return this.id;
    }
    public String getDescription() {
        return this.description;
    }
}
