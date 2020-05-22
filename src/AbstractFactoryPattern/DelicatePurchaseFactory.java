package AbstractFactoryPattern;

public class DelicatePurchaseFactory extends PurchaseFactory {
@Override
    public Packaging CreatePackaging()
    {
        return new ShockProofPackaging();
    }

    public DeliveryDocument CreateDeliveryDocument()
    {
        return new CourierManifest();
    }

}
