package dev.bluemethyst.scythejs.kubejs;

import com.blakebr0.cucumber.item.tool.BaseScytheItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ScytheItemBuilder extends HandheldItemBuilder {
    public ScytheItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BaseScytheItem(toolTier, 2, properties -> createItemProperties());
    }
}

