package abstraction.season;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Season> seasons = new ArrayList<>();

        Season summer = new Season("Summer", 25, "July","August","September");
        Season winter = new Season("Summer", 5, "October","November","December","January");
        Season spring = new Season("Summer", 12, "February","March","April","May");

        seasons.add(summer);
        seasons.add(winter);
        seasons.add(spring);
    }
}
