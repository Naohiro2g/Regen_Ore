package com.guithub.TeThoLaPot.reore.init.entity;

import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.init.entity.util.TickaleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RegenOreEntity extends BlockEntity implements TickaleBlockEntity {
    private int ticks;

    public RegenOreEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntities.REGEN_ORE_ENTITY.get(), blockPos, blockState);
    }

    @Override
    public void tick() {

            int x = worldPosition.getX();
            int y = worldPosition.getY();
            int z = worldPosition.getZ();

        if (this.level == null || this.level.isClientSide()) {
            return;
        }

        if (this.ticks++ == 100) {
            this.level.removeBlock(new BlockPos(x, y, z), false);
            this.level.setBlock(new BlockPos(x, y, z), ModBlocks.REGENED_ORE.get().defaultBlockState(), 1);
        }
    }
}

