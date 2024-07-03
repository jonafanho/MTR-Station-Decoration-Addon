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
        final int index = state.get(new Property<>(TYPE.data));
        if(index == 4){
            return this.isMirror ?
                    IBlock.getVoxelShapeByDirection(13, 0, 0, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING)) :
                    IBlock.getVoxelShapeByDirection(0, 0, 0, 3, 24, 3, IBlock.getStatePropertySafe(state, FACING));
        }
        if(index == 5) {
            VoxelShape voxelShape1;
            VoxelShape voxelShape2;
            if(this.isMirror) {
                voxelShape1 = IBlock.getVoxelShapeByDirection(1, 0, 1, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING));
                voxelShape2 = IBlock.getVoxelShapeByDirection(1, 0, 1, 3, 24, 16, IBlock.getStatePropertySafe(state, FACING));
            } else {
                voxelShape1 = IBlock.getVoxelShapeByDirection(0, 0, 1, 15, 24, 3, IBlock.getStatePropertySafe(state, FACING));
                voxelShape2 = IBlock.getVoxelShapeByDirection(13, 0, 1, 15, 24, 16, IBlock.getStatePropertySafe(state, FACING));
            }
            return VoxelShapes.union(voxelShape1,voxelShape2);
        }
        return IBlock.getVoxelShapeByDirection(0, 0, 1, 16, 24, 3, IBlock.getStatePropertySafe(state, FACING));
    }
}