package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockCatenaryWithLongCounterweightMirror extends BlockCatenaryWithModel {
    public BlockCatenaryWithLongCounterweightMirror() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithLongCounterweightMirrorEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithLongCounterweightMirrorEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithLongCounterweightMirrorEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_LONG_COUNTERWEIGHT_MIRROR.get(), blockPos, blockState);
        }
    }
}
