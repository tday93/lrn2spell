package net.lrn2spell.init;

import net.lrn2spell.Lrn2Spell;
import net.lrn2spell.items.SpellingStaffItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class Lrn2SpellItems {

    public static Item SPELLING_STAFF;

    public static void init(){

        SPELLING_STAFF = registerItem(new SpellingStaffItem((new Item.Settings()).itemGroup(ItemGroup.MISC)), "spelling_staff");
    }

    public static Item registerItem(Item item, String name) {

        Registry.register(Registry.ITEM, Lrn2Spell.MODID + ":" + name, item);
        return item;
    }
}
