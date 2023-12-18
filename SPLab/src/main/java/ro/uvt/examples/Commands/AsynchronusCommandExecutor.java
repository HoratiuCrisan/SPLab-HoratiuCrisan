package ro.uvt.examples.Commands;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronusCommandExecutor implements CommandExecutor{
    private ExecutorService executorService;

    public AsynchronusCommandExecutor() {
        this.executorService = Executors.newFixedThreadPool(5);
    }

    @Override
    public void executeCommand(Command command) {
        executorService.submit(() -> {
            command.execute();
        });
    }

    public void shutDown() {
        executorService.shutdown();
    }
}
