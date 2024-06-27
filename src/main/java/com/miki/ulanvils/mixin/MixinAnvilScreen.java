package com.miki.ulanvils.mixin;

import net.minecraft.client.gui.screens.inventory.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreen.class)
public class MixinAnvilScreen {
    @ModifyConstant(method = "renderLabels", constant = @Constant(intValue = 40))
    private int removeLimit(int i) {
        return Integer.MAX_VALUE;
    }
}
