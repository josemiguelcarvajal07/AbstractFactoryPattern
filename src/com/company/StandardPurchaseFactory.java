package com.company;

public class StandardPurchaseFactory extends PurchaseFactory{
@Override
    public Packaging CreatePackaging()
    {
        return new StandardPackaging();
    }

    public DeliveryDocument CreateDeliveryDocument()
    {
        return new PostalLabel();
    }

}
