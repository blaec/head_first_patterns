package patterns.command.b_party.command;

import patterns.command.b_party.Light;

public class LightOnCommand implements Command {
	private final Light light;

	public LightOnCommand(Light light) {
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
