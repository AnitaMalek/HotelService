package sda.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel(){
        rooms.add(new Room(1, 2, true, false));
        rooms.add(new Room(2, 6, false, true));
        rooms.add(new Room(3, 4, false, true));
        rooms.add(new Room(4, 3, true, false));
        rooms.add(new Room(5, 3, true, false));
        rooms.add(new Room(6, 2, true, true));
        rooms.add(new Room(7, 2, true, true));
        rooms.add(new Room(8, 8, false, false));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
