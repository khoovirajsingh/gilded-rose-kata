package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void updateQuality() {
        String[] item = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] sellIn = {-1, 0, 1, 2, 6, 7, 11};
        Integer[] quality = {0, 1, 49, 50};
        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                item,
                sellIn,
                quality
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}
