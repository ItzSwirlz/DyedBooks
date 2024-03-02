package com.github.itzswirlz.dyedbooks;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.Items;

public class DyedBooksClient implements ClientModInitializer {

	// Here, we just need to tell the game to register all book items as the generic color provider.
    @Override
	public void onInitializeClient(ModContainer mod) {
         ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			return tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack);
		 }, Items.BOOK, Items.WRITABLE_BOOK, Items.WRITTEN_BOOK);
	}
}
