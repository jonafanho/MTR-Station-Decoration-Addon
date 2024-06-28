package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockCatenaryWithLongCounterweight extends BlockCatenaryWithModel {
    public BlockCatenaryWithLongCounterweight() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithLongCounterweightEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithLongCounterweightEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithLongCounterweightEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_LONG_COUNTERWEIGHT.get(), blockPos, blockState);
        }
    }
}