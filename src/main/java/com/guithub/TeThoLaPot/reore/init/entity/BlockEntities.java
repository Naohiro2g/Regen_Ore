package com.guithub.TeThoLaPot.reore.init.entity;

import com.guithub.TeThoLaPot.reore.RE_Ore;
import com.guithub.TeThoLaPot.reore.init.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RE_Ore.MOD_ID);

    public static final RegistryObject<BlockEntityType<RegenOreEntity>> REGEN_ORE_ENTITY =
            BLOCK_ENTITIES.register("regen_ore_entity",
                    () -> BlockEntityType.Builder.of(RegenOreEntity::new, ModBlocks.REGEN_ORE_ENTITY.get()).build(null));
}
