package nl.rubend.pingcommand;

import net.md_5.bungee.api.plugin.Plugin;

public final class PingCommand extends Plugin {
    static PingCommand plugin;
    static PingCommand getPlugin() {
        return plugin;
    }
    @Override
    public void onEnable() {
        plugin=this;
        getProxy().getPluginManager().registerCommand(this,new CommandReceiver());
    }
}
