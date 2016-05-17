package com.emuneee.mascots;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
public interface Triangler {

    enum TriangleCity {
        RALEIGH,
        DURHAM,
        CHAPEL_HILL
    }

    TriangleCity getCity();
}
