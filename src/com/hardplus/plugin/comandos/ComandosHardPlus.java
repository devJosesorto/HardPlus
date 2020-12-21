//IMPORTACIONES DENTRO DEL PROYECTO
package com.hardplus.plugin.comandos;

import com.hardplus.plugin.HardPlusPlugin;

//IMPORTACIONES EXTERNAS
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ComandosHardPlus implements CommandExecutor {

    private HardPlusPlugin plugin;

    //CONSTRUCTOR DE LA CLASE
    public ComandosHardPlus(HardPlusPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if (!(cs instanceof Player)) {
            //CONSOLA DEL SERVER
            Bukkit.getConsoleSender().sendMessage("Mensaje desde la consola");
            return false;

        } else {

            //JUGARDOR DEL SERVIDOR
            Player player = (Player) cs;

            if (strings[0].equalsIgnoreCase("alv")) {
                player.sendMessage("Vales verga xd");

            } else {
                player.sendMessage("Mensaje desde jugador");

            }
            return true;

        }

    }

}
