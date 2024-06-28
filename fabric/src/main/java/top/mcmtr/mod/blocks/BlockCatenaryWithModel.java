package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import top.mcmtr.core.data.OffsetPosition;
import top.mcmtr.mod.Init;
import top.mcmtr.mod.packet.MSDPacketDeleteData;
import top.mcmtr.mod.packet.MSDPacketOpenCatenaryWithModelScreen;

import java.util.List;

public abstract class BlockCatenaryWithModel extends BlockNodeBase implements DirectionHelper {
    @Override
    public void onBreak2(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient()) {
            MSDPacketDeleteData.sendDirectlyToServerCatenaryNodePosition(ServerWorld.cast(world), Init.blockPosToPosition(pos));
        }
    }

    @Override
    public BlockRenderType getRenderType2(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(IS_CONNECTED);
    }

    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return getDefaultState2().with(new Property<>(IS_CONNECTED.data), false).with(new Property<>(FACING.data), ctx.getPlayerFacing().data);
    }

    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> {
            final BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity != null && blockEntity.data instanceof BlockCatenaryWithModel.BlockCatenaryWithModelEntity) {
                Init.REGISTRY.sendPacketToClient(ServerPlayerEntity.cast(player), new MSDPacketOpenCatenaryWithModelScreen(pos, state.get(new Property<>(IS_CONNECTED.data))));
            }
        });
    }

    public static abstract class BlockCatenaryWithModelEntity extends BlockNodeBaseEntity {
        private static final String KEY_OFFSET_POSITION = "msd_offset_position_";
        private static final String KEY_ROTATE_POSITION = "msd_rotate_position_";
        private final OffsetPosition offsetPosition;
        private final OffsetPosition rotation;

        public BlockCatenaryWithModelEntity(BlockEntityType<?> type, BlockPos blockPos, BlockState blockState) {
            super(type, blockPos, blockState);
            this.offsetPosition = new OffsetPosition(0, 0, 0);
            this.rotation = new OffsetPosition(0, 0, 0);
        }

        public void setOffsetPosition(OffsetPosition offsetPosition, OffsetPosition rotation) {
            this.offsetPosition.setX(offsetPosition.getX());
            this.offsetPosition.setY(offsetPosition.getY());
            this.offsetPosition.setZ(offsetPosition.getZ());
            this.rotation.setX(rotation.getX());
            this.rotation.setY(rotation.getY());
            this.rotation.setZ(rotation.getZ());
            markDirty2();
        }

        public OffsetPosition getOffsetPosition() {
            return this.offsetPosition;
        }

        public OffsetPosition getRotation() {
            return this.rotation;
        }

        @Override
        public void readCompoundTag(CompoundTag compoundTag) {
            this.offsetPosition.setX(compoundTag.getDouble(KEY_OFFSET_POSITION + "x"));
            this.offsetPosition.setY(compoundTag.getDouble(KEY_OFFSET_POSITION + "y"));
            this.offsetPosition.setZ(compoundTag.getDouble(KEY_OFFSET_POSITION + "z"));
            this.rotation.setX(compoundTag.getDouble(KEY_ROTATE_POSITION + "x"));
            this.rotation.setY(compoundTag.getDouble(KEY_ROTATE_POSITION + "y"));
            this.rotation.setZ(compoundTag.getDouble(KEY_ROTATE_POSITION + "z"));
        }

        @Override
        public void writeCompoundTag(CompoundTag compoundTag) {
            compoundTag.putDouble(KEY_OFFSET_POSITION + "x", this.offsetPosition.getX());
            compoundTag.putDouble(KEY_OFFSET_POSITION + "y", this.offsetPosition.getY());
            compoundTag.putDouble(KEY_OFFSET_POSITION + "z", this.offsetPosition.getZ());
            compoundTag.putDouble(KEY_ROTATE_POSITION + "x", this.rotation.getX());
            compoundTag.putDouble(KEY_ROTATE_POSITION + "y", this.rotation.getY());
            compoundTag.putDouble(KEY_ROTATE_POSITION + "z", this.rotation.getZ());
        }
    }
}