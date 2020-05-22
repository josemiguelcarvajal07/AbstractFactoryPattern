package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        PurchaseFactory spf = new StandardPurchaseFactory();
        Client standard = new Client(spf);
        System.out.println(standard.ClientPackaging.GetType());
        System.out.println(standard.ClientDocument.GetType());

        PurchaseFactory dpf = new DelicatePurchaseFactory();
        Client delicate = new Client(dpf);
        System.out.println(delicate.ClientPackaging.GetType());
        System.out.println(delicate.ClientDocument.GetType());
    }
}
