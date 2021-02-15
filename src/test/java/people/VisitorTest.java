package people;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorTest {

    Visitor visitor1;
    Visitor visitor2;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(19, 2.1, 40.0);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor1.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor1.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor1.getMoney(), 0.1);
    }

    @Test
    public void hasVisitedAttractions(){
        assertEquals(new ArrayList<Attraction>(), visitor1.getVisitedAttractions());
    }

    @Test
    public void canAddAttraction(){
        visitor1.addVisitedAttraction(dodgems);
        visitor1.addVisitedAttraction(rollerCoaster);
        assertEquals(2, visitor1.countVisitedAttractions());
    }


}
