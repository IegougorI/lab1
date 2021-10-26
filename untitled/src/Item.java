public class Item extends TextObject {
    private String amount;

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void getAmount() {
        System.out.println("amount " + amount);
    }

    protected String name;
    public Item(String name) {
        super(name);
        this.name = name;
    }
    private String place;
    public Item(String name, String place) {
        super(name);
        this.name = name;
        this.place = place;
    }

}