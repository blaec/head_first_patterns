package patterns.command.h_party.command;

import patterns.command.h_party.receiver.Light;

public class LivingroomLightOffCommand implements Command {
	private final Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
