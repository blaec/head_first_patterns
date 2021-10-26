package patterns.command.g_undo.command;

public interface Command {
	void execute();
	void undo();
}
