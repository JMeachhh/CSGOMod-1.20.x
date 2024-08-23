package net.jake.csgomod.block.entity;


import net.jake.csgomod.item.ModItems;
import net.jake.csgomod.screen.BaseCaseMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BaseCaseBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(7);
    private static final int OUTPUT_SLOT = 0;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int openTime = 0;
    private int maxOpenTime = 140;


    public BaseCaseBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.BASE_CASE_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                     case 0 -> BaseCaseBlockEntity.this.openTime;
                     case 1 -> BaseCaseBlockEntity.this.maxOpenTime;
                     default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> BaseCaseBlockEntity.this.openTime = pValue;
                    case 1 -> BaseCaseBlockEntity.this.maxOpenTime = pValue;

                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        ItemStack result = caseDrop();
        this.itemHandler.setStackInSlot(OUTPUT_SLOT,new ItemStack(result.getItem()));
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++){
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level,this.worldPosition, inventory);
    }
    @Override
    public Component getDisplayName() {
        return Component.translatable("block.csgomod.base_case");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new BaseCaseMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("base_case.openTime", openTime);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        openTime = pTag.getInt("base_case.openTime");
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
            if(dropTaken()) {
                pLevel.destroyBlock(pPos, false);
            }
        }

    private ItemStack caseDrop() {
        RandomSource random = RandomSource.create();
        Item randomItem = dropList().get(random.nextInt(dropList().size()));
        ItemStack result = new ItemStack(randomItem);
        return result;
    }

    private List<Item> dropList() {
        List<Item> drops = new ArrayList<>();
        drops.add(ModItems.BUTTERFLY_KNIFE.get());
        drops.add(ModItems.DEFUSE_KIT.get());
        return drops;
    }


//    private void dropItem(Item item) {
//        Vec3 vec3 = Vec3.atLowerCornerWithOffset(getBlockPos(), 0.5D, 1.01D, 0.5D).offsetRandom(this.level.random, 0.7F);
//        ItemStack itemStack = new ItemStack(item);
//        ItemEntity itemEntity = new ItemEntity(this.level, vec3.x(), vec3.y(), vec3.z(), itemStack);
//        this.level.addFreshEntity(itemEntity);
//    }


    private boolean dropTaken() {
        if(this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty()){
            return true;
        }
        return false;
    }

}
