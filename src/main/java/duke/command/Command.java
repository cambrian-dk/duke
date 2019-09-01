package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public abstract class Command {
    protected boolean isExit;
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
    public Command(){
        isExit = false;
    }
    public boolean isExit(){
        return isExit;
    }
}
