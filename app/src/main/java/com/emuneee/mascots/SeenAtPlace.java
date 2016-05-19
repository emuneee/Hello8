package com.emuneee.mascots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by WillowTree, Inc on 5/11/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Repeatable(SeenAtPlaces.class)
public @interface SeenAtPlace {
    String name() default "";
}
