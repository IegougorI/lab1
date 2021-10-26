import java.util.ArrayList;

public class PurchasesList extends Purchases implements Add2PurchasesList{
    private String name;
    public PurchasesList(String name) {
        super(name);
        this.name = name;
    }
        public PurchasesList(String name, Purchases purchase1) {
            super(name);
            this.name = name;
            purchasesList.add(purchase1);

    }
    protected ArrayList purchasesList = new ArrayList();

    public void add2list(Purchases purchases) {
        purchasesList.add(purchases);
    }
}
