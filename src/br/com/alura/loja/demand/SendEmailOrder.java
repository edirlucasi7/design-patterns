package br.com.alura.loja.demand;

public class SendEmailOrder implements ActionAfterGenerateOrder {
    @Override
    public void execute(Demand demand) {
        System.out.println("Enviando e-mail para "+demand.getCliente());
    }
}
