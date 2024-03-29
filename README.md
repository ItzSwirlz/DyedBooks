# Dyed Books
Small Minecraft mod that allows you to dye books like you can with leather armor.

The title and description says it all! You can dye books by combining a book and dyes together.

The mod does not 'add' new items - it simply adjusts the book item itself. Because of this, if the world is loaded without the mod present, these books *should* not disappear since the book still exists in the game. (I have yet to test this). If you have a modded world that you continously upgrade along with new of Minecraft, this is a great addition. You won't lose your books on an upgrade if you forget to load this mod.

## How does this work?
This is actually not too complicated - we make the book item implement an interface in the code called `DyeableItem`, which is exactly what it sounds like. This interface is what leather armor items has, that makes it possible for the item to have NBT data to make it 'dyed' and store color values. Then, just create a recipe to make the books dyeable, and with a registration to the client's item color handler, that's the mod. This is basically how dying leather armor works - it's just applied to books.

## Notes/Future Features/Current Bugs:
- **Possible inaccuracies**
    - Some dyes (like white or yellow) may not appear as bright as it should, so the tinted overlay texture may need to be *slightly* adjusted a little.

- **Note**: Written Book Textures
    - The "Written Book" texture in the game's resource pack is actually **not** the same as a regular book or a book and quill. It's slightly darker. It's just hard to notice because of the glint. For now, the model is the same as the book so its a bit more consistent if you have another way to remove the glint, so you don't have to play eeny-meeny-miny-moe with it after you spent time finding what color tint you want for your book. Same goes for the book and quill.

- The GUI: Do we want to change the 'red' color around it according to the dye?
    - This is an interesting question! Because when you make a book cover, or technically 'dye' a book, you don't want to ruin the pages. If you were making a cover then it would go on *top* of the base book, which is kind of what this mod is doing in the background. So... I'm open to discussion.
- Enchanted Books
    - I feel like the only reason people would do this is client side, but there are probably texture packs or other mods that just show the enchantment on the texture so you dont have to struggle through a chest to find your specific enchantment. 
- Mod compatibility
    - Other than *maybe* Patchouli, I haven't found a consistently up-to-date with vanilla Minecraft, a mod that contains a replica of the 'book' item. If I do, compatibility for this would be fun and easy, so if you find something, let me know (or make a pull request, contributions are welcome!)

## License
The directory structure is the same as the Quilt Template Mod, which is CC0. This mod is licensed under the GNU General Public License v3.0 or later.