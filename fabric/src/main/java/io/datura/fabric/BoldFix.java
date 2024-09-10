package io.datura.fabric;

import net.fabricmc.api.ModInitializer;

public final class BoldFix implements ModInitializer {
    @Override
    public void onInitialize() {
        io.datura.BoldFix.init();
    }
}
