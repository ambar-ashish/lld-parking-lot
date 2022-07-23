package ambar.commands;


import ambar.driver.OutputPrinter;
import ambar.exception.InvalidCommandException;
import ambar.service.ParkingLotService;
import com.uditagarwal.model.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {

    private Map<String, CommandExecutor> commands = new HashMap<>();

    public CommandExecutorFactory(final ParkingLotService parkingLotService) {
        final OutputPrinter outputPrinter = new OutputPrinter();
        commands.put(
                CreateParkingLotCommandExecutor.COMMAND_NAME,
                new CreateParkingLotCommandExecutor(parkingLotService, outputPrinter));
        commands.put(
                ColorToRegNumberCommandExecutor.COMMAND_NAME,
                new ColorToRegNumberCommandExecutor(parkingLotService, outputPrinter));
    }

    public CommandExecutor getCommandExecutor(final Command command) {
        final CommandExecutor commandExecutor = commands.get(command.getCommandName());
        if (commandExecutor == null) {
            throw new InvalidCommandException();
        }
        return commandExecutor;
    }
}
