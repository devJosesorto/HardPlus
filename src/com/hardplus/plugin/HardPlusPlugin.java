//IMPORTACIONES DENTRO DEL PROYECTO
package com.hardplus.plugin;

import com.hardplus.plugin.comandos.ComandosHardPlus;
import com.hardplus.plugin.eventos.EventosHardPlus;

//IMPORTACIONES JAVA
import java.io.File;

//IMPORTACIONES jar EXTERNAS
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;

public class HardPlusPlugin extends JavaPlugin implements Listener {

    //OBTENIENDO DATOS DE ARCHIVO "plugin.yml"
    public PluginDescriptionFile pdffile = getDescription();
    public String version = pdffile.getVersion();
    public String nombre = pdffile.getName();

    //RUTA DE ARCHIVO DE CONFIGURACION
    public String rutaconfig;

    //ESTABLECIENDO EJECUTOR DE COMANDOS
    public ComandosHardPlus comando = new ComandosHardPlus(this);
    
    public EventosHardPlus eventos = new EventosHardPlus(this);

    //HABILITAR EL PLUGIN
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "====" + ChatColor.DARK_RED + nombre + " " + ChatColor.AQUA + version + " [Enable] ====");
        //ACTIVADOR DE EVENTOS, NECECITA EL "implements Listener" EN LA CLASE PRINCIPAL
        Bukkit.getPluginManager().registerEvents(this, this);
        
        Bukkit.getPluginManager().registerEvents(eventos, this);
       
        RegistarComandos();
    }

    //DESHABLITAR EL PLUGIN
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "====" + ChatColor.DARK_RED + nombre + " " + ChatColor.AQUA + version + "  [Disable] ====");
    }

    //METODO EJECUTOR DE COMANDOS
    public void RegistarComandos() {
        this.getCommand("hardplus").setExecutor(comando);
    }

    public void registerConfig() {
        File config = new File(this.getDataFolder(), "config.yml");
        rutaconfig = config.getPath();
        if (!(config.exists())) {
            this.getConfig().options().copyDefaults(true);
            saveConfig();
        }

    }

}
