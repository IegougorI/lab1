public class Main {
    public static void main(String[] args) {

        Person Ponchik = new Person("Ponchik");
        Person Piskarik = new Person("Piskarik");
        Person Leshik = new Person("Leshik");
        Person Somik = new Person("Somik");
        Person Sudachok = new Person("Sudachok");
        GroupPersons group1 = new GroupPersons("Piskarik, Leshik, Somik and Sudachok", Piskarik, Leshik, Somik, Sudachok);
        group1.sayNothing("Say nothing to anyone");
        Money money = new Money("", "All", group1);
        group1.collectMoney();

        Food food = new Food("food");
        group1.buy(food); // тут задали владельца уже
        PurchasesList list1 = new PurchasesList("Purchases list", food);

        Purchases ticket = new Purchases("ticket", Towns.FANTOMAS);
        group1.buy(ticket);
        list1.add2list(ticket);
        ticket.setOwner(Ponchik); //cтоит ли так делать?

        Bag bag = new Bag("bag", Ponchik);
        bag.putInBag(bag, food);// все еще под вопросом

        System.out.println(ticket.getOwner() + " owner of " + ticket.getName() + " to " +ticket.getTown());

        GroupPersons group2 = new GroupPersons("Piskarik, Leshik, Somik, Sudachok and Ponchik");
        group2.add2groupPerson(Ponchik);
        group2.arrived2RailwayStation();

        Train train = new Train("train");
        train.arrived();
        Ponchik.sayGoodBye();
        Ponchik.enterInTrain();
        train.departed();

        //Train.Carriage carriage = train.new Carriage("carriage", ); //что у булина писать надо?
        //Train.Carriage.Bench bench = carriage.new Bench("Bench");
        /*
        if (carriage.getisFreePlace() == true){
        Ponchik.setPlace(bench);
        System.out.println("Ponchik managed to find place on the bench");
        }
        else {
        System.out.println("Ponchik didn't find place on the bench");
        }

        */

    }
}
