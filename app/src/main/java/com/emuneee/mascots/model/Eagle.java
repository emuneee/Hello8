package com.emuneee.mascots.model;

import com.emuneee.mascots.SeenAtPlace;
import com.emuneee.mascots.SeenAtPlaces;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
@SeenAtPlace(name = "Basketball")
@SeenAtPlace(name = "Football")
public class Eagle implements Mascot, NonPointingPerson {

    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public String getCollege() {
        return "North Carolina Central University";
    }

    @Override
    public String getTeamName() {
        return "Eagles";
    }

    @Override
    public String getPhrase() {
        return "Eagle Pride!";
    }

    @Override
    public boolean isAnimal() {
        return true;
    }

    @Override
    public String getMascotImageUrl() {
        return "https://c2.staticflickr.com/6/5477/10235085714_fa5e5a8817_b.jpg";
    }

    @Override
    public boolean isPointing() {
        return NonPointingPerson.super.isPointing();
    }
}
