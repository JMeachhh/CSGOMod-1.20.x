package net.jake.csgomod.event;

import net.jake.csgomod.block.ModBlocks;
import net.jake.csgomod.block.entity.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "csgomod")
public class ModBlockEventHandler {
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        BlockState state = event.getState();
        Block block = state.getBlock();
        Level world = (Level) event.getLevel();
        BlockPos pos = event.getPos();

        if(world.getBlockEntity(pos) instanceof ArmsDealCaseBlockEntity armsDealCaseBlockEntity){
            if (!armsDealCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(armsDealCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof ChromaTwoCaseBlockEntity chromaTwoCaseBlockEntity){
            if (!chromaTwoCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(chromaTwoCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof DangerZoneCaseBlockEntity dangerZoneCaseBlockEntity){
            if (!dangerZoneCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(dangerZoneCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof DreamsAndNightmaresCaseBlockEntity dreamsAndNightmaresCaseBlockEntity){
            if (!dreamsAndNightmaresCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(dreamsAndNightmaresCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof GammaTwoCaseBlockEntity gammaTwoCaseBlockEntity){
            if (!gammaTwoCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(gammaTwoCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof OperationBravoCaseBlockEntity operationBravoCaseBlockEntity){
            if (!operationBravoCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(operationBravoCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }

        if(world.getBlockEntity(pos) instanceof SpectrumTwoCaseBlockEntity spectrumTwoCaseBlockEntity){
            if (!spectrumTwoCaseBlockEntity.isLocked()){
                event.setCanceled(true);
                block.popResource(world,pos,new ItemStack(spectrumTwoCaseBlockEntity.getSlot().getItem()));
                world.removeBlock(pos,false);
            }
        }
    }
}
