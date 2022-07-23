package ambar.strategy;

import ambar.exception.NoFreeSlotAvailableException;

import java.util.TreeSet;

public class NaturalOrderParkingStrategy implements ParkingStrategy{

    TreeSet<Integer> slotTreeSet;

    public NaturalOrderParkingStrategy(TreeSet<Integer> slotTreeSet) {
        this.slotTreeSet = slotTreeSet;
    }

    @Override
    public void getSlot(Integer slotNumber) {
        slotTreeSet.add(slotNumber);
    }

    @Override
    public void removeSlot(Integer slotNumber) {
        slotTreeSet.remove(slotNumber);
    }

    @Override
    public Integer getNextSlot() {
        if(slotTreeSet.isEmpty()){
            throw new NoFreeSlotAvailableException();
        }
        return slotTreeSet.first();
    }
}
