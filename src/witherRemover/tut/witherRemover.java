package witherRemover.tut;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class witherRemover extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + getDescription().getName() + " v" + getDescription().getVersion() + " has been enabled.");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Made by Febzey#1854");
        (new BukkitRunnable() {
            public void run() {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "kill @e[type=minecraft:wither_skull]");
            }
        }).runTaskTimer(this, 0, 20*20);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + getDescription().getName() + " v" + getDescription().getVersion() + " has been disabled.");
    }

}