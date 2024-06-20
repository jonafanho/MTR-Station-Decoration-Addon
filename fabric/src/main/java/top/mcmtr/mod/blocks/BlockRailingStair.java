package top.mcmtr.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;

public final class BlockRailingStair extends BlockChangeModelBase {
    private final boolean isMirror;

    public BlockRailingStair(boolean isMirror) {
        super(BlockHelper.createBlockSettings(true).nonOpaque(), 5);
        this.isMirror = isMirror;
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(new Property<>(TYPE.data)) == 4 ?
                (this.isMirror ? IBlock.getVoxelShapeByDirection(13, 0, 0, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING)) : IBlock.getVoxelShapeByDirection(0, 0, 0, 3, 24, 3, IBlock.getStatePropertySafe(state, FACING))) : IBlock.getVoxelShapeByDirection(0, 0, 1, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING));
    }
}