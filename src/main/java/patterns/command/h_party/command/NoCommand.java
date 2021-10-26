package patterns.command.h_party.command;

public class NoCommand implements Command {
	@Override public void execute() { }
	@Override public void undo() { }
}
