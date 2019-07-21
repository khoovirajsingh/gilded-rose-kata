package com.gildedrose;

public class Sulfurus extends Item {
    public Sulfurus(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        super.doUpdateQuality();
    }
}
