package top.mcmtr.mod.blocks.old;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.tool.HolderBase;
import top.mcmtr.mod.Blocks;
import top.mcmtr.mod.blocks.BlockCatenaryNode;

import java.util.List;

public abstract class BlockOldNodeBase extends BlockExtension implements BlockWithEntity {
    public static final BooleanProperty IS_CONNECTED = BooleanProperty.of("is_connected");

    public BlockOldNodeBase() {
        super(BlockHelper.createBlockSettings(false));
    }

    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()) {
            if (player.isHolding(org.mtr.mod.Items.BRUSH.get())) {
                final boolean isConnected = state.get(new Property<>(IS_CONNECTED.data));
                world.breakBlock(pos, false);
                world.setBlockState(pos, Blocks.NEW_CATENARY_NODE.get().getDefaultState().with(new Property<>(BlockCatenaryNode.IS_CONNECTED.data), isConnected));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(IS_CONNECTED);
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }
}