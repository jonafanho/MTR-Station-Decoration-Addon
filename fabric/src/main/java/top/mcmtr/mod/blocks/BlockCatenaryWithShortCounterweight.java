package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockCatenaryWithShortCounterweight extends BlockCatenaryWithModel {
    public BlockCatenaryWithShortCounterweight() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithShortCounterweightEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithShortCounterweightEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithShortCounterweightEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_SHORT_COUNTERWEIGHT.get(), blockPos, blockState);
        }
    }
}
