import attractions.Attraction;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Playground playground;
    TobaccoStall tobaccoStall;


    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void themeParkHasAttractions(){
        themePark.addAttraction(playground);
        assertEquals(1,themePark.countAttractions());
    }
    @Test
    public void themeParkHasAStalls(){
        themePark.addAStall(tobaccoStall);
        assertEquals(1,themePark.countStalls());
    }



}
