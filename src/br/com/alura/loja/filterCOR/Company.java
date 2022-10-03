package br.com.alura.loja.filterCOR;

public class Company {

    private String name;
    private int licensesQuantity;
    private boolean isTrial;

    public Company(String name, int licensesQuantity, boolean isTrial) {
        this.name = name;
        this.licensesQuantity = licensesQuantity;
        this.isTrial = isTrial;
    }

    public String getName() {
        return name;
    }

    public boolean isTrial() {
        return isTrial;
    }

    public boolean isWithAcquirement() {
        return licensesQuantity > 0;
    }

    public boolean isWithoutAcquirement() {
        return licensesQuantity == 0;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", licensesQuantity=" + licensesQuantity +
                ", isTrial=" + isTrial +
                '}';
    }
}
