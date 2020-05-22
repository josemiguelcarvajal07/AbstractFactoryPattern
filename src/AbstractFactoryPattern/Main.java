package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
	// write your code here
        PurchaseFactory spf = new StandardPurchaseFactory();
        Client standard = new Client(spf);
        System.out.println(standard.getClientPackaging().getClass());
        System.out.println(standard.getClientDocument().getClass());

        PurchaseFactory dpf = new DelicatePurchaseFactory();
        Client delicate = new Client(dpf);
        System.out.println(delicate.getClientPackaging().getClass());
        System.out.println(delicate.getClientDocument().getClass());
    }
}
