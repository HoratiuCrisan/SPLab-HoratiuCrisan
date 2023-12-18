package ro.uvt.examples.Commands;

public class SynchronousCommandExecutor implements CommandExecutor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
