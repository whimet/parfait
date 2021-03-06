package com.custardsource.parfait;

/**
 * Possible semantics of the individual values of a metric. This is used by some
 * output mechanisms to associate metadata with a particular value, do rate
 * conversion, etc etc.
 */
public enum ValueSemantics {
    /**
     * A value which never (or very seldom) changes over the lifetime of a
     * virtual machine. Examples might be maximum heap size, JVM version, etc.
     */
    CONSTANT,
    /**
     * Values which freely and arbitrarily change over time, either upwards or
     * downwards. Examples might include Java heap memory in use, number of
     * currently-logged-on users, etc.
     */
    FREE_RUNNING,
    /**
     * Values which only ever increase over time during the life of a metric.
     * Examples may include total number of Java Garbage Collections executed,
     * or the total number of users to have logged on to the application since
     * startup.
     */
    MONOTONICALLY_INCREASING;
}
