package ambar.commands;

import ambar.driver.OutputPrinter;
import ambar.service.ParkingLotService;
import com.uditagarwal.model.Command;

public abstract class CommandExecutor {

    protected ParkingLotService parkingLotService;
    protected OutputPrinter outputPrinter;

    public CommandExecutor(ParkingLotService parkingLotService, OutputPrinter outputPrinter) {
        this.parkingLotService = parkingLotService;
        this.outputPrinter = outputPrinter;
    }

    public abstract boolean validate(Command command);

    public abstract void execute(Command command);
}
