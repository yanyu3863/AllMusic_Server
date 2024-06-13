package com.coloryr.allmusic.server.side.forge.event;

import com.coloryr.allmusic.server.core.objs.music.MusicObj;
import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.command.ICommandSender;

@Cancelable
public class MusicAddEvent extends Event {
    /**
     * 添加的音乐
     */
    private final MusicObj music;
    /**
     * 添加者
     */
    private final ICommandSender player;

    public MusicAddEvent(MusicObj id, ICommandSender player) {
        this.music = id;
        this.player = player;
    }

    public ICommandSender getPlayer() {
        return player;
    }

    public MusicObj getMusic() {
        return music;
    }
}
