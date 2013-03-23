package com.gnorsilva;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int currentFloor;
    private final List<Integer> nextDestinations = new ArrayList<Integer>();

    public Elevator(int floor) {
        this.currentFloor = floor;
    }

    public int currentFloor() {
        return currentFloor;
    }

    public List<Integer> nextDestinations() {
        return nextDestinations;
    }

    public void setNextDestination(int floor) {
        nextDestinations.add(floor);
    }
}
