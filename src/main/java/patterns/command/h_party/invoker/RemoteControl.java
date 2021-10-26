package patterns.command.h_party.invoker;

import patterns.command.h_party.command.Command;
import patterns.command.h_party.command.NoCommand;

//
// This is the invoker
//
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommand;
    public static final int COMMAND_COUNT = 7;

    public RemoteControl() {
        onCommands = new Command[COMMAND_COUNT];
        offCommands = new Command[COMMAND_COUNT];

        Command noCommand = new NoCommand();
        for (int i = 0; i < COMMAND_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < COMMAND_COUNT; i++) {
            String commandMessage = String.format("[slot %d] %s    %s",
                    i, getClassName(onCommands[i]), getClassName(offCommands[i]));
            stringBuilder.append(commandMessage)
                         .append("\n");
        }
        String undoMessage = String.format("[undo] %s", getClassName(undoCommand));
        stringBuilder.append(undoMessage)
                     .append("\n");
        return stringBuilder.toString();
    }

    private String getClassName(Command command) {
        return command.getClass().getName();
    }
}
