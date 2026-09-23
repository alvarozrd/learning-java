package br.edu.ifspcjo.ads.web2.checkout.model;

public class LarissaCardOperator implements Operator {

    @Override 
    public boolean authorize(Authorizable authorizable, Card card){
        return card.getCardNumber().startsWith("1313") && authorizable.getTotal() < 1000;
    }
}
