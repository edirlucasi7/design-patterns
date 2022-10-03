package br.com.alura.loja.filterCOR;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FilterType type = new FilterType(true, false, false);

        List<Company> companies = List.of(new Company("AluraTrial", 5, true),
                new Company("AluraTrial2", 0, true),
                new Company("AluraWithAcquirement", 5, false));

        ComercialSearchFormFilterService searchFormFilterService = new ComercialSearchFormFilterService();

        System.out.println(searchFormFilterService.filterCompanies(companies, type));
    }
}
