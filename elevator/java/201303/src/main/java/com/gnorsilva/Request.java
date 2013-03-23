package com.gnorsilva;

public class Request {
    public final Floor floor;
    public final Direction direction;

    public Request(Floor floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }
}
