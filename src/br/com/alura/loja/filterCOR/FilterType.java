package br.com.alura.loja.filterCOR;

public class FilterType {

    private boolean isTrial;
    private boolean isWithAcquirement;
    private boolean isWithoutAcquirement;

    public FilterType(boolean isTrial, boolean isWithAcquirement, boolean isWithoutAcquirement) {
        this.isTrial = isTrial;
        this.isWithAcquirement = isWithAcquirement;
        this.isWithoutAcquirement = isWithoutAcquirement;
    }

    public boolean isTrial() {
        return isTrial;
    }

    public boolean isWithAcquirement() {
        return isWithAcquirement;
    }

    public boolean isWithoutAcquirement() {
        return isWithoutAcquirement;
    }
}
