package br.com.alura.loja.filterCOR;

import java.util.List;

public class WithoutFilter extends ComercialSearchForm {

    public WithoutFilter() {
        super(null);
    }

    public List<Company> getCompanies(List<Company> companies, FilterType type) {
        return companies;
    }
}
