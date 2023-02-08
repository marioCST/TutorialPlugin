package de.mariocst.entutorial.listener;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerAnimationEvent;
import cn.nukkit.network.protocol.AnimatePacket;

public class PunchListener implements Listener {
    @EventHandler
    public void onPunch(PlayerAnimationEvent event) {
        if (event.getAnimationType() != AnimatePacket.Action.SWING_ARM) return;

        event.getPlayer().sendMessage("You've punched!");
    }
}
