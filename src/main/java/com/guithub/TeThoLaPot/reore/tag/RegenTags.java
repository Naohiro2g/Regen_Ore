package com.guithub.TeThoLaPot.reore.tag;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class RegenTags {
    public static class Blocks{
        public static final TagKey<Block> CAN_REGEN = tag("can_regen");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(RE_Ore.MOD_ID, name));
        }

    }
}
