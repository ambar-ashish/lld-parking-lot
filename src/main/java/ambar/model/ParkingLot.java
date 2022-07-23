package ambar.model;


import ambar.exception.ParkingLotException;
import com.uditagarwal.model.Slot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private static int MAX_CAPACITY = 10000;
    private int capacity;
    private Map<Integer, Slot> slots;

    public ParkingLot(int capacity){
        if(capacity > MAX_CAPACITY || capacity <= 0){
            throw new ParkingLotException("Capacity is invalid");
        }
        this.capacity = capacity;
        this.slots = new HashMap<>();
    }

}
