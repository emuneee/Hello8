package com.emuneee.mascots.model;

/**
 * Created by WillowTree, Inc on 5/12/16.
 */
public class MascotUtil {

    public static String getFullCollegeName(Mascot mascot) {
        return String.format("%s %s", mascot.getCollege(), mascot.getTeamName());
    }

}
