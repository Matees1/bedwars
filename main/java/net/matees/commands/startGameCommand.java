package net.matees.commands;

import net.matees.Main;
import net.matees.logical.Team;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class startGameCommand implements CommandExecutor {
    //   /startgame redteam-player blueteam-player greenteam-player etc

    private HashMap<Team, Location> spawnLocations = new HashMap<Team, Location>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
//            spawnLocations.put(red, new Location(p.getWorld(), -31, 81, -79, 0, 0));
//
//            spawnLocations.put(blue, new Location(p.getWorld(), -32, 81, -79, 0, 0));
//
//            spawnLocations.put(green, new Location(p.getWorld(), 80, 81, -32, 90, 0));
//
//            spawnLocations.put(yellow, new Location(p.getWorld(), 80, 81, -32, 90, 0));
//
//            spawnLocations.put(aqua, new Location(p.getWorld(), 32, 81, 79, 180, 0));
//
//            spawnLocations.put(white, new Location(p.getWorld(), -32, 81, 79, -180, 0));
//
//            spawnLocations.put(pink, new Location(p.getWorld(), -80, 81, 32, -90, 0));
//
//            spawnLocations.put(gray, new Location(p.getWorld(), -80, 81, -32, -90, 0));

            if(p.getName().equals("Matees")){

                switch (args.length) {
                    case 1:
                        Main.tell(p, ChatColor.RED + "Not correct, Please use: " +
                                ChatColor.AQUA + "/startgame player player " +
                                ChatColor.RED + " the players tag is the amount of players that will be playing in the game, can go up to 8"
                        );
                        break;

                    case 2:
                        Main.tell(p, ChatColor.AQUA + "Working on it...");
                }
            }else{
                Main.tell(p, ChatColor.RED + "You must be the great matees to access this command :)");
            }
        }else{
            sender.sendMessage(ChatColor.RED + "Must be a player to access this command");
        }
        return true;
    }

}