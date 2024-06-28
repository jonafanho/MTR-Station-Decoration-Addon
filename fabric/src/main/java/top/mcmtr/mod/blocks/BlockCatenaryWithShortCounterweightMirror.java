package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public class BlockCatenaryWithShortCounterweightMirror extends BlockCatenaryWithModel {
    public BlockCatenaryWithShortCounterweightMirror() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockCatenaryWithShortCounterweightMirrorEntity(blockPos, blockState);
    }

    public static final class BlockCatenaryWithShortCounterweightMirrorEntity extends BlockCatenaryWithModelEntity {
        public BlockCatenaryWithShortCounterweightMirrorEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.CATENARY_WITH_SHORT_COUNTERWEIGHT_MIRROR.get(), blockPos, blockState);
        }
    }
}
