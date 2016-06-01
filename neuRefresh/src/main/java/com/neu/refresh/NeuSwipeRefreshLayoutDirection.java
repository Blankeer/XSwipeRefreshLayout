package com.neu.refresh;

/**
 * Created by oliviergoutay on 1/23/15.
 */
public enum NeuSwipeRefreshLayoutDirection {

    TOP(0),
    BOTTOM(1),
    BOTH(2),
    NONE(3);
    private int mValue;

    NeuSwipeRefreshLayoutDirection(int value) {
        this.mValue = value;
    }

    public static NeuSwipeRefreshLayoutDirection getFromInt(int value) {
        for (NeuSwipeRefreshLayoutDirection direction : NeuSwipeRefreshLayoutDirection.values()) {
            if (direction.mValue == value) {
                return direction;
            }
        }
        return BOTH;
    }

}
