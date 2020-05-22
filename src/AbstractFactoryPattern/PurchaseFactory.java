package AbstractFactoryPattern;

public abstract class PurchaseFactory {
    public abstract Packaging CreatePackaging();


    public abstract DeliveryDocument CreateDeliveryDocument();
}
