package br.com.alura.loja.filterCOR;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterCompanyOnlyByTrial extends ComercialSearchForm {

    public FilterCompanyOnlyByTrial(ComercialSearchForm next) {
        super(next);
    }

    public List<Company> getCompanies(List<Company> companies, FilterType type) {
        if(type.isTrial()) {
            return companies.stream().filter(Company::isTrial).collect(toList());
        }

        return next.getCompanies(companies, type);
    }
}
