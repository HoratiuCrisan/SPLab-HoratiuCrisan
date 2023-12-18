package ro.uvt.examples.Commands;

import ro.uvt.info.splab.Book;

public class CommandInvoker {
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
