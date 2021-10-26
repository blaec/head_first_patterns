package patterns.command.h_party.command;

import patterns.command.h_party.receiver.Stereo;

public class StereoOnCommand implements Command {
	private final Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
