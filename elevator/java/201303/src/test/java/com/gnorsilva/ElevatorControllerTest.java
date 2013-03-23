package com.gnorsilva;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ElevatorControllerTest {

    @Test
    public void idle_elevator_on_the_ground_floor__ground_floor_request_going_up__elevator_should_not_move() throws Exception {
        Elevator elevator = new Elevator(0, Moving.STOPPED);
        Controller controller = new Controller(elevator);
        Request request = new Request(0, Moving.UP);
        controller.handle(request);
        assertThat(elevator.movement(), is(Moving.STOPPED));
        assertThat(elevator.destination(), is(0));
    }

    @Test
    public void idle_elevator_on_the_first_floor__ground_floor_request_going_up__elevator_should_come_down() throws Exception {
        Elevator elevator = new Elevator(1, Moving.STOPPED);
        Controller controller = new Controller(elevator);
        Request request = new Request(0, Moving.UP);
        controller.handle(request);
        assertThat(elevator.movement(), is(Moving.DOWN));
        assertThat(elevator.destination(), is(0));
    }

    @Test
    public void idle_elevator_on_the_ground_floor__second_floor_request_going_down__elevator_should_come_up() throws Exception {
        Elevator elevator = new Elevator(0, Moving.STOPPED);
        Controller controller = new Controller(elevator);
        Request request = new Request(2, Moving.DOWN);
        controller.handle(request);
        assertThat(elevator.movement(), is(Moving.UP));
        assertThat(elevator.destination(), is(2));
    }

    @Test
    public void moving_up_elevator_on_the_second_floor__fourth_floor_request_going_down__elevator_should_come_up() throws Exception {
        Elevator elevator = new Elevator(2, Moving.UP);
        Controller controller = new Controller(elevator);
        Request request = new Request(4, Moving.DOWN);
        controller.handle(request);
        assertThat(elevator.movement(), is(Moving.UP));
        assertThat(elevator.destination(), is(4));
    }

    private class Elevator {
        private int floor;
        private Moving moving;

        public Elevator(int floor, Moving idle) {
            this.floor = floor;
        }

        public Moving movement() {
            return moving;
        }

        public int destination() {
            return floor;
        }
    }

    private class Request {
        public final int floor;
        public final Moving moving;

        public Request(int floor, Moving moving) {
            this.floor = floor;
            this.moving = moving;
        }
    }

    enum Moving {
        STOPPED, UP, DOWN
    }

    private class Controller {
        private Elevator elevator;

        public Controller(Elevator elevator) {
            this.elevator = elevator;
        }

        public void handle(Request request) {
            if (elevator.floor == request.floor) {
                elevator.moving = Moving.STOPPED;
            } else {
                elevator.moving = elevator.floor < request.floor ? Moving.UP : Moving.DOWN;
            }

            elevator.floor = request.floor;
        }
    }
}
