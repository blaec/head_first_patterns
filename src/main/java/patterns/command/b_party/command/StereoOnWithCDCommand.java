package patterns.command.b_party.command;

import patterns.command.b_party.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
	private final Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
