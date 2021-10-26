package patterns.command.h_party.command;

import patterns.command.h_party.receiver.Light;

public class LivingroomLightOnCommand implements Command {
	private final Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
