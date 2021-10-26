package patterns.command.h_party.command;

import patterns.command.h_party.receiver.Hottub;

public class HottubOnCommand implements Command {
	private final Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}

	@Override
	public void undo() {
		hottub.off();
	}
}
