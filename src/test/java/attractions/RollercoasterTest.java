package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(19, 2.1, 40.0);
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
    public void isAllowedTo__ReturnsTrue(){
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isAllowedTo__ReturnsFalse(){
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void priceFor__ReturnsDoubleForTallVisitor(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void priceFor__ReturnsDefaultPriceForNotTallVisitor(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }
}
