import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;
    private int visitCount;

    public ThemePark() {
        this.allReviewed = new ArrayList<IReviewed>();
        this.visitCount = 0;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.allReviewed;
    }

    public int getVisitCount() {
        return this.visitCount;
    }
}
