package com.guithub.TeThoLaPot.reore.event;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import com.guithub.TeThoLaPot.reore.tag.RegenTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.server.level.ServerLevel;

@Mod.EventBusSubscriber(modid = RE_Ore.MOD_ID)
public class BreakEvent {
    @SubscribeEvent
    public static void blockBreak(BlockEvent.BreakEvent event){

        LevelAccessor levelAccessor = event.getLevel();
        ServerLevel level = (ServerLevel) levelAccessor;
        Player player = event.getPlayer();
        BlockPos pos = event.getPos();
        BlockPos pos1 = pos.north();
        BlockPos pos2 = pos.south();

        if (!player.isCreative()){
            // if (state.is(RegenTags.Blocks.CAN_REGEN)){
            System.out.println("BREAK!");
            level.setBlock(pos, ModBlocks.TEST_ORE.get().defaultBlockState(), 2);
            level.setBlock(pos1, Blocks.SEA_LANTERN.defaultBlockState(), 2);
            level.setBlock(pos2, Blocks.SEA_LANTERN.defaultBlockState(), 2);
        }
    }
}
