package net.jake.csgomod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.TickingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BombBlockEntity extends BlockEntity{
    private static final int ticksBeforeExplosion = 45 * 20;
    private int ticks = 0;

    public BombBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.BOMB_BE.get(), pPos, pBlockState);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        if (!level.isClientSide()) {
            bombPlaced();
        }
    }

    private void bombPlaced() {

    }


    public void tick(){
        if (!level.isClientSide()) {
            ticks++;
            if (ticks >= ticksBeforeExplosion){
                bombExplode();
            }
        }
    }

   private void bombExplode(){
        level.explode(null,this.worldPosition.getX() + 0.5, this.worldPosition.getY() + 0.5, this.worldPosition.getZ() + 0.5, 10, Level.ExplosionInteraction.BLOCK);
        level.removeBlock(worldPosition, false);
   }
}
