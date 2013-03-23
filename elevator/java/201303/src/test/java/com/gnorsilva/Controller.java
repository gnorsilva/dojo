package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if (elevator.currentFloor() != request.floor) {
            elevator.setNextDestination(request.floor);
        }
    }
}
