import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void hasAllReviewed(){
        assertEquals(new ArrayList<IReviewed>(), themePark.getAllReviewed());
    }

    @Test
    public void hasVisitCount(){
        assertEquals(0, themePark.getVisitCount());
    }

}
