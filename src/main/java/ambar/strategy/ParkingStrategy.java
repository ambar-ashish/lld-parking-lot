package ambar.strategy;

public interface ParkingStrategy {

    void getSlot(Integer slotNumber);

    void removeSlot(Integer slotNumber);

    Integer getNextSlot();

}
