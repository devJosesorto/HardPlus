package com.hardplus.plugin.items;

import java.util.Set;
import org.bukkit.Material;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Jose
 */
public class ArmorHardPlus {

    public void FullNtherite(CreatureSpawnEvent e,float dropchance) {
        ItemsHardPlus marco=new ItemsHardPlus();
        EntityEquipment equipment=e.getEntity().getEquipment(); 
        
        equipment.clear();
        equipment.setHelmet(new ItemStack(Material.NETHERITE_HELMET, 1));
        equipment.setHelmetDropChance(dropchance);
        equipment.setChestplate(new ItemStack(Material.NETHERITE_CHESTPLATE, 1));
        equipment.setChestplateDropChance(dropchance);
        equipment.setLeggings(new ItemStack(Material.NETHERITE_LEGGINGS, 1));
        equipment.setLeggingsDropChance(dropchance);
        equipment.setBoots(new ItemStack(Material.NETHERITE_BOOTS, 1));
        equipment.setBootsDropChance(dropchance);
equipment.setItemInOffHand(marco.Marco(3));
equipment.setItemInOffHandDropChance(1f);

        
    }

}
