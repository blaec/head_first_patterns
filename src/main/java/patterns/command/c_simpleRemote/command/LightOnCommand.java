package patterns.command.c_simpleRemote.command;

import patterns.command.c_simpleRemote.receiver.Light;

public class LightOnCommand implements Command {
	private final Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
