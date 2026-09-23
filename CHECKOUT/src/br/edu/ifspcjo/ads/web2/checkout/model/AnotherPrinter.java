package br.edu.ifspcjo.ads.web2.checkout.model;

public class AnotherPrinter implements Printer {

    @Override
    public void print(Printable printable) {

        System.out.println("*******************************");
        System.out.println(printable.getPageHeader());
        System.out.println("*******************************");
        System.out.println(printable.getPageBody());
        System.out.println("*******************************");
        System.out.println("===Another===");
        System.out.println("*******************************");
    }

}
