package com.guithub.TeThoLaPot.reore.init.entity.util;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;

public interface TickaleBlockEntity {
    void tick();

    public static <T extends BlockEntity>BlockEntityTicker<T> getTickerHelper(Level pLevel){
        return pLevel.isClientSide() ? null : (level, blockPos, blockState, blockEntity) -> ((TickaleBlockEntity)blockEntity).tick();
    }
}
