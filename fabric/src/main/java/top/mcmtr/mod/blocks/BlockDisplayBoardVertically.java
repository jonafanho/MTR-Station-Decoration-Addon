package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockDisplayBoardVertically extends BlockChangeModelBase {

    public BlockDisplayBoardVertically() {
        super(BlockHelper.createBlockSettings(true, blockState -> 5).nonOpaque(), 6);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape1 = IBlock.getVoxelShapeByDirection(3, 0, 4, 13, 8, 12, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape shape2 = IBlock.getVoxelShapeByDirection(3, 8, 4, 13, 16, 10, IBlock.getStatePropertySafe(state, FACING));
        return VoxelShapes.union(shape1, shape2);
    }
}