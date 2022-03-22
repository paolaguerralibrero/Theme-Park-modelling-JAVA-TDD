package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRollerCoaster(){
        visitor = new Visitor(18,1.50, 5);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, rollerCoaster.getPrice(), 0.01);
    }

    @Test
    public void chargesDoubleToPeopleOver200cm(){
        visitor = new Visitor(19,3.5,30);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }
}
