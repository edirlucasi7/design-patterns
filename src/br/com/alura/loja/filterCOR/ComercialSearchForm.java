package br.com.alura.loja.filterCOR;

import java.util.List;

public abstract class ComercialSearchForm {

    protected ComercialSearchForm next;

    public ComercialSearchForm(ComercialSearchForm next) {
        this.next = next;
    }

    public abstract List<Company> getCompanies(List<Company> companies, FilterType type);
}
