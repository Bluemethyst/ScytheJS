package dev.bluemethyst.scythejs.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;

public class Plugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
    }
}