package com.gnorsilva;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ElevatorControllerShould {

    @Test
    public void not_move_an_idle_elevator_when_the_request_is_from_that_floor() throws Exception {
        Elevator elevator = new Elevator(0);
        Controller controller = new Controller(elevator);
        Request request = new Request(0, Direction.UP);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(EMPTY_LIST));
    }

    @Test
    public void send_an_idle_elevator_to_a_floor_where_a_request_happens() throws Exception {
        Elevator elevator = new Elevator(4);
        Controller controller = new Controller(elevator);
        Request request = new Request(3, Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floor(3)));
    }

    @Test
    public void add_an_extra_destination_floor_after_the_current_one_when_an_elevator_is_already_moving() throws Exception {
        Elevator elevator = new Elevator(2);
        elevator.setNextDestination(3);
        Controller controller = new Controller(elevator);
        Request request = new Request(4, Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(3, 4)));
    }

    private <T> List<T> floor(T floor) {
        return floors(floor);
    }

    private <T> List<T> floors(T ... floors) {
        return Arrays.asList(floors);
    }

}
