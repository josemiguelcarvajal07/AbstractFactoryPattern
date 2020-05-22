package AbstractFactoryPattern;

public class Client
{
    private Packaging _packaging;
    private DeliveryDocument _deliveryDocument;

    public Client(PurchaseFactory factory)
    {
        _packaging = factory.CreatePackaging();
        _deliveryDocument = factory.CreateDeliveryDocument();
    }

    public final Packaging getClientPackaging()
    {
        return _packaging;
    }

    public final DeliveryDocument getClientDocument()
    {
        return _deliveryDocument;
    }
}
