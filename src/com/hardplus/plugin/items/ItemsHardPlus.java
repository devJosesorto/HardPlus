//IMPORTACIONES DENTRO DEL PROYECTO
package com.hardplus.plugin.items;

//IMPORTACIONES EXTERNAS
import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author Jose
 */
public class ItemsHardPlus {

    public ItemsHardPlus() {
    }

    
    public ItemStack hachacutre(int n) {
        //MATERIAL DEL OBJETO
        Material m = Material.IRON_AXE;
        //NOMBRE DEL OBJETO
        String name = "Hacha Cutre";
        //DESCRIPCION DEL OBJETO
        String desc = "Lo mismo pero igual de malo";

        //CREACION DEL OBJETO
        ItemStack item = new ItemStack(m, n);

        //META DATOS DEL OBJETO
        ItemMeta itemmeta = item.getItemMeta();

        //CREANDO EL LORE
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(desc);
        itemmeta.setLore(lore);
        //SETEO DEL NOMBRE
        itemmeta.setDisplayName(name);
        //OCULTAR ENCANTAMIENTOS
        itemmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        //OCULTAR ATRIBUTOS
        itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        //AGREGAR ENCANTAMIENTOS
        itemmeta.addEnchant(Enchantment.KNOCKBACK, 1, true);

        //SETEO DE LOS METADATOS DEL OBJETO
        item.setItemMeta(itemmeta);

        return item;
    }

    public ItemStack MegaArco(int n) {
        //MATERIAL DEL OBJETO
        Material m = Material.BOW;
        //NOMBRE DEL OBJETO
        String name = "Arco-TNT";
        //DESCRIPCION DEL OBJETO
        String desc = "Al golper a una entidad provoca un explocion en el individuo";

        //CREACION DEL OBJETO
        ItemStack item = new ItemStack(m, n);

        //META DATOS DEL OBJETO
        ItemMeta itemmeta = item.getItemMeta();

        //CREANDO EL LORE
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(desc);
        itemmeta.setLore(lore);
        //SETEO DEL NOMBRE
        itemmeta.setDisplayName(name);
        //OCULTAR ENCANTAMIENTOS
        //itemmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        //OCULTAR ATRIBUTOS
        //itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        //AGREGAR ENCANTAMIENTOS
        itemmeta.addEnchant(Enchantment.ARROW_DAMAGE, 15, true);

        //SETEO DE LOS METADATOS DEL OBJETO
        item.setItemMeta(itemmeta);

        return item;
    }

    public ItemStack Marco(int n) {
        //MATERIAL DEL OBJETO
        Material m = Material.GOLD_NUGGET;
        //NOMBRE DEL OBJETO
        String name = "Marco";
        //DESCRIPCION DEL OBJETO
        String desc = "Moneda oficial del server";

        //CREACION DEL OBJETO
        ItemStack item = new ItemStack(m, n);

        //META DATOS DEL OBJETO
        ItemMeta itemmeta = item.getItemMeta();

        //CREANDO EL LORE
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(desc);
        itemmeta.setLore(lore);
        //SETEO DEL NOMBRE
        itemmeta.setDisplayName(name);
        //OCULTAR ENCANTAMIENTOS
        itemmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        //OCULTAR ATRIBUTOS
        //itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        //AGREGAR ENCANTAMIENTOS
        itemmeta.addEnchant(Enchantment.ARROW_DAMAGE, 15, true);

        //SETEO DE LOS METADATOS DEL OBJETO
        item.setItemMeta(itemmeta);

        return item;
    }

}
