package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * Represents a command to exit Duke.
 */
public class ExitCommand extends Command {
    /**
     * Constructor for ExitCommand sets isExit to true.
     * This is because ExitCommand is an exit command.
     */
    public ExitCommand() {
        super();
        this.isExit = true;
    }

    /**
     * Executes the ExitCommand.
     *
     * @param tasks   The user's current TaskList
     * @param ui      The ui currently being used by the user
     * @param storage The storage object being used by the user
     * @throws DukeException If there is an error trying to carry out the ExitCommand.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.messageUser("Bye. Hope to see you again soon!");
    }
}
