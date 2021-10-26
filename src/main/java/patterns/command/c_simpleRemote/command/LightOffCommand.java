package patterns.command.c_simpleRemote.command;

import patterns.command.c_simpleRemote.receiver.Light;

public class LightOffCommand implements Command {
	private final Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
}
