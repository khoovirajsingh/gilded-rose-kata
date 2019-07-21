package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void update() {
        incrementQuality();
        decrementSellin();
        updateExpired();
    }

    @Override
    void updateExpired() {
        if (sellIn < 0) {
            incrementQuality();
        }
    }
}
