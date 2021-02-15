import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    Visitor visitor1;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAllReviewed(){
        assertEquals(new ArrayList<IReviewed>(), themePark.getAllReviewed());
    }

    @Test
    public void canAddReviewed(){
        themePark.addReviewed(rollerCoaster);
        assertEquals(1, themePark.countAllReviewed());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor1, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor1.countVisitedAttractions());
    }

}
