package patterns.command.b_party.command;

import patterns.command.b_party.TV;

public class TVOffCommand implements Command {
	private final TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}
}
