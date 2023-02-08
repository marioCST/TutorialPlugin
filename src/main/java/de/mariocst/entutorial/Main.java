package de.mariocst.entutorial;

import cn.nukkit.plugin.PluginBase;
import de.mariocst.entutorial.commands.TestCommand;
import de.mariocst.entutorial.listener.PunchListener;

public class Main extends PluginBase {
    @Override
    public void onEnable() {
        this.register();

        this.getLogger().info("Enabled tutorial plugin");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Disabled tutorial plugin");
    }

    public void register() {
        this.getServer().getCommandMap().register("test", new TestCommand());

        this.getServer().getPluginManager().registerEvents(new PunchListener(), this);
    }
}
