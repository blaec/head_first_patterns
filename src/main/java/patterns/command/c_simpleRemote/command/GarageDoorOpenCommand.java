package patterns.command.c_simpleRemote.command;

import patterns.command.c_simpleRemote.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private final GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
}
