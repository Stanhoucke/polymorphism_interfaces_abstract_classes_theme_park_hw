import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark() {
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.allReviewed;
    }

    public void addReviewed(IReviewed reviewed){
        this.allReviewed.add(reviewed);
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addVisitedAttraction(attraction);
        attraction.incrementVisitCount();
    }

    public int countAllReviewed() {
        return this.allReviewed.size();
    }
}
