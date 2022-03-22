package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating, price);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 15) {
            if(visitor.getHeight() >= 1.50)
            return true;
        }
        return false;

    }

    @Override
    public double defaultPrice() {
        return this.getPrice();
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 2.00) {
            return (this.getPrice() * 2);
        } else {
            return this.getPrice();
        }

    }
}
