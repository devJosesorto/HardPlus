//IMPORTACIONES DENTRO DEL PROYECTO
package com.hardplus.plugin.eventos;

import com.hardplus.plugin.HardPlusPlugin;
import com.hardplus.plugin.items.ArmorHardPlus;
import com.hardplus.plugin.items.ItemsHardPlus;
import org.bukkit.entity.Entity;

//IMPORTACIONES EXTERNAS
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

/**
 *
 * @author Jose
 */
public class EventosHardPlus implements Listener {

    private HardPlusPlugin plugin;

    ItemsHardPlus objetos = new ItemsHardPlus();
    ArmorHardPlus armor = new ArmorHardPlus();

    public EventosHardPlus(HardPlusPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void mobSpanw(CreatureSpawnEvent e) {
        int r = random();

        if (e.getEntity() instanceof Zombie) {
            if (r > 80) {
                armor.FullNtherite(e, 0);
                Zombie zombie = (Zombie) e.getEntity();
                zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 78000, 3));
            } else {
            }
        }

        if (e.getEntity() instanceof Skeleton) {
            if (r > 0) {
                armor.FullNtherite(e, 0);
                EntityEquipment equipment = e.getEntity().getEquipment();
                equipment.setItemInMainHand(objetos.MegaArco(1));
                equipment.setItemInMainHandDropChance(1);
                
                
                
                e.getEntity().setArrowCooldown(2);
                
            }

        }

    }

    @EventHandler
    public void mobmuere(EntityDeathEvent e) {

        LivingEntity entidad = e.getEntity();

        if (entidad instanceof Zombie) {

        }

    }

    /*@EventHandler
    public static void processSkeletonArrows(ArrowBodyCountChangeEvent e) {
        LivingEntity fecha = e.getEntity();

        e.setNewAmount(0);
        e.getEntity().getWorld().createExplosion(fecha.getLocation(), 1);

        System.out.println("Amount new: " + e.getNewAmount());
        System.out.println("Amount old: " + e.getOldAmount());
        System.out.println("name event: " + e.getEventName());
        System.out.println("entity living: " + fecha.getName());
        

    }*/
    @EventHandler
    public void alv(EntityShootBowEvent e) {

        
        System.out.println("Arco: " + e.getBow());

        System.out.println("Proyectil: " + e.getProjectile());
        
        System.out.println("Velocidad: " + e.getProjectile().getVelocity());
        
        if(e.getBow().getItemMeta().getDisplayName().equalsIgnoreCase("Arco-TNT")){
            Vector vector= new Vector();
            float velocidad=5f;
            
            vector.setX(e.getProjectile().getVelocity().getX()*velocidad);
            vector.setY(e.getProjectile().getVelocity().getY()*velocidad);
            vector.setZ(e.getProjectile().getVelocity().getZ()*velocidad);
            
            e.getProjectile().setVelocity(vector);
            e.getProjectile().setGlowing(true);
            //e.getEntity().getWorld().createExplosion(e.getProjectile().getLocation(), 1);
        
        }
        
        

    }

    public int random() {
        return ((int) (Math.random() * 100));
    }

}
