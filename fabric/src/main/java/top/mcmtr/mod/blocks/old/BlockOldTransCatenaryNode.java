package top.mcmtr.mod.blocks.old;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import top.mcmtr.mod.BlockEntityTypes;

public final class BlockOldTransCatenaryNode extends BlockOldNodeBase {
    public BlockOldTransCatenaryNode() {
        super();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockOldTransCatenaryNodeEntity(blockPos, blockState);
    }

    public static class BlockOldTransCatenaryNodeEntity extends BlockEntityExtension {
        public BlockOldTransCatenaryNodeEntity(BlockPos blockPos, BlockState blockState) {
            super(BlockEntityTypes.TRANS_CATENARY_NODE.get(), blockPos, blockState);
        }
    }
}