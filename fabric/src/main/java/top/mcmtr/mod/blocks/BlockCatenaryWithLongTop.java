package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public final class BlockCatenaryWithLongTop extends BlockCatenaryWithModel {
    public BlockCatenaryWithLongTop() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithLongTopEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithLongTopEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithLongTopEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_LONG_TOP.get(), blockPos, blockState);
        }
    }
}