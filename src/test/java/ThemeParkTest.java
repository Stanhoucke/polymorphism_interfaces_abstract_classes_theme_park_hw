import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import behaviours.ISecurity;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;
    Visitor visitor1;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
        visitor1 = new Visitor(16, 1.5, 40.0);
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
    public void canShowAllReviews(){
        themePark.addReviewed(rollerCoaster);
        themePark.addReviewed(dodgems);

        HashMap<String, Integer> reviews = new HashMap<String, Integer>();
        reviews.put(rollerCoaster.getName(), rollerCoaster.getRating());
        reviews.put(dodgems.getName(), dodgems.getRating());

        assertEquals(reviews, themePark.showAllReviews());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor1, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor1.countVisitedAttractions());
    }

    @Test
    public void canGetAllAllowedForVisitor(){
        themePark.addReviewed(rollerCoaster);
        themePark.addReviewed(dodgems);
        themePark.addReviewed(tobaccoStall);

        int countAllowedReviewed = themePark.getAllAllowedFor(visitor1).size();
        assertEquals(2, countAllowedReviewed);
    }

}
