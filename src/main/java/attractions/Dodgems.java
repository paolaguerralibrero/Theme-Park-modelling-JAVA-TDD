package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating, double price) {
        super(name, rating, price);
    }

    @Override
    public double defaultPrice() {
        return this.getPrice();
    }

    @Override
    public double priceFor(Visitor visitor){
        if(visitor.getAge() <= 12) {
            return (this.getPrice() / 2);
        } else {
            return this.getPrice();
        }
    }
}
