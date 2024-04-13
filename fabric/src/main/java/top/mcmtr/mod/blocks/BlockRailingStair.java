package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockRailingStair extends BlockChangeModelBase {
    public BlockRailingStair() {
        super(BlockHelper.createBlockSettings(true).nonOpaque(), 4);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 1, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING));
    }
}