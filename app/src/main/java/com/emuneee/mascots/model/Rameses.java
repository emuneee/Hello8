package com.emuneee.mascots.model;

import com.emuneee.mascots.SeenAtPlace;
import com.emuneee.mascots.SeenAtPlaces;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
@SeenAtPlace(name = "Basketball")
@SeenAtPlace(name = "Football")
@SeenAtPlace(name = "Baseball")
public class Rameses implements Mascot {

    @Override
    public String getName() {
        return "Rameses";
    }

    @Override
    public String getCollege() {
        return "University of North Carolina at Chapel Hill";
    }

    @Override
    public String getTeamName() {
        return "Tarheels";
    }

    @Override
    public String getPhrase() {
        return "Go Heels";
    }

    @Override
    public boolean isAnimal() {
        return true;
    }

    @Override
    public String getMascotImageUrl() {
        return "http://img.bleacherreport.net/img/slides/photos/003/580/791/hi-res-f648b013a16c9dd950c58009c4fd7975_crop_north.jpg?w=630&h=420&q=75";
    }
}
