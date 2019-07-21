package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        if (quality > 0) {
            quality = quality - 2;
        }

        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 2;
            }
        }
    }
}
