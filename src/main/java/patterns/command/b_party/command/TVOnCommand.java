package patterns.command.b_party.command;

import patterns.command.b_party.TV;

public class TVOnCommand implements Command {
	private final TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	@Override
	public void undo() {
		tv.off();
	}
}
