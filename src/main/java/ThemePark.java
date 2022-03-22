import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addAttraction(Playground playground) {
        this.attractions.add(playground);
    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public void addAStall(TobaccoStall tobaccoStall) {
        this.stalls.add(tobaccoStall);
    }

    public int countStalls() {
        return this.stalls.size();
    }

    public void getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<>();
    }
}
