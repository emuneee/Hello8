package com.emuneee.mascots.model;

import com.emuneee.mascots.SeenAtPlace;
import com.emuneee.mascots.SeenAtPlaces;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
@SeenAtPlace(name = "Basketball")
@SeenAtPlace(name = "Football")
@SeenAtPlace(name = "Baseball")
public class BlueDevil implements Mascot {

    @Override
    public String getName() {
        return "Blue Devil";
    }

    @Override
    public String getCollege() {
        return "Duke University";
    }

    @Override
    public String getTeamName() {
        return "Blue Devils";
    }

    @Override
    public String getPhrase() {
        return "¯\\_(ツ)_/¯";
    }

    @Override
    public boolean isAnimal() {
        return false;
    }

    @Override
    public String getMascotImageUrl() {
        return "http://img.bleacherreport.net/img/slides/photos/003/580/756/hi-res-16daff21f0c2c791a22724bc68d4c850_crop_north.jpg?w=630&h=420&q=75";
    }
}
