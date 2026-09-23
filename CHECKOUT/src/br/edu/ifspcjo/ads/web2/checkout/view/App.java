package br.edu.ifspcjo.ads.web2.checkout.view;
import br.edu.ifspcjo.ads.web2.checkout.model.Buy;
import br.edu.ifspcjo.ads.web2.checkout.model.Card;
import br.edu.ifspcjo.ads.web2.checkout.model.CieloOperator;
import br.edu.ifspcjo.ads.web2.checkout.model.EpsonPrinter;
import br.edu.ifspcjo.ads.web2.checkout.model.Operator;
import br.edu.ifspcjo.ads.web2.checkout.model.Printer;

public class App {
    public static void main(String[] args) throws Exception {
        Operator operator = new CieloOperator();
        Printer printer = new EpsonPrinter();
        Card card = new Card("Juliana Pereria", "1234.2343");

        Buy buy = new Buy("Juliana America", 7999, "iPhone 17");
        
    }
}
