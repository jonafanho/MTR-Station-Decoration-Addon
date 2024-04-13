package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockDecorationStair extends BlockChangeModelBase {
    public BlockDecorationStair() {
        super(BlockHelper.createBlockSettings(true).nonOpaque(), 1);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape1 = IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 4, 16, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape shape2 = IBlock.getVoxelShapeByDirection(0, 4, 0, 16, 8, 12, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape shape3 = IBlock.getVoxelShapeByDirection(0, 8, 0, 16, 12, 8, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape shape4 = IBlock.getVoxelShapeByDirection(0, 12, 0, 16, 16, 4, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape shape5 = VoxelShapes.union(shape1, shape2);
        VoxelShape shape6 = VoxelShapes.union(shape3, shape4);
        return VoxelShapes.union(shape5, shape6);
    }
}