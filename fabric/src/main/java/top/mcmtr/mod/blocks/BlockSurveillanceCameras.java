package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockSurveillanceCameras extends BlockChangeModelBase {
    public BlockSurveillanceCameras() {
        super(BlockHelper.createBlockSettings(true, blockState -> 5), 2);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(6.5, 6.5, 0, 9.5, 16, 13, IBlock.getStatePropertySafe(state, FACING));
    }
}