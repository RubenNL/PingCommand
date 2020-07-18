package nl.rubend.pingcommand;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CommandReceiver extends Command {
	public CommandReceiver() {
		super("ping");
	}
	@Override
	public void execute(CommandSender sender, String[] args) {
		ProxiedPlayer player;
		if(args.length>0) player=PingCommand.getPlugin().getProxy().getPlayer(args[0]);
		else player=(ProxiedPlayer) sender;
		if(player==null) sender.sendMessage(new TextComponent("That player is offline."));
		else sender.sendMessage(new TextComponent("The ping of "+player.getName()+" is "+player.getPing()));
	}
}
