package com.emuneee.mascots.model;

import com.emuneee.mascots.SeenAtPlace;
import com.emuneee.mascots.SeenAtPlaces;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
@SeenAtPlace(name = "Basketball")
@SeenAtPlace(name = "Football")
@SeenAtPlace(name = "Baseball")
public class MrWuf implements Mascot {

    @Override
    public String getName() {
        return "Mr. Wuf";
    }

    @Override
    public String getCollege() {
        return "North Carolina State University";
    }

    @Override
    public String getTeamName() {
        return "Wolfpack";
    }

    @Override
    public String getPhrase() {
        return "Go Pack!";
    }

    @Override
    public boolean isAnimal() {
        return true;
    }

    @Override
    public String getMascotImageUrl() {
        return "https://www.cals.ncsu.edu/agcomm/magazine/latest-news-spring-2010/thumbs/mr_wuf_pointing.jpg";
    }

}
