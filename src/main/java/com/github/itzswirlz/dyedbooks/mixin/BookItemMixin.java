package com.github.itzswirlz.dyedbooks.mixin;

import net.minecraft.item.BookItem;
import net.minecraft.item.DyeableItem;
import org.spongepowered.asm.mixin.Mixin;

// Makes BookItem inherit the DyeableItem interface, which will make all books have the same properties of a dyeable item like leather armor
@Mixin(BookItem.class)
public abstract class BookItemMixin implements DyeableItem {
}
