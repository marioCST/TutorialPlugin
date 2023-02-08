package de.mariocst.entutorial.commands;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class TestCommand extends Command {
    public TestCommand() {
        super("test", "Test command", "test");
        this.setPermission("mario.test");
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        sender.sendMessage("Test command executed successfully!");

        return true;
    }
}
