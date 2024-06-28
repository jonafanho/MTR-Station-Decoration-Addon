package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public final class BlockCatenaryWithShort extends BlockCatenaryWithModel {
    public BlockCatenaryWithShort() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithShortEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithShortEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithShortEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_SHORT.get(), blockPos, blockState);
        }
    }
}