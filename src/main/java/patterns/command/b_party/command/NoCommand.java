package patterns.command.b_party.command;

public class NoCommand implements Command {
	@Override public void execute() { }
	@Override public void undo() { }
}
