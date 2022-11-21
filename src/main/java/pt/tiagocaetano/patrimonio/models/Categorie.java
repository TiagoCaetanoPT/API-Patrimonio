package pt.tiagocaetano.patrimonio.models;

public class Categorie {
    private String name;
    private Categorie parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categorie getParent() {
        return parent;
    }

    public void setParent(Categorie parent) {
        this.parent = parent;
    }
}
