package com.gnorsilva;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ControllerShould {

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
    public void queue_a_destination_floor_when_an_elevator_is_already_moving_to_a_floor() throws Exception {
        Elevator elevator = new Elevator(2);
        elevator.queueFutureDestination(3);
        Controller controller = new Controller(elevator);
        Request request = new Request(4, Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(3, 4)));
    }

    @Test
    public void send_a_moving_elevator_to_a_requested_floor_first_if_its_on_the_way_to_the_next_destination_floor() throws Exception {
        Elevator elevator = new Elevator(5);
        elevator.queueFutureDestination(1);
        Controller controller = new Controller(elevator);
        Request request = new Request(3, Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(3, 1)));
    }

    private List<Integer> floor(Integer floor) {
        return floors(floor);
    }

    private List<Integer> floors(Integer ... floors) {
        return Arrays.asList(floors);
    }

}
