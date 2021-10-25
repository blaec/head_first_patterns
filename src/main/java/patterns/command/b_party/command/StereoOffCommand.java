package patterns.command.b_party.command;

import patterns.command.b_party.receiver.Stereo;

public class StereoOffCommand implements Command {
	private final Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
