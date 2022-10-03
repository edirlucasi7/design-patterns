package br.com.alura.loja.filterCOR;

import java.util.List;

public class ComercialSearchFormFilterService {

    public List<Company> filterCompanies(List<Company> companies, FilterType type) {
        ComercialSearchForm form = new FilterCompanyOnlyByTrial(
                new FilterCompanyOnlyWithAcquirement(
                        new FilterCompanyOnlyByWithoutAcquirement(
                                new WithoutFilter()
                        )
                ));

        return form.getCompanies(companies, type);
    }
}
