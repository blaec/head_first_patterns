package patterns.command.g_undo.command;

import patterns.command.g_undo.command.Command;

public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
