package com.emuneee.mascots.model;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
public interface Mascot {

    String getName();
    String getCollege();
    String getTeamName();
    String getPhrase();
    boolean isAnimal();
    String getMascotImageUrl();

    default boolean isPointing() {
        return true;
    }

    static String getSomeData() {
        return "some data";
    }
}