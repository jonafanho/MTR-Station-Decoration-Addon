package top.mcmtr.mod.items;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.mapper.BlockItemExtension;

public class ItemHold extends BlockItemExtension {
    public static final String TAG_HOLD = "hold_num";

    private final int max_count;

    public ItemHold(Block block, ItemSettings itemSettings, int max_count) {
        super(block, itemSettings);
        this.max_count = max_count;
    }
}