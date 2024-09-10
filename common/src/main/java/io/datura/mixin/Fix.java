package io.datura.mixin;

import net.minecraft.client.font.Glyph;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Glyph.class)
public interface Fix {
    @Inject(method = "getBoldOffset", at = @At("RETURN"), cancellable = true)
    default void fix(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.5f);
    }
}