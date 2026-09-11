package at.Airushmeos.noVillagerTrading;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoVillagerTrading extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);

        getLogger().info("=================================");
        getLogger().info("NoVillagerTrading gestartet");
        getLogger().info("Villager-Trading ist deaktiviert.");
        getLogger().info("Wandering-Trader-Trading ist deaktiviert.");
        getLogger().info("=================================");
    }

    @Override
    public void onDisable() {

        getLogger().info("NoVillagerTrading beendet.");
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {

        Entity entity = event.getRightClicked();

        /*
         * Normale Villager blockieren
         */
        if (entity instanceof Villager) {

            event.setCancelled(true);

            return;
        }

        /*
         * Wandering Trader ebenfalls blockieren
         */
        if (entity instanceof WanderingTrader) {

            event.setCancelled(true);
        }
    }
}