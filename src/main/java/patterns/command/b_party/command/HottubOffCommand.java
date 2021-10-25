package patterns.command.b_party.command;

import patterns.command.b_party.receiver.Hottub;

public class HottubOffCommand implements Command {
	private final Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
	}
}
