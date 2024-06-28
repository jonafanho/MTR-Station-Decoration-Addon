package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public final class BlockCatenaryWithLong extends BlockCatenaryWithModel {
    public BlockCatenaryWithLong() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithLongEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithLongEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithLongEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_LONG.get(), blockPos, blockState);
        }
    }
}