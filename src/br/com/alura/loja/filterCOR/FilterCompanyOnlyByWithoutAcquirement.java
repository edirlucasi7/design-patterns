package br.com.alura.loja.filterCOR;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCompanyOnlyByWithoutAcquirement extends ComercialSearchForm {

    public FilterCompanyOnlyByWithoutAcquirement(ComercialSearchForm next) {
        super(next);
    }

    public List<Company> getCompanies(List<Company> companies, FilterType type) {
        if(type.isWithoutAcquirement()) {
            return companies.stream().filter(Company::isWithoutAcquirement).collect(toList());
        }

        return next.getCompanies(companies, type);
    }
}
