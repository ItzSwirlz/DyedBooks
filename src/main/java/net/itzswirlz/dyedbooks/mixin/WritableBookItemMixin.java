package net.itzswirlz.dyedbooks.mixin;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.WritableBookItem;

import org.spongepowered.asm.mixin.Mixin;

// Makes WritableBookItem inherit the DyeableItem interface, which will make all books have the same properties of a dyeable item like leather armor
@Mixin(WritableBookItem.class)
public abstract class WritableBookItemMixin implements DyeableItem {
}
