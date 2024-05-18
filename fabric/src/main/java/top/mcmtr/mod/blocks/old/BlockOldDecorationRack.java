package top.mcmtr.mod.blocks.old;

import net.minecraft.block.FacingBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.tool.HolderBase;

import java.util.List;

public final class BlockOldDecorationRack extends BlockExtension {
    public static final DirectionProperty FACING = new DirectionProperty(FacingBlock.FACING);

    public BlockOldDecorationRack() {
        super(BlockHelper.createBlockSettings(true).nonOpaque());
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
    }
}