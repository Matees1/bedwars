package net.matees;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static void tell(Player player, String message){
        player.sendMessage(message);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
