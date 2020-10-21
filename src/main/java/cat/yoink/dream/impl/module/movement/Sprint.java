package cat.yoink.dream.impl.module.movement;

import cat.yoink.dream.api.module.Category;
import cat.yoink.dream.api.module.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * @author yagel15637
 */
public class Sprint extends Module {
    public Sprint(String name, String description, Category category) {
        super(name, description, category);
    }

    @SubscribeEvent
    public void onUpdate(final TickEvent.ClientTickEvent event) {
        if (!mc.player.isSprinting()) {
            mc.player.setSprinting(true);
        }
    }
}