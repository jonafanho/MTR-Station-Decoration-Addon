package top.mcmtr.mod.blocks;

import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;
import top.mcmtr.mod.BlockEntityTypes;

public final class BlockStandingSign extends BlockCustomTextBase {
    public BlockStandingSign() {
        super(BlockHelper.createBlockSettings(true, blockState -> 8), 3, 2);
    }

    @NotNull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(6.9, 1, 0, 9.1, 16, 11, IBlock.getStatePropertySafe(state, FACING));
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockStandingSignEntity(blockPos, blockState, getMaxArrivals());
    }

    public static final class BlockStandingSignEntity extends BlockCustomTextEntity {
        public BlockStandingSignEntity(BlockPos blockPos, BlockState blockState, int maxArrivals) {
            super(BlockEntityTypes.STANDING_SIGN.get(), blockPos, blockState, maxArrivals);
        }
    }
}
