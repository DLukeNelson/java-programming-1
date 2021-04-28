
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment other) {
        return this.squares > other.squares;
    }

    public int price() {
        return this.pricePerSquare * this.squares;
    }
    
    public int priceDifference(Apartment other) {
        int difference = this.price() - other.price();
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment other) {
        return this.price() > other.price();
    }
}
