package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockCatenaryWithShortTop extends BlockCatenaryWithModel {
    public BlockCatenaryWithShortTop() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithShortTopEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithShortTopEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithShortTopEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_SHORT_TOP.get(), blockPos, blockState);
        }
    }
}