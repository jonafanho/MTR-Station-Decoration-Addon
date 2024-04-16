package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockDecorationCeilingLight extends BlockChangeModelBase {
    public BlockDecorationCeilingLight() {
        super(BlockHelper.createBlockSettings(true, blockState -> 15).nonOpaque(), 1);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0.0, 7.0, 0.0, 16.0, 10.0, 16.0, IBlock.getStatePropertySafe(state, FACING));
    }
}