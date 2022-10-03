package br.com.alura.loja.filterCOR;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCompanyOnlyWithAcquirement extends ComercialSearchForm {

    public FilterCompanyOnlyWithAcquirement(ComercialSearchForm next) {
        super(next);
    }

    public List<Company> getCompanies(List<Company> companies, FilterType type) {
        if(type.isWithAcquirement()) {
            return companies.stream().filter(Company::isWithAcquirement).collect(toList());
        }
        
        return next.getCompanies(companies, type);
    }
}
