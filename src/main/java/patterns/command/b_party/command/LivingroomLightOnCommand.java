package patterns.command.b_party.command;

import patterns.command.b_party.receiver.Light;

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