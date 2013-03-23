package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if (elevator.currentFloor().isNot(request.floor)) {
            if (elevator.isMoving() && request.floor.isBetween(elevator.currentFloor(), elevator.nextDestination())) {
                elevator.setNextDestination(request.floor);
            } else {
                elevator.queueFutureDestination(request.floor);
            }
        }
    }
}
