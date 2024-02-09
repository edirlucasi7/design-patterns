package br.com.patterns.chainofresposibility.disordered;

import br.com.patterns.user.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        B2CUserBlock b2CUserBlock = new B2CUserBlock();
        CompanyUserBlock companyUserBlock = new CompanyUserBlock();
        ChainOfResponsibilityHandler chainOfResponsibilityHandler = new ChainOfResponsibilityHandler(List.of(b2CUserBlock, companyUserBlock));

        chainOfResponsibilityHandler.handler(new User(1L, "Edir Lucas Icety", "icety@gmail.com"), "0.0.0.0");
    }
}
