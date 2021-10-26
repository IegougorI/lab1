public class Bag extends Item implements ActionWithBag{
    private String name;
    private Person owner;
    public Bag(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        owner.setBag(this);
    }


    public void putInBag(Bag bag, Item item) {
        System.out.println("Put food in " + owner + "'s " + name);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }
}

