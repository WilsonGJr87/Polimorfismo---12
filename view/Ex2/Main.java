package view.Ex2;
import model.Ex2.*;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao();
        PagamentoBoleto boleto = new PagamentoBoleto();

        cartao.processarPagamento();
        System.out.println("====================");
        boleto.processarPagamento();
    }
}