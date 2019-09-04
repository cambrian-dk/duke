package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;

public class DoneCommand extends Command {
    private int taskNumToComplete;

    public DoneCommand(int taskNumToComplete){
        super();
        this.taskNumToComplete = taskNumToComplete;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        if (this.taskNumToComplete <= 0 || taskNumToComplete > tasks.getSize()) {
            throw new DukeException("Task Number is out of bounds");
        }
        tasks.markTaskAsDone(this.taskNumToComplete - 1);
        Task taskToComplete = tasks.getTaskFromList(this.taskNumToComplete - 1);
        ui.messageUser("Nice! I've marked this task as done:",
                "  " + taskToComplete.getTaskStatus());
    }
}
