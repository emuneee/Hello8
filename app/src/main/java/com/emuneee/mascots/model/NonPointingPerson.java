package com.emuneee.mascots.model;

/**
 * Created by WillowTree, Inc on 5/18/16.
 */
public interface NonPointingPerson {

    default boolean isPointing() {
        return false;
    }

}
