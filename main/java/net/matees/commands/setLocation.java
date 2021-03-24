package net.matees.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setLocation implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {

        }else{
            sender.sendMessage(ChatColor.RED + "Please use args: " + ChatColor.LIGHT_PURPLE + "[ spawnLocation | shopkeeperLocation | upgradeLocation | genLocation |  ");
        }
        return true;
    }
}
