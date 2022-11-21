package pt.tiagocaetano.patrimonio.models;

public class Account {
    private String name;
    private String type;
    private double balance;
    protected String updatedAt;
    private boolean archived;
    private String notes;
    private boolean excludeFromBudgets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isExcludeFromBudgets() {
        return excludeFromBudgets;
    }

    public void setExcludeFromBudgets(boolean excludeFromBudgets) {
        this.excludeFromBudgets = excludeFromBudgets;
    }
}
