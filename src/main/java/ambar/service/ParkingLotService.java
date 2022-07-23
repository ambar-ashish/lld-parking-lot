package ambar.service;

import com.uditagarwal.exception.ParkingLotException;
import com.uditagarwal.model.ParkingLot;
import com.uditagarwal.model.parking.strategy.ParkingStrategy;

public class ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

    public void createParkingLot(final ParkingLot parkingLot, final ParkingStrategy parkingStrategy) {
        if (this.parkingLot != null) {
            throw new ParkingLotException("Parking lot already exists.");
        }
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;
        for (int i = 1; i <= parkingLot.getCapacity(); i++) {
            parkingStrategy.addSlot(i);
        }
    }

}
