package mooc.fourthweek;

/*The class should have:

A constructor public Product(String nameAtStart, double priceAtStart, int amountAtStart)
A method public void printProduct() */
public class Product {
    String nameAtStart;
    double priceAtStart;
    int amountAtStart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void PrintProduct() {
        System.out.println(nameAtStart + "," + " price " + priceAtStart + "," + " amount " + amountAtStart);
    }
}
